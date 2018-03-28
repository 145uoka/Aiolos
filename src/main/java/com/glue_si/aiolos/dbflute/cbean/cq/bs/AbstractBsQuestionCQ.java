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
 * The abstract condition-query of question.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsQuestionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsQuestionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "question";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {PK, ID, NotNull, serial(10)}
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
     * question_id: {PK, ID, NotNull, serial(10)}
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
     * question_id: {PK, ID, NotNull, serial(10)}
     * @param questionId The value of questionId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_GreaterThan(Integer questionId) {
        regQuestionId(CK_GT, questionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {PK, ID, NotNull, serial(10)}
     * @param questionId The value of questionId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_LessThan(Integer questionId) {
        regQuestionId(CK_LT, questionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {PK, ID, NotNull, serial(10)}
     * @param questionId The value of questionId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_GreaterEqual(Integer questionId) {
        regQuestionId(CK_GE, questionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {PK, ID, NotNull, serial(10)}
     * @param questionId The value of questionId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_LessEqual(Integer questionId) {
        regQuestionId(CK_LE, questionId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {PK, ID, NotNull, serial(10)}
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
     * question_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of questionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of questionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setQuestionId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQuestionId(), "question_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * question_id: {PK, ID, NotNull, serial(10)}
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
     * question_id: {PK, ID, NotNull, serial(10)}
     * @param questionIdList The collection of questionId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuestionId_NotInScope(Collection<Integer> questionIdList) {
        doSetQuestionId_NotInScope(questionIdList);
    }

    protected void doSetQuestionId_NotInScope(Collection<Integer> questionIdList) {
        regINS(CK_NINS, cTL(questionIdList), xgetCValueQuestionId(), "question_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select question_id from challenge_detail_history where ...)} <br>
     * challenge_detail_history by question_id, named 'challengeDetailHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsChallengeDetailHistory</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ChallengeDetailHistoryList for 'exists'. (NotNull)
     */
    public void existsChallengeDetailHistory(SubQuery<ChallengeDetailHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ChallengeDetailHistoryCB cb = new ChallengeDetailHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepQuestionId_ExistsReferrer_ChallengeDetailHistoryList(cb.query());
        registerExistsReferrer(cb.query(), "question_id", "question_id", pp, "challengeDetailHistoryList");
    }
    public abstract String keepQuestionId_ExistsReferrer_ChallengeDetailHistoryList(ChallengeDetailHistoryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select question_id from answer where ...)} <br>
     * answer by question_id, named 'answerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsAnswer</span>(answerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     answerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AnswerList for 'exists'. (NotNull)
     */
    public void existsAnswer(SubQuery<AnswerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AnswerCB cb = new AnswerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepQuestionId_ExistsReferrer_AnswerList(cb.query());
        registerExistsReferrer(cb.query(), "question_id", "question_id", pp, "answerList");
    }
    public abstract String keepQuestionId_ExistsReferrer_AnswerList(AnswerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select question_id from challenge_detail_history where ...)} <br>
     * challenge_detail_history by question_id, named 'challengeDetailHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsChallengeDetailHistory</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of QuestionId_NotExistsReferrer_ChallengeDetailHistoryList for 'not exists'. (NotNull)
     */
    public void notExistsChallengeDetailHistory(SubQuery<ChallengeDetailHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ChallengeDetailHistoryCB cb = new ChallengeDetailHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepQuestionId_NotExistsReferrer_ChallengeDetailHistoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "question_id", "question_id", pp, "challengeDetailHistoryList");
    }
    public abstract String keepQuestionId_NotExistsReferrer_ChallengeDetailHistoryList(ChallengeDetailHistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select question_id from answer where ...)} <br>
     * answer by question_id, named 'answerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsAnswer</span>(answerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     answerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of QuestionId_NotExistsReferrer_AnswerList for 'not exists'. (NotNull)
     */
    public void notExistsAnswer(SubQuery<AnswerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AnswerCB cb = new AnswerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepQuestionId_NotExistsReferrer_AnswerList(cb.query());
        registerNotExistsReferrer(cb.query(), "question_id", "question_id", pp, "answerList");
    }
    public abstract String keepQuestionId_NotExistsReferrer_AnswerList(AnswerCQ sq);

    public void xsderiveChallengeDetailHistoryList(String fn, SubQuery<ChallengeDetailHistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ChallengeDetailHistoryCB cb = new ChallengeDetailHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepQuestionId_SpecifyDerivedReferrer_ChallengeDetailHistoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "question_id", "question_id", pp, "challengeDetailHistoryList", al, op);
    }
    public abstract String keepQuestionId_SpecifyDerivedReferrer_ChallengeDetailHistoryList(ChallengeDetailHistoryCQ sq);

    public void xsderiveAnswerList(String fn, SubQuery<AnswerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AnswerCB cb = new AnswerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepQuestionId_SpecifyDerivedReferrer_AnswerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "question_id", "question_id", pp, "answerList", al, op);
    }
    public abstract String keepQuestionId_SpecifyDerivedReferrer_AnswerList(AnswerCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from challenge_detail_history where ...)} <br>
     * challenge_detail_history by question_id, named 'challengeDetailHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedChallengeDetailHistory()</span>.<span style="color: #CC4747">max</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     historyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ChallengeDetailHistoryCB> derivedChallengeDetailHistory() {
        return xcreateQDRFunctionChallengeDetailHistoryList();
    }
    protected HpQDRFunction<ChallengeDetailHistoryCB> xcreateQDRFunctionChallengeDetailHistoryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveChallengeDetailHistoryList(fn, sq, rd, vl, op));
    }
    public void xqderiveChallengeDetailHistoryList(String fn, SubQuery<ChallengeDetailHistoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ChallengeDetailHistoryCB cb = new ChallengeDetailHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepQuestionId_QueryDerivedReferrer_ChallengeDetailHistoryList(cb.query()); String prpp = keepQuestionId_QueryDerivedReferrer_ChallengeDetailHistoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "question_id", "question_id", sqpp, "challengeDetailHistoryList", rd, vl, prpp, op);
    }
    public abstract String keepQuestionId_QueryDerivedReferrer_ChallengeDetailHistoryList(ChallengeDetailHistoryCQ sq);
    public abstract String keepQuestionId_QueryDerivedReferrer_ChallengeDetailHistoryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from answer where ...)} <br>
     * answer by question_id, named 'answerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedAnswer()</span>.<span style="color: #CC4747">max</span>(answerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     answerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     answerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<AnswerCB> derivedAnswer() {
        return xcreateQDRFunctionAnswerList();
    }
    protected HpQDRFunction<AnswerCB> xcreateQDRFunctionAnswerList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveAnswerList(fn, sq, rd, vl, op));
    }
    public void xqderiveAnswerList(String fn, SubQuery<AnswerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AnswerCB cb = new AnswerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepQuestionId_QueryDerivedReferrer_AnswerList(cb.query()); String prpp = keepQuestionId_QueryDerivedReferrer_AnswerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "question_id", "question_id", sqpp, "answerList", rd, vl, prpp, op);
    }
    public abstract String keepQuestionId_QueryDerivedReferrer_AnswerList(AnswerCQ sq);
    public abstract String keepQuestionId_QueryDerivedReferrer_AnswerListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * question_id: {PK, ID, NotNull, serial(10)}
     */
    public void setQuestionId_IsNull() { regQuestionId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * question_id: {PK, ID, NotNull, serial(10)}
     */
    public void setQuestionId_IsNotNull() { regQuestionId(CK_ISNN, DOBJ); }

    protected void regQuestionId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQuestionId(), "question_id"); }
    protected abstract ConditionValue xgetCValueQuestionId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10)}
     * @param genreId The value of genreId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_Equal(Integer genreId) {
        doSetGenreId_Equal(genreId);
    }

    protected void doSetGenreId_Equal(Integer genreId) {
        regGenreId(CK_EQ, genreId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10)}
     * @param genreId The value of genreId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_NotEqual(Integer genreId) {
        doSetGenreId_NotEqual(genreId);
    }

    protected void doSetGenreId_NotEqual(Integer genreId) {
        regGenreId(CK_NES, genreId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10)}
     * @param genreId The value of genreId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_GreaterThan(Integer genreId) {
        regGenreId(CK_GT, genreId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10)}
     * @param genreId The value of genreId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_LessThan(Integer genreId) {
        regGenreId(CK_LT, genreId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10)}
     * @param genreId The value of genreId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_GreaterEqual(Integer genreId) {
        regGenreId(CK_GE, genreId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10)}
     * @param genreId The value of genreId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_LessEqual(Integer genreId) {
        regGenreId(CK_LE, genreId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10)}
     * @param minNumber The min number of genreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of genreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGenreId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGenreId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10)}
     * @param minNumber The min number of genreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of genreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGenreId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGenreId(), "genre_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * genre_id: {NotNull, int4(10)}
     * @param genreIdList The collection of genreId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreId_InScope(Collection<Integer> genreIdList) {
        doSetGenreId_InScope(genreIdList);
    }

    protected void doSetGenreId_InScope(Collection<Integer> genreIdList) {
        regINS(CK_INS, cTL(genreIdList), xgetCValueGenreId(), "genre_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * genre_id: {NotNull, int4(10)}
     * @param genreIdList The collection of genreId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreId_NotInScope(Collection<Integer> genreIdList) {
        doSetGenreId_NotInScope(genreIdList);
    }

    protected void doSetGenreId_NotInScope(Collection<Integer> genreIdList) {
        regINS(CK_NINS, cTL(genreIdList), xgetCValueGenreId(), "genre_id");
    }

    protected void regGenreId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenreId(), "genre_id"); }
    protected abstract ConditionValue xgetCValueGenreId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * question_num: {NotNull, int4(10)}
     * @param questionNum The value of questionNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionNum_Equal(Integer questionNum) {
        doSetQuestionNum_Equal(questionNum);
    }

    protected void doSetQuestionNum_Equal(Integer questionNum) {
        regQuestionNum(CK_EQ, questionNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * question_num: {NotNull, int4(10)}
     * @param questionNum The value of questionNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionNum_NotEqual(Integer questionNum) {
        doSetQuestionNum_NotEqual(questionNum);
    }

    protected void doSetQuestionNum_NotEqual(Integer questionNum) {
        regQuestionNum(CK_NES, questionNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * question_num: {NotNull, int4(10)}
     * @param questionNum The value of questionNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionNum_GreaterThan(Integer questionNum) {
        regQuestionNum(CK_GT, questionNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * question_num: {NotNull, int4(10)}
     * @param questionNum The value of questionNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionNum_LessThan(Integer questionNum) {
        regQuestionNum(CK_LT, questionNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * question_num: {NotNull, int4(10)}
     * @param questionNum The value of questionNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionNum_GreaterEqual(Integer questionNum) {
        regQuestionNum(CK_GE, questionNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * question_num: {NotNull, int4(10)}
     * @param questionNum The value of questionNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionNum_LessEqual(Integer questionNum) {
        regQuestionNum(CK_LE, questionNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * question_num: {NotNull, int4(10)}
     * @param minNumber The min number of questionNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of questionNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setQuestionNum_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setQuestionNum_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * question_num: {NotNull, int4(10)}
     * @param minNumber The min number of questionNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of questionNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setQuestionNum_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQuestionNum(), "question_num", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * question_num: {NotNull, int4(10)}
     * @param questionNumList The collection of questionNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuestionNum_InScope(Collection<Integer> questionNumList) {
        doSetQuestionNum_InScope(questionNumList);
    }

    protected void doSetQuestionNum_InScope(Collection<Integer> questionNumList) {
        regINS(CK_INS, cTL(questionNumList), xgetCValueQuestionNum(), "question_num");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * question_num: {NotNull, int4(10)}
     * @param questionNumList The collection of questionNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuestionNum_NotInScope(Collection<Integer> questionNumList) {
        doSetQuestionNum_NotInScope(questionNumList);
    }

    protected void doSetQuestionNum_NotInScope(Collection<Integer> questionNumList) {
        regINS(CK_NINS, cTL(questionNumList), xgetCValueQuestionNum(), "question_num");
    }

    protected void regQuestionNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQuestionNum(), "question_num"); }
    protected abstract ConditionValue xgetCValueQuestionNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * answer_branch_no: {NotNull, text(2147483647)}
     * @param answerBranchNo The value of answerBranchNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswerBranchNo_Equal(String answerBranchNo) {
        doSetAnswerBranchNo_Equal(fRES(answerBranchNo));
    }

    protected void doSetAnswerBranchNo_Equal(String answerBranchNo) {
        regAnswerBranchNo(CK_EQ, answerBranchNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * answer_branch_no: {NotNull, text(2147483647)}
     * @param answerBranchNo The value of answerBranchNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswerBranchNo_NotEqual(String answerBranchNo) {
        doSetAnswerBranchNo_NotEqual(fRES(answerBranchNo));
    }

    protected void doSetAnswerBranchNo_NotEqual(String answerBranchNo) {
        regAnswerBranchNo(CK_NES, answerBranchNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * answer_branch_no: {NotNull, text(2147483647)}
     * @param answerBranchNo The value of answerBranchNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswerBranchNo_GreaterThan(String answerBranchNo) {
        regAnswerBranchNo(CK_GT, fRES(answerBranchNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * answer_branch_no: {NotNull, text(2147483647)}
     * @param answerBranchNo The value of answerBranchNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswerBranchNo_LessThan(String answerBranchNo) {
        regAnswerBranchNo(CK_LT, fRES(answerBranchNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * answer_branch_no: {NotNull, text(2147483647)}
     * @param answerBranchNo The value of answerBranchNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswerBranchNo_GreaterEqual(String answerBranchNo) {
        regAnswerBranchNo(CK_GE, fRES(answerBranchNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * answer_branch_no: {NotNull, text(2147483647)}
     * @param answerBranchNo The value of answerBranchNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswerBranchNo_LessEqual(String answerBranchNo) {
        regAnswerBranchNo(CK_LE, fRES(answerBranchNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * answer_branch_no: {NotNull, text(2147483647)}
     * @param answerBranchNoList The collection of answerBranchNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswerBranchNo_InScope(Collection<String> answerBranchNoList) {
        doSetAnswerBranchNo_InScope(answerBranchNoList);
    }

    protected void doSetAnswerBranchNo_InScope(Collection<String> answerBranchNoList) {
        regINS(CK_INS, cTL(answerBranchNoList), xgetCValueAnswerBranchNo(), "answer_branch_no");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * answer_branch_no: {NotNull, text(2147483647)}
     * @param answerBranchNoList The collection of answerBranchNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnswerBranchNo_NotInScope(Collection<String> answerBranchNoList) {
        doSetAnswerBranchNo_NotInScope(answerBranchNoList);
    }

    protected void doSetAnswerBranchNo_NotInScope(Collection<String> answerBranchNoList) {
        regINS(CK_NINS, cTL(answerBranchNoList), xgetCValueAnswerBranchNo(), "answer_branch_no");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * answer_branch_no: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setAnswerBranchNo_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param answerBranchNo The value of answerBranchNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAnswerBranchNo_LikeSearch(String answerBranchNo, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAnswerBranchNo_LikeSearch(answerBranchNo, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * answer_branch_no: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setAnswerBranchNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param answerBranchNo The value of answerBranchNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAnswerBranchNo_LikeSearch(String answerBranchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(answerBranchNo), xgetCValueAnswerBranchNo(), "answer_branch_no", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * answer_branch_no: {NotNull, text(2147483647)}
     * @param answerBranchNo The value of answerBranchNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAnswerBranchNo_NotLikeSearch(String answerBranchNo, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAnswerBranchNo_NotLikeSearch(answerBranchNo, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * answer_branch_no: {NotNull, text(2147483647)}
     * @param answerBranchNo The value of answerBranchNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAnswerBranchNo_NotLikeSearch(String answerBranchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(answerBranchNo), xgetCValueAnswerBranchNo(), "answer_branch_no", likeSearchOption);
    }

    protected void regAnswerBranchNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAnswerBranchNo(), "answer_branch_no"); }
    protected abstract ConditionValue xgetCValueAnswerBranchNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {text(2147483647)}
     * @param description The value of description as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {text(2147483647)}
     * @param description The value of description as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_NotEqual(String description) {
        doSetDescription_NotEqual(fRES(description));
    }

    protected void doSetDescription_NotEqual(String description) {
        regDescription(CK_NES, description);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {text(2147483647)}
     * @param description The value of description as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {text(2147483647)}
     * @param description The value of description as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {text(2147483647)}
     * @param description The value of description as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * description: {text(2147483647)}
     * @param description The value of description as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * description: {text(2147483647)}
     * @param descriptionList The collection of description as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        doSetDescription_InScope(descriptionList);
    }

    protected void doSetDescription_InScope(Collection<String> descriptionList) {
        regINS(CK_INS, cTL(descriptionList), xgetCValueDescription(), "description");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * description: {text(2147483647)}
     * @param descriptionList The collection of description as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDescription_NotInScope(Collection<String> descriptionList) {
        doSetDescription_NotInScope(descriptionList);
    }

    protected void doSetDescription_NotInScope(Collection<String> descriptionList) {
        regINS(CK_NINS, cTL(descriptionList), xgetCValueDescription(), "description");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * description: {text(2147483647)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param description The value of description as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_LikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * description: {text(2147483647)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param description The value of description as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), xgetCValueDescription(), "description", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * description: {text(2147483647)}
     * @param description The value of description as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_NotLikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * description: {text(2147483647)}
     * @param description The value of description as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), xgetCValueDescription(), "description", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * description: {text(2147483647)}
     */
    public void setDescription_IsNull() { regDescription(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * description: {text(2147483647)}
     */
    public void setDescription_IsNullOrEmpty() { regDescription(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * description: {text(2147483647)}
     */
    public void setDescription_IsNotNull() { regDescription(CK_ISNN, DOBJ); }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDescription(), "description"); }
    protected abstract ConditionValue xgetCValueDescription();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @param deleteFlag The value of deleteFlag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeleteFlag_Equal(Boolean deleteFlag) {
        regDeleteFlag(CK_EQ, deleteFlag);
    }

    protected void regDeleteFlag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeleteFlag(), "delete_flag"); }
    protected abstract ConditionValue xgetCValueDeleteFlag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     */
    public void setUpdateDatetime_IsNull() { regUpdateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     */
    public void setUpdateDatetime_IsNotNull() { regUpdateDatetime(CK_ISNN, DOBJ); }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

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
    public HpSLCFunction<QuestionCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, QuestionCB.class);
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
    public HpSLCFunction<QuestionCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, QuestionCB.class);
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
    public HpSLCFunction<QuestionCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, QuestionCB.class);
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
    public HpSLCFunction<QuestionCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, QuestionCB.class);
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
    public HpSLCFunction<QuestionCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, QuestionCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;QuestionCB&gt;() {
     *     public void query(QuestionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<QuestionCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, QuestionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        QuestionCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(QuestionCQ sq);

    protected QuestionCB xcreateScalarConditionCB() {
        QuestionCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected QuestionCB xcreateScalarConditionPartitionByCB() {
        QuestionCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<QuestionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        QuestionCB cb = new QuestionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "question_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(QuestionCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<QuestionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(QuestionCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        QuestionCB cb = new QuestionCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "question_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(QuestionCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<QuestionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        QuestionCB cb = new QuestionCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(QuestionCQ sq);

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
    protected QuestionCB newMyCB() {
        return new QuestionCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return QuestionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
