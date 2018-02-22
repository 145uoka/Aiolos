package com.glue_si.aiolos.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.glue_si.aiolos.dbflute.allcommon.*;
import com.glue_si.aiolos.dbflute.cbean.*;
import com.glue_si.aiolos.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of challenge_detail_history.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsChallengeDetailHistoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsChallengeDetailHistoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "challenge_detail_history";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @param histroyDetailId The value of histroyDetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHistroyDetailId_Equal(Integer histroyDetailId) {
        doSetHistroyDetailId_Equal(histroyDetailId);
    }

    protected void doSetHistroyDetailId_Equal(Integer histroyDetailId) {
        regHistroyDetailId(CK_EQ, histroyDetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @param histroyDetailId The value of histroyDetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHistroyDetailId_NotEqual(Integer histroyDetailId) {
        doSetHistroyDetailId_NotEqual(histroyDetailId);
    }

    protected void doSetHistroyDetailId_NotEqual(Integer histroyDetailId) {
        regHistroyDetailId(CK_NES, histroyDetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @param histroyDetailId The value of histroyDetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHistroyDetailId_GreaterThan(Integer histroyDetailId) {
        regHistroyDetailId(CK_GT, histroyDetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @param histroyDetailId The value of histroyDetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHistroyDetailId_LessThan(Integer histroyDetailId) {
        regHistroyDetailId(CK_LT, histroyDetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @param histroyDetailId The value of histroyDetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHistroyDetailId_GreaterEqual(Integer histroyDetailId) {
        regHistroyDetailId(CK_GE, histroyDetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @param histroyDetailId The value of histroyDetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHistroyDetailId_LessEqual(Integer histroyDetailId) {
        regHistroyDetailId(CK_LE, histroyDetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of histroyDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of histroyDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setHistroyDetailId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setHistroyDetailId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of histroyDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of histroyDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setHistroyDetailId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHistroyDetailId(), "histroy_detail_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @param histroyDetailIdList The collection of histroyDetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistroyDetailId_InScope(Collection<Integer> histroyDetailIdList) {
        doSetHistroyDetailId_InScope(histroyDetailIdList);
    }

    protected void doSetHistroyDetailId_InScope(Collection<Integer> histroyDetailIdList) {
        regINS(CK_INS, cTL(histroyDetailIdList), xgetCValueHistroyDetailId(), "histroy_detail_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @param histroyDetailIdList The collection of histroyDetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistroyDetailId_NotInScope(Collection<Integer> histroyDetailIdList) {
        doSetHistroyDetailId_NotInScope(histroyDetailIdList);
    }

    protected void doSetHistroyDetailId_NotInScope(Collection<Integer> histroyDetailIdList) {
        regINS(CK_NINS, cTL(histroyDetailIdList), xgetCValueHistroyDetailId(), "histroy_detail_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     */
    public void setHistroyDetailId_IsNull() { regHistroyDetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     */
    public void setHistroyDetailId_IsNotNull() { regHistroyDetailId(CK_ISNN, DOBJ); }

    protected void regHistroyDetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHistroyDetailId(), "histroy_detail_id"); }
    protected abstract ConditionValue xgetCValueHistroyDetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {NotNull, int4(10)}
     * @param challengeHistoryId The value of challengeHistoryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_Equal(Integer challengeHistoryId) {
        doSetChallengeHistoryId_Equal(challengeHistoryId);
    }

    protected void doSetChallengeHistoryId_Equal(Integer challengeHistoryId) {
        regChallengeHistoryId(CK_EQ, challengeHistoryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {NotNull, int4(10)}
     * @param challengeHistoryId The value of challengeHistoryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_NotEqual(Integer challengeHistoryId) {
        doSetChallengeHistoryId_NotEqual(challengeHistoryId);
    }

    protected void doSetChallengeHistoryId_NotEqual(Integer challengeHistoryId) {
        regChallengeHistoryId(CK_NES, challengeHistoryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {NotNull, int4(10)}
     * @param challengeHistoryId The value of challengeHistoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_GreaterThan(Integer challengeHistoryId) {
        regChallengeHistoryId(CK_GT, challengeHistoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {NotNull, int4(10)}
     * @param challengeHistoryId The value of challengeHistoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_LessThan(Integer challengeHistoryId) {
        regChallengeHistoryId(CK_LT, challengeHistoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {NotNull, int4(10)}
     * @param challengeHistoryId The value of challengeHistoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_GreaterEqual(Integer challengeHistoryId) {
        regChallengeHistoryId(CK_GE, challengeHistoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {NotNull, int4(10)}
     * @param challengeHistoryId The value of challengeHistoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_LessEqual(Integer challengeHistoryId) {
        regChallengeHistoryId(CK_LE, challengeHistoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {NotNull, int4(10)}
     * @param minNumber The min number of challengeHistoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of challengeHistoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setChallengeHistoryId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setChallengeHistoryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {NotNull, int4(10)}
     * @param minNumber The min number of challengeHistoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of challengeHistoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setChallengeHistoryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChallengeHistoryId(), "challenge_history_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * challenge_history_id: {NotNull, int4(10)}
     * @param challengeHistoryIdList The collection of challengeHistoryId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_InScope(Collection<Integer> challengeHistoryIdList) {
        doSetChallengeHistoryId_InScope(challengeHistoryIdList);
    }

    protected void doSetChallengeHistoryId_InScope(Collection<Integer> challengeHistoryIdList) {
        regINS(CK_INS, cTL(challengeHistoryIdList), xgetCValueChallengeHistoryId(), "challenge_history_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * challenge_history_id: {NotNull, int4(10)}
     * @param challengeHistoryIdList The collection of challengeHistoryId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_NotInScope(Collection<Integer> challengeHistoryIdList) {
        doSetChallengeHistoryId_NotInScope(challengeHistoryIdList);
    }

    protected void doSetChallengeHistoryId_NotInScope(Collection<Integer> challengeHistoryIdList) {
        regINS(CK_NINS, cTL(challengeHistoryIdList), xgetCValueChallengeHistoryId(), "challenge_history_id");
    }

    protected void regChallengeHistoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChallengeHistoryId(), "challenge_history_id"); }
    protected abstract ConditionValue xgetCValueChallengeHistoryId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {NotNull, int4(10), FK to question}
     * @param questionId The value of questionId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_Equal(Integer questionId) {
        doSetQuestionId_Equal(questionId);
    }

    protected void doSetQuestionId_Equal(Integer questionId) {
        regQuestionId(CK_EQ, questionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {NotNull, int4(10), FK to question}
     * @param questionId The value of questionId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_NotEqual(Integer questionId) {
        doSetQuestionId_NotEqual(questionId);
    }

    protected void doSetQuestionId_NotEqual(Integer questionId) {
        regQuestionId(CK_NES, questionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {NotNull, int4(10), FK to question}
     * @param questionId The value of questionId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_GreaterThan(Integer questionId) {
        regQuestionId(CK_GT, questionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {NotNull, int4(10), FK to question}
     * @param questionId The value of questionId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_LessThan(Integer questionId) {
        regQuestionId(CK_LT, questionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {NotNull, int4(10), FK to question}
     * @param questionId The value of questionId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_GreaterEqual(Integer questionId) {
        regQuestionId(CK_GE, questionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {NotNull, int4(10), FK to question}
     * @param questionId The value of questionId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_LessEqual(Integer questionId) {
        regQuestionId(CK_LE, questionId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {NotNull, int4(10), FK to question}
     * @param minNumber The min number of questionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of questionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setQuestionId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setQuestionId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {NotNull, int4(10), FK to question}
     * @param minNumber The min number of questionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of questionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setQuestionId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQuestionId(), "question_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * question_id: {NotNull, int4(10), FK to question}
     * @param questionIdList The collection of questionId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuestionId_InScope(Collection<Integer> questionIdList) {
        doSetQuestionId_InScope(questionIdList);
    }

    protected void doSetQuestionId_InScope(Collection<Integer> questionIdList) {
        regINS(CK_INS, cTL(questionIdList), xgetCValueQuestionId(), "question_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * question_id: {NotNull, int4(10), FK to question}
     * @param questionIdList The collection of questionId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuestionId_NotInScope(Collection<Integer> questionIdList) {
        doSetQuestionId_NotInScope(questionIdList);
    }

    protected void doSetQuestionId_NotInScope(Collection<Integer> questionIdList) {
        regINS(CK_NINS, cTL(questionIdList), xgetCValueQuestionId(), "question_id");
    }

    protected void regQuestionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQuestionId(), "question_id"); }
    protected abstract ConditionValue xgetCValueQuestionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * answer: {text(2147483647)}
     * @param answer The value of answer as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswer_Equal(String answer) {
        doSetAnswer_Equal(fRES(answer));
    }

    protected void doSetAnswer_Equal(String answer) {
        regAnswer(CK_EQ, answer);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * answer: {text(2147483647)}
     * @param answer The value of answer as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswer_NotEqual(String answer) {
        doSetAnswer_NotEqual(fRES(answer));
    }

    protected void doSetAnswer_NotEqual(String answer) {
        regAnswer(CK_NES, answer);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * answer: {text(2147483647)}
     * @param answer The value of answer as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswer_GreaterThan(String answer) {
        regAnswer(CK_GT, fRES(answer));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * answer: {text(2147483647)}
     * @param answer The value of answer as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswer_LessThan(String answer) {
        regAnswer(CK_LT, fRES(answer));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * answer: {text(2147483647)}
     * @param answer The value of answer as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswer_GreaterEqual(String answer) {
        regAnswer(CK_GE, fRES(answer));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * answer: {text(2147483647)}
     * @param answer The value of answer as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswer_LessEqual(String answer) {
        regAnswer(CK_LE, fRES(answer));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * answer: {text(2147483647)}
     * @param answerList The collection of answer as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswer_InScope(Collection<String> answerList) {
        doSetAnswer_InScope(answerList);
    }

    protected void doSetAnswer_InScope(Collection<String> answerList) {
        regINS(CK_INS, cTL(answerList), xgetCValueAnswer(), "answer");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * answer: {text(2147483647)}
     * @param answerList The collection of answer as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswer_NotInScope(Collection<String> answerList) {
        doSetAnswer_NotInScope(answerList);
    }

    protected void doSetAnswer_NotInScope(Collection<String> answerList) {
        regINS(CK_NINS, cTL(answerList), xgetCValueAnswer(), "answer");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * answer: {text(2147483647)} <br>
     * <pre>e.g. setAnswer_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param answer The value of answer as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAnswer_LikeSearch(String answer, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAnswer_LikeSearch(answer, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * answer: {text(2147483647)} <br>
     * <pre>e.g. setAnswer_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param answer The value of answer as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAnswer_LikeSearch(String answer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(answer), xgetCValueAnswer(), "answer", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * answer: {text(2147483647)}
     * @param answer The value of answer as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAnswer_NotLikeSearch(String answer, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAnswer_NotLikeSearch(answer, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * answer: {text(2147483647)}
     * @param answer The value of answer as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAnswer_NotLikeSearch(String answer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(answer), xgetCValueAnswer(), "answer", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * answer: {text(2147483647)}
     */
    public void setAnswer_IsNull() { regAnswer(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * answer: {text(2147483647)}
     */
    public void setAnswer_IsNullOrEmpty() { regAnswer(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * answer: {text(2147483647)}
     */
    public void setAnswer_IsNotNull() { regAnswer(CK_ISNN, DOBJ); }

    protected void regAnswer(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAnswer(), "answer"); }
    protected abstract ConditionValue xgetCValueAnswer();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * correct_flag: {NotNull, bool(1)}
     * @param correctFlag The value of correctFlag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectFlag_Equal(Boolean correctFlag) {
        regCorrectFlag(CK_EQ, correctFlag);
    }

    protected void regCorrectFlag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCorrectFlag(), "correct_flag"); }
    protected abstract ConditionValue xgetCValueCorrectFlag();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ChallengeDetailHistoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ChallengeDetailHistoryCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ChallengeDetailHistoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ChallengeDetailHistoryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ChallengeDetailHistoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ChallengeDetailHistoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ChallengeDetailHistoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ChallengeDetailHistoryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ChallengeDetailHistoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ChallengeDetailHistoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ChallengeDetailHistoryCB&gt;() {
     *     public void query(ChallengeDetailHistoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ChallengeDetailHistoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ChallengeDetailHistoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ChallengeDetailHistoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ChallengeDetailHistoryCQ sq);

    protected ChallengeDetailHistoryCB xcreateScalarConditionCB() {
        ChallengeDetailHistoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ChallengeDetailHistoryCB xcreateScalarConditionPartitionByCB() {
        ChallengeDetailHistoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ChallengeDetailHistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ChallengeDetailHistoryCB cb = new ChallengeDetailHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "histroy_detail_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ChallengeDetailHistoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ChallengeDetailHistoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ChallengeDetailHistoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ChallengeDetailHistoryCB cb = new ChallengeDetailHistoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "histroy_detail_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ChallengeDetailHistoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ChallengeDetailHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ChallengeDetailHistoryCB cb = new ChallengeDetailHistoryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ChallengeDetailHistoryCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected ChallengeDetailHistoryCB newMyCB() {
        return new ChallengeDetailHistoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ChallengeDetailHistoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
