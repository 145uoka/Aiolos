package com.glue_si.aiolos.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glue_si.aiolos.dbflute.exbhv.ChallengeDetailHistoryBhv;
import com.glue_si.aiolos.dbflute.exbhv.ChallengeHistoryBhv;
import com.glue_si.aiolos.dbflute.exbhv.QuestionBhv;
import com.glue_si.aiolos.dbflute.exentity.ChallengeDetailHistory;
import com.glue_si.aiolos.dbflute.exentity.ChallengeHistory;
import com.glue_si.aiolos.dbflute.exentity.Question;
import com.glue_si.aiolos.form.challenge.ChallengeForm;

@Service
@Transactional(rollbackFor = Exception.class)
public class ChallengeService {

    @Autowired
    QuestionBhv questionBhv;

    @Autowired
    ChallengeHistoryBhv challengeHistoryBhv;

    @Autowired
    ChallengeDetailHistoryBhv challengeDetailHistoryBhv;

    private static final Logger logger = LoggerFactory.getLogger(ChallengeService.class);

    public Integer store(ChallengeForm form) {

        ChallengeHistory challengeHistory = new ChallengeHistory();
        challengeHistory.setChallengeHistoryId(challengeHistoryBhv.selectNextVal());

        ListResultBean<Question> questionList = questionBhv.selectList(cb-> {
            cb.query().addOrderBy_OrderNum_Asc();
        });

        List<ChallengeDetailHistory> challengeDetailHistoryList = new ArrayList<ChallengeDetailHistory>();
        int correctCount = 0;
        for (int i = 0; i < form.getAnswer().length; i++) {
            for (Question question : questionList) {
                if (question.getQuestionId() == i) {

                    ChallengeDetailHistory challengeDetailHistory = new ChallengeDetailHistory();
                    challengeDetailHistory.setQuestionId(i);
                    challengeDetailHistory.setAnswer(form.getAnswer()[i]);
                    challengeDetailHistory.setChallengeHistoryId(challengeHistory.getChallengeHistoryId());

                    if (StringUtils.equals(question.getKeyword(), form.getAnswer()[i])) {
                        challengeDetailHistory.setCorrectFlag(true);
                        correctCount++;
                    } else {
                        challengeDetailHistory.setCorrectFlag(false);
                    }
                    challengeDetailHistoryList.add(challengeDetailHistory);
                }
            }
        }

        challengeHistory.setCorrectSum(correctCount);
        challengeHistory.setAttendanceRate(correctCount * 100 / challengeDetailHistoryList.size());
        challengeHistory.setUserName(form.getUserName());
        challengeHistory.setElapsedTime(form.getEndTime() - form.getStartTime());

        int score = calcScore(challengeHistory.getAttendanceRate(), challengeHistory.getElapsedTime(),
                challengeDetailHistoryList.size());
        challengeHistory.setScore(score);

        challengeHistoryBhv.insert(challengeHistory);
        challengeDetailHistoryBhv.batchInsert(challengeDetailHistoryList);

        return challengeHistory.getChallengeHistoryId();
    }

    private int calcScore(int attendanceRate, Long elapsedTime, int questionNum) {

        BigDecimal baseScore = new BigDecimal(attendanceRate * 100);
        BigDecimal elapsedTimeBigDecimal = new BigDecimal(elapsedTime * 100);

        BigDecimal questionNumDiv = new BigDecimal(questionNum * 2000);
        BigDecimal minusScore = elapsedTimeBigDecimal.divide(questionNumDiv, 0, RoundingMode.HALF_UP);
        minusScore = minusScore.multiply(new BigDecimal(10));
        BigDecimal score = baseScore.subtract(minusScore);

        return score.intValue();
    }
}
