package com.glue_si.aiolos.service;

import static org.junit.Assert.*;

import org.dbflute.bhv.readable.CBCall;
import org.dbflute.cbean.result.ListResultBean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.glue_si.aiolos.constants.SystemCodeConstants.Flag;
import com.glue_si.aiolos.dbflute.cbean.QuestionCB;
import com.glue_si.aiolos.dbflute.exbhv.ChallengeDetailHistoryBhv;
import com.glue_si.aiolos.dbflute.exbhv.ChallengeHistoryBhv;
import com.glue_si.aiolos.dbflute.exbhv.QuestionBhv;
import com.glue_si.aiolos.dbflute.exentity.ChallengeHistory;
import com.glue_si.aiolos.dbflute.exentity.Question;
import com.glue_si.aiolos.form.challenge.ChallengeForm;

import mockit.Deencapsulation;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class ChallengeServiceTest {

    // テスト対象のサービスクラス
    ChallengeService challengeService = new ChallengeService();

    // テスト対象クラスで@Autowiredしているものは@Mockedを宣言する
    @Mocked
    QuestionBhv questionBhv;

    @Mocked
    ChallengeHistoryBhv challengeHistoryBhv;

    @Mocked
    ChallengeDetailHistoryBhv challengeDetailHistoryBhv;

    @Before
    public void setUp() throws Exception {
        Deencapsulation.setField(challengeService, questionBhv);
        Deencapsulation.setField(challengeService, challengeHistoryBhv);
        Deencapsulation.setField(challengeService, challengeDetailHistoryBhv);
    }

    @Test
    public void storeTest() {

        // mockの返却の設定
        Integer nextVal = 999;

        ChallengeHistory challengeHistory = new ChallengeHistory();
        challengeHistory.setChallengeHistoryId(nextVal);

        // mockの設定
        new Expectations() {{
            challengeHistoryBhv.selectNextVal();      result = nextVal;
            questionBhv.selectList((CBCall<QuestionCB>)any); result = createDummyQuestionList();
            challengeHistoryBhv.insert((ChallengeHistory)any);

        }};

        // テストメソッドのパラメータの作成
        ChallengeForm form = new ChallengeForm();
        form.setUserName("hoge");
        form.setAnswer(new String[]{"register,update"});
        form.setEndTime(954L);
        form.setStartTime(123L);


        // テスト対象メソッドの実行
        Integer result = challengeService.store(form);

        // 結果の検証
        assertEquals(nextVal, new Integer(nextVal));

        new Verifications(){{
            ChallengeHistory challengeHistory;
            challengeHistoryBhv.insert(challengeHistory = withCapture());
            assertEquals(challengeHistory.getChallengeHistoryId() ,nextVal);
        }};
    }

    ListResultBean<Question> createDummyQuestionList() {

        ListResultBean<Question> questionList = new ListResultBean<Question>();

        Question question = new Question();
        question.setDeleteFlag(Flag.OFF.isBoolValue());
        question.setDescription("Description" + questionList.size());
        question.setKeyword("Keyword" +questionList.size());
        question.setOrderNum(questionList.size());
        question.setQuestionId(questionList.size());
        questionList.add(question);

        question = new Question();
        question.setDeleteFlag(Flag.OFF.isBoolValue());
        question.setDescription("Description" + questionList.size());
        question.setKeyword("Keyword" +questionList.size());
        question.setOrderNum(questionList.size());
        question.setQuestionId(questionList.size());

        return questionList;
    }


}
