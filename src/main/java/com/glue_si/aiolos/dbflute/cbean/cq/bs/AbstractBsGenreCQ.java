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
 * The abstract condition-query of genre.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsGenreCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsGenreCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "genre";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {PK, ID, NotNull, serial(10)}
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
     * genre_id: {PK, ID, NotNull, serial(10)}
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
     * genre_id: {PK, ID, NotNull, serial(10)}
     * @param genreId The value of genreId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_GreaterThan(Integer genreId) {
        regGenreId(CK_GT, genreId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {PK, ID, NotNull, serial(10)}
     * @param genreId The value of genreId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_LessThan(Integer genreId) {
        regGenreId(CK_LT, genreId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {PK, ID, NotNull, serial(10)}
     * @param genreId The value of genreId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_GreaterEqual(Integer genreId) {
        regGenreId(CK_GE, genreId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {PK, ID, NotNull, serial(10)}
     * @param genreId The value of genreId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_LessEqual(Integer genreId) {
        regGenreId(CK_LE, genreId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {PK, ID, NotNull, serial(10)}
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
     * genre_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of genreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of genreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGenreId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGenreId(), "genre_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * genre_id: {PK, ID, NotNull, serial(10)}
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
     * genre_id: {PK, ID, NotNull, serial(10)}
     * @param genreIdList The collection of genreId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreId_NotInScope(Collection<Integer> genreIdList) {
        doSetGenreId_NotInScope(genreIdList);
    }

    protected void doSetGenreId_NotInScope(Collection<Integer> genreIdList) {
        regINS(CK_NINS, cTL(genreIdList), xgetCValueGenreId(), "genre_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select genre_id from challenge_history where ...)} <br>
     * challenge_history by genre_id, named 'challengeHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsChallengeHistory</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ChallengeHistoryList for 'exists'. (NotNull)
     */
    public void existsChallengeHistory(SubQuery<ChallengeHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ChallengeHistoryCB cb = new ChallengeHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGenreId_ExistsReferrer_ChallengeHistoryList(cb.query());
        registerExistsReferrer(cb.query(), "genre_id", "genre_id", pp, "challengeHistoryList");
    }
    public abstract String keepGenreId_ExistsReferrer_ChallengeHistoryList(ChallengeHistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select genre_id from challenge_history where ...)} <br>
     * challenge_history by genre_id, named 'challengeHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsChallengeHistory</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of GenreId_NotExistsReferrer_ChallengeHistoryList for 'not exists'. (NotNull)
     */
    public void notExistsChallengeHistory(SubQuery<ChallengeHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ChallengeHistoryCB cb = new ChallengeHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepGenreId_NotExistsReferrer_ChallengeHistoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "genre_id", "genre_id", pp, "challengeHistoryList");
    }
    public abstract String keepGenreId_NotExistsReferrer_ChallengeHistoryList(ChallengeHistoryCQ sq);

    public void xsderiveChallengeHistoryList(String fn, SubQuery<ChallengeHistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ChallengeHistoryCB cb = new ChallengeHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepGenreId_SpecifyDerivedReferrer_ChallengeHistoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "genre_id", "genre_id", pp, "challengeHistoryList", al, op);
    }
    public abstract String keepGenreId_SpecifyDerivedReferrer_ChallengeHistoryList(ChallengeHistoryCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from challenge_history where ...)} <br>
     * challenge_history by genre_id, named 'challengeHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedChallengeHistory()</span>.<span style="color: #CC4747">max</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     historyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ChallengeHistoryCB> derivedChallengeHistory() {
        return xcreateQDRFunctionChallengeHistoryList();
    }
    protected HpQDRFunction<ChallengeHistoryCB> xcreateQDRFunctionChallengeHistoryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveChallengeHistoryList(fn, sq, rd, vl, op));
    }
    public void xqderiveChallengeHistoryList(String fn, SubQuery<ChallengeHistoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ChallengeHistoryCB cb = new ChallengeHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepGenreId_QueryDerivedReferrer_ChallengeHistoryList(cb.query()); String prpp = keepGenreId_QueryDerivedReferrer_ChallengeHistoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "genre_id", "genre_id", sqpp, "challengeHistoryList", rd, vl, prpp, op);
    }
    public abstract String keepGenreId_QueryDerivedReferrer_ChallengeHistoryList(ChallengeHistoryCQ sq);
    public abstract String keepGenreId_QueryDerivedReferrer_ChallengeHistoryListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * genre_id: {PK, ID, NotNull, serial(10)}
     */
    public void setGenreId_IsNull() { regGenreId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * genre_id: {PK, ID, NotNull, serial(10)}
     */
    public void setGenreId_IsNotNull() { regGenreId(CK_ISNN, DOBJ); }

    protected void regGenreId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenreId(), "genre_id"); }
    protected abstract ConditionValue xgetCValueGenreId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * genre_name: {NotNull, text(2147483647)}
     * @param genreName The value of genreName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_Equal(String genreName) {
        doSetGenreName_Equal(fRES(genreName));
    }

    protected void doSetGenreName_Equal(String genreName) {
        regGenreName(CK_EQ, genreName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * genre_name: {NotNull, text(2147483647)}
     * @param genreName The value of genreName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_NotEqual(String genreName) {
        doSetGenreName_NotEqual(fRES(genreName));
    }

    protected void doSetGenreName_NotEqual(String genreName) {
        regGenreName(CK_NES, genreName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * genre_name: {NotNull, text(2147483647)}
     * @param genreName The value of genreName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_GreaterThan(String genreName) {
        regGenreName(CK_GT, fRES(genreName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * genre_name: {NotNull, text(2147483647)}
     * @param genreName The value of genreName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_LessThan(String genreName) {
        regGenreName(CK_LT, fRES(genreName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * genre_name: {NotNull, text(2147483647)}
     * @param genreName The value of genreName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_GreaterEqual(String genreName) {
        regGenreName(CK_GE, fRES(genreName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * genre_name: {NotNull, text(2147483647)}
     * @param genreName The value of genreName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_LessEqual(String genreName) {
        regGenreName(CK_LE, fRES(genreName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * genre_name: {NotNull, text(2147483647)}
     * @param genreNameList The collection of genreName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_InScope(Collection<String> genreNameList) {
        doSetGenreName_InScope(genreNameList);
    }

    protected void doSetGenreName_InScope(Collection<String> genreNameList) {
        regINS(CK_INS, cTL(genreNameList), xgetCValueGenreName(), "genre_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * genre_name: {NotNull, text(2147483647)}
     * @param genreNameList The collection of genreName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_NotInScope(Collection<String> genreNameList) {
        doSetGenreName_NotInScope(genreNameList);
    }

    protected void doSetGenreName_NotInScope(Collection<String> genreNameList) {
        regINS(CK_NINS, cTL(genreNameList), xgetCValueGenreName(), "genre_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * genre_name: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setGenreName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param genreName The value of genreName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGenreName_LikeSearch(String genreName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGenreName_LikeSearch(genreName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * genre_name: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setGenreName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param genreName The value of genreName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGenreName_LikeSearch(String genreName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genreName), xgetCValueGenreName(), "genre_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * genre_name: {NotNull, text(2147483647)}
     * @param genreName The value of genreName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGenreName_NotLikeSearch(String genreName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGenreName_NotLikeSearch(genreName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * genre_name: {NotNull, text(2147483647)}
     * @param genreName The value of genreName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGenreName_NotLikeSearch(String genreName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genreName), xgetCValueGenreName(), "genre_name", likeSearchOption);
    }

    protected void regGenreName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenreName(), "genre_name"); }
    protected abstract ConditionValue xgetCValueGenreName();

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
    public HpSLCFunction<GenreCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, GenreCB.class);
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
    public HpSLCFunction<GenreCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, GenreCB.class);
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
    public HpSLCFunction<GenreCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, GenreCB.class);
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
    public HpSLCFunction<GenreCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, GenreCB.class);
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
    public HpSLCFunction<GenreCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, GenreCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;GenreCB&gt;() {
     *     public void query(GenreCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GenreCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, GenreCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        GenreCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(GenreCQ sq);

    protected GenreCB xcreateScalarConditionCB() {
        GenreCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected GenreCB xcreateScalarConditionPartitionByCB() {
        GenreCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<GenreCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GenreCB cb = new GenreCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "genre_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(GenreCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<GenreCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(GenreCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GenreCB cb = new GenreCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "genre_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(GenreCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<GenreCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GenreCB cb = new GenreCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(GenreCQ sq);

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
    protected GenreCB newMyCB() {
        return new GenreCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return GenreCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
