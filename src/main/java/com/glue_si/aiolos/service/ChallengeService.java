package com.glue_si.aiolos.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

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

    public ListResultBean<Question> findQuestionByGenre(Integer genreId) {
        return questionBhv.selectList(cb-> {
            cb.query().setGenreId_Equal(genreId);
            cb.query().addOrderBy_QuestionNum_Asc();
        });
    }

    public Integer store(ChallengeForm form) {

        ChallengeHistory challengeHistory = new ChallengeHistory();
        challengeHistory.setChallengeHistoryId(challengeHistoryBhv.selectNextVal());

        ListResultBean<Question> questionList = findQuestionByGenre(form.getGenreId());

        List<ChallengeDetailHistory> challengeDetailHistoryList = new ArrayList<ChallengeDetailHistory>();
        int correctCount = 0;
        int incorrectCount = 0;
        for (int i = 0; i < form.getAnswer().length; i++) {
            for (Question question : questionList) {
                if (question.getQuestionId() == i) {

                    ChallengeDetailHistory challengeDetailHistory = new ChallengeDetailHistory();
                    challengeDetailHistory.setQuestionId(i);
                    challengeDetailHistory.setAnswer(form.getAnswer()[i]);
                    challengeDetailHistory.setChallengeHistoryId(challengeHistory.getChallengeHistoryId());

                    if (StringUtils.isNotEmpty(form.getAnswer()[i])) {
                        if (StringUtils.equals(question.getAnswerBranchNo(), form.getAnswer()[i])) {
                            challengeDetailHistory.setCorrectFlag(true);
                            correctCount++;
                        } else {
                            challengeDetailHistory.setCorrectFlag(false);
                            incorrectCount++;
                        }
                        challengeDetailHistoryList.add(challengeDetailHistory);
                    }
                }
            }
        }

        challengeHistory.setGenreId(form.getGenreId());
        challengeHistory.setCorrectSum(correctCount);
        challengeHistory.setIncorrectSum(incorrectCount);
        if (CollectionUtils.isEmpty(challengeDetailHistoryList)) {
            challengeHistory.setAttendanceRate(0);
        } else {
            challengeHistory.setAttendanceRate(correctCount * 100 / challengeDetailHistoryList.size());
        }

        challengeHistory.setUserName(form.getUserName());
        challengeHistory.setDetailCleanFlag(false);
        challengeHistory.setElapsedTime(form.getEndTime() - form.getStartTime());
        challengeHistory.setScore(calcScore(correctCount, incorrectCount));

        challengeHistoryBhv.insert(challengeHistory);
        challengeDetailHistoryBhv.batchInsert(challengeDetailHistoryList);

        return challengeHistory.getChallengeHistoryId();
    }

    private BigDecimal calcScore(int correctCount, int incorrectCount) {

        BigDecimal incorrectCountScore = new BigDecimal(incorrectCount * 0.25);
        BigDecimal correctCountScore = new BigDecimal(correctCount);

        BigDecimal score = correctCountScore.subtract(incorrectCountScore);

        return score;
    }

    public void cleaningDetailHistory() {
        List<Integer> cleaningHistoryIdList = new ArrayList<Integer>();
        LocalDateTime today = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        challengeHistoryBhv.selectList(cb->{
            cb.query().setDetailCleanFlag_Equal(false);
            cb.query().setRegisterDatetime_LessThan(today.minusDays(1));
        }).forEach(entity->{
            cleaningHistoryIdList.add(entity.getChallengeHistoryId());
        });

        if (!CollectionUtils.isEmpty(cleaningHistoryIdList)) {
            ChallengeHistory challengeHistory = new ChallengeHistory();
            challengeHistory.setDetailCleanFlag(true);
            challengeHistoryBhv.queryUpdate(challengeHistory, cb->{
                cb.query().setChallengeHistoryId_InScope(cleaningHistoryIdList);
            });
            challengeDetailHistoryBhv.queryDelete(cb->{
                cb.query().setChallengeHistoryId_InScope(cleaningHistoryIdList);
            });
        }
    }
}
