package com.glue_si.aiolos.service;

import static org.junit.Assert.*;

import org.dbflute.cbean.result.ListResultBean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.glue_si.aiolos.dbflute.exbhv.ChallengeDetailHistoryBhv;
import com.glue_si.aiolos.dbflute.exbhv.ChallengeHistoryBhv;
import com.glue_si.aiolos.dbflute.exbhv.QuestionBhv;
import com.glue_si.aiolos.dbflute.exentity.Question;
import com.glue_si.aiolos.form.challenge.ChallengeForm;

import mockit.Deencapsulation;
import mockit.Expectations;
import mockit.Mocked;
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
    public void getSkillsTest() {

        Integer nextVal = 999;

        ListResultBean<Question> questionList = new ListResultBean<Question>();
        Question question = new Question();
        question.setQuestionId(0);
        question.setKeyword("register");
        questionList.add(question);

        new Expectations() {{
            challengeHistoryBhv.selectNextVal();      result = nextVal;
            challengeService.findAllQuestion(); result = questionList;
        }};

        ChallengeForm form = new ChallengeForm();
        form.setUserName("hoge");
        form.setAnswer(new String[]{"register,update"});
        form.setEndTime(954L);
        form.setStartTime(123L);


        // テスト対象メソッドの実行と、結果の検証
        Integer result = challengeService.store(form);
        assertEquals(nextVal, result);
    }


}
