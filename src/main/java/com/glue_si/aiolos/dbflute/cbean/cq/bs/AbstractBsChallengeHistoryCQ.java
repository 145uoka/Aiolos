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
 * The abstract condition-query of challenge_history.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsChallengeHistoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsChallengeHistoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "challenge_history";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
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
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
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
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
     * @param challengeHistoryId The value of challengeHistoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_GreaterThan(Integer challengeHistoryId) {
        regChallengeHistoryId(CK_GT, challengeHistoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
     * @param challengeHistoryId The value of challengeHistoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_LessThan(Integer challengeHistoryId) {
        regChallengeHistoryId(CK_LT, challengeHistoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
     * @param challengeHistoryId The value of challengeHistoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_GreaterEqual(Integer challengeHistoryId) {
        regChallengeHistoryId(CK_GE, challengeHistoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
     * @param challengeHistoryId The value of challengeHistoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_LessEqual(Integer challengeHistoryId) {
        regChallengeHistoryId(CK_LE, challengeHistoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
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
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of challengeHistoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of challengeHistoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setChallengeHistoryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChallengeHistoryId(), "challenge_history_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
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
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
     * @param challengeHistoryIdList The collection of challengeHistoryId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setChallengeHistoryId_NotInScope(Collection<Integer> challengeHistoryIdList) {
        doSetChallengeHistoryId_NotInScope(challengeHistoryIdList);
    }

    protected void doSetChallengeHistoryId_NotInScope(Collection<Integer> challengeHistoryIdList) {
        regINS(CK_NINS, cTL(challengeHistoryIdList), xgetCValueChallengeHistoryId(), "challenge_history_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
     */
    public void setChallengeHistoryId_IsNull() { regChallengeHistoryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
     */
    public void setChallengeHistoryId_IsNotNull() { regChallengeHistoryId(CK_ISNN, DOBJ); }

    protected void regChallengeHistoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChallengeHistoryId(), "challenge_history_id"); }
    protected abstract ConditionValue xgetCValueChallengeHistoryId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10), FK to genre}
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
     * genre_id: {NotNull, int4(10), FK to genre}
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
     * genre_id: {NotNull, int4(10), FK to genre}
     * @param genreId The value of genreId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_GreaterThan(Integer genreId) {
        regGenreId(CK_GT, genreId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10), FK to genre}
     * @param genreId The value of genreId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_LessThan(Integer genreId) {
        regGenreId(CK_LT, genreId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10), FK to genre}
     * @param genreId The value of genreId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_GreaterEqual(Integer genreId) {
        regGenreId(CK_GE, genreId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10), FK to genre}
     * @param genreId The value of genreId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_LessEqual(Integer genreId) {
        regGenreId(CK_LE, genreId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * genre_id: {NotNull, int4(10), FK to genre}
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
     * genre_id: {NotNull, int4(10), FK to genre}
     * @param minNumber The min number of genreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of genreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGenreId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGenreId(), "genre_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * genre_id: {NotNull, int4(10), FK to genre}
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
     * genre_id: {NotNull, int4(10), FK to genre}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {NotNull, text(2147483647)}
     * @param userName The value of userName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_Equal(String userName) {
        doSetUserName_Equal(fRES(userName));
    }

    protected void doSetUserName_Equal(String userName) {
        regUserName(CK_EQ, userName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {NotNull, text(2147483647)}
     * @param userName The value of userName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_NotEqual(String userName) {
        doSetUserName_NotEqual(fRES(userName));
    }

    protected void doSetUserName_NotEqual(String userName) {
        regUserName(CK_NES, userName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {NotNull, text(2147483647)}
     * @param userName The value of userName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_GreaterThan(String userName) {
        regUserName(CK_GT, fRES(userName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {NotNull, text(2147483647)}
     * @param userName The value of userName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_LessThan(String userName) {
        regUserName(CK_LT, fRES(userName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {NotNull, text(2147483647)}
     * @param userName The value of userName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_GreaterEqual(String userName) {
        regUserName(CK_GE, fRES(userName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * user_name: {NotNull, text(2147483647)}
     * @param userName The value of userName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_LessEqual(String userName) {
        regUserName(CK_LE, fRES(userName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * user_name: {NotNull, text(2147483647)}
     * @param userNameList The collection of userName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_InScope(Collection<String> userNameList) {
        doSetUserName_InScope(userNameList);
    }

    protected void doSetUserName_InScope(Collection<String> userNameList) {
        regINS(CK_INS, cTL(userNameList), xgetCValueUserName(), "user_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * user_name: {NotNull, text(2147483647)}
     * @param userNameList The collection of userName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserName_NotInScope(Collection<String> userNameList) {
        doSetUserName_NotInScope(userNameList);
    }

    protected void doSetUserName_NotInScope(Collection<String> userNameList) {
        regINS(CK_NINS, cTL(userNameList), xgetCValueUserName(), "user_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_name: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setUserName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param userName The value of userName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserName_LikeSearch(String userName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserName_LikeSearch(userName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_name: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setUserName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userName The value of userName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUserName_LikeSearch(String userName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userName), xgetCValueUserName(), "user_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_name: {NotNull, text(2147483647)}
     * @param userName The value of userName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserName_NotLikeSearch(String userName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserName_NotLikeSearch(userName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * user_name: {NotNull, text(2147483647)}
     * @param userName The value of userName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUserName_NotLikeSearch(String userName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userName), xgetCValueUserName(), "user_name", likeSearchOption);
    }

    protected void regUserName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserName(), "user_name"); }
    protected abstract ConditionValue xgetCValueUserName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * score: {NotNull, float8(17, 17)}
     * @param score The value of score as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setScore_Equal(java.math.BigDecimal score) {
        doSetScore_Equal(score);
    }

    protected void doSetScore_Equal(java.math.BigDecimal score) {
        regScore(CK_EQ, score);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * score: {NotNull, float8(17, 17)}
     * @param score The value of score as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScore_NotEqual(java.math.BigDecimal score) {
        doSetScore_NotEqual(score);
    }

    protected void doSetScore_NotEqual(java.math.BigDecimal score) {
        regScore(CK_NES, score);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * score: {NotNull, float8(17, 17)}
     * @param score The value of score as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScore_GreaterThan(java.math.BigDecimal score) {
        regScore(CK_GT, score);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * score: {NotNull, float8(17, 17)}
     * @param score The value of score as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setScore_LessThan(java.math.BigDecimal score) {
        regScore(CK_LT, score);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * score: {NotNull, float8(17, 17)}
     * @param score The value of score as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScore_GreaterEqual(java.math.BigDecimal score) {
        regScore(CK_GE, score);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * score: {NotNull, float8(17, 17)}
     * @param score The value of score as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setScore_LessEqual(java.math.BigDecimal score) {
        regScore(CK_LE, score);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * score: {NotNull, float8(17, 17)}
     * @param minNumber The min number of score. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of score. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setScore_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setScore_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * score: {NotNull, float8(17, 17)}
     * @param minNumber The min number of score. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of score. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setScore_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueScore(), "score", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * score: {NotNull, float8(17, 17)}
     * @param scoreList The collection of score as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScore_InScope(Collection<java.math.BigDecimal> scoreList) {
        doSetScore_InScope(scoreList);
    }

    protected void doSetScore_InScope(Collection<java.math.BigDecimal> scoreList) {
        regINS(CK_INS, cTL(scoreList), xgetCValueScore(), "score");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * score: {NotNull, float8(17, 17)}
     * @param scoreList The collection of score as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScore_NotInScope(Collection<java.math.BigDecimal> scoreList) {
        doSetScore_NotInScope(scoreList);
    }

    protected void doSetScore_NotInScope(Collection<java.math.BigDecimal> scoreList) {
        regINS(CK_NINS, cTL(scoreList), xgetCValueScore(), "score");
    }

    protected void regScore(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScore(), "score"); }
    protected abstract ConditionValue xgetCValueScore();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * attendance_rate: {NotNull, int4(10)}
     * @param attendanceRate The value of attendanceRate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAttendanceRate_Equal(Integer attendanceRate) {
        doSetAttendanceRate_Equal(attendanceRate);
    }

    protected void doSetAttendanceRate_Equal(Integer attendanceRate) {
        regAttendanceRate(CK_EQ, attendanceRate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * attendance_rate: {NotNull, int4(10)}
     * @param attendanceRate The value of attendanceRate as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAttendanceRate_NotEqual(Integer attendanceRate) {
        doSetAttendanceRate_NotEqual(attendanceRate);
    }

    protected void doSetAttendanceRate_NotEqual(Integer attendanceRate) {
        regAttendanceRate(CK_NES, attendanceRate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * attendance_rate: {NotNull, int4(10)}
     * @param attendanceRate The value of attendanceRate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAttendanceRate_GreaterThan(Integer attendanceRate) {
        regAttendanceRate(CK_GT, attendanceRate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * attendance_rate: {NotNull, int4(10)}
     * @param attendanceRate The value of attendanceRate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAttendanceRate_LessThan(Integer attendanceRate) {
        regAttendanceRate(CK_LT, attendanceRate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * attendance_rate: {NotNull, int4(10)}
     * @param attendanceRate The value of attendanceRate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAttendanceRate_GreaterEqual(Integer attendanceRate) {
        regAttendanceRate(CK_GE, attendanceRate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * attendance_rate: {NotNull, int4(10)}
     * @param attendanceRate The value of attendanceRate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAttendanceRate_LessEqual(Integer attendanceRate) {
        regAttendanceRate(CK_LE, attendanceRate);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * attendance_rate: {NotNull, int4(10)}
     * @param minNumber The min number of attendanceRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of attendanceRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAttendanceRate_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAttendanceRate_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * attendance_rate: {NotNull, int4(10)}
     * @param minNumber The min number of attendanceRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of attendanceRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAttendanceRate_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAttendanceRate(), "attendance_rate", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * attendance_rate: {NotNull, int4(10)}
     * @param attendanceRateList The collection of attendanceRate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttendanceRate_InScope(Collection<Integer> attendanceRateList) {
        doSetAttendanceRate_InScope(attendanceRateList);
    }

    protected void doSetAttendanceRate_InScope(Collection<Integer> attendanceRateList) {
        regINS(CK_INS, cTL(attendanceRateList), xgetCValueAttendanceRate(), "attendance_rate");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * attendance_rate: {NotNull, int4(10)}
     * @param attendanceRateList The collection of attendanceRate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAttendanceRate_NotInScope(Collection<Integer> attendanceRateList) {
        doSetAttendanceRate_NotInScope(attendanceRateList);
    }

    protected void doSetAttendanceRate_NotInScope(Collection<Integer> attendanceRateList) {
        regINS(CK_NINS, cTL(attendanceRateList), xgetCValueAttendanceRate(), "attendance_rate");
    }

    protected void regAttendanceRate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAttendanceRate(), "attendance_rate"); }
    protected abstract ConditionValue xgetCValueAttendanceRate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @param elapsedTime The value of elapsedTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setElapsedTime_Equal(Long elapsedTime) {
        doSetElapsedTime_Equal(elapsedTime);
    }

    protected void doSetElapsedTime_Equal(Long elapsedTime) {
        regElapsedTime(CK_EQ, elapsedTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @param elapsedTime The value of elapsedTime as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setElapsedTime_NotEqual(Long elapsedTime) {
        doSetElapsedTime_NotEqual(elapsedTime);
    }

    protected void doSetElapsedTime_NotEqual(Long elapsedTime) {
        regElapsedTime(CK_NES, elapsedTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @param elapsedTime The value of elapsedTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setElapsedTime_GreaterThan(Long elapsedTime) {
        regElapsedTime(CK_GT, elapsedTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @param elapsedTime The value of elapsedTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setElapsedTime_LessThan(Long elapsedTime) {
        regElapsedTime(CK_LT, elapsedTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @param elapsedTime The value of elapsedTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setElapsedTime_GreaterEqual(Long elapsedTime) {
        regElapsedTime(CK_GE, elapsedTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @param elapsedTime The value of elapsedTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setElapsedTime_LessEqual(Long elapsedTime) {
        regElapsedTime(CK_LE, elapsedTime);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @param minNumber The min number of elapsedTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of elapsedTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setElapsedTime_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setElapsedTime_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @param minNumber The min number of elapsedTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of elapsedTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setElapsedTime_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueElapsedTime(), "elapsed_time", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @param elapsedTimeList The collection of elapsedTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setElapsedTime_InScope(Collection<Long> elapsedTimeList) {
        doSetElapsedTime_InScope(elapsedTimeList);
    }

    protected void doSetElapsedTime_InScope(Collection<Long> elapsedTimeList) {
        regINS(CK_INS, cTL(elapsedTimeList), xgetCValueElapsedTime(), "elapsed_time");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @param elapsedTimeList The collection of elapsedTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setElapsedTime_NotInScope(Collection<Long> elapsedTimeList) {
        doSetElapsedTime_NotInScope(elapsedTimeList);
    }

    protected void doSetElapsedTime_NotInScope(Collection<Long> elapsedTimeList) {
        regINS(CK_NINS, cTL(elapsedTimeList), xgetCValueElapsedTime(), "elapsed_time");
    }

    protected void regElapsedTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueElapsedTime(), "elapsed_time"); }
    protected abstract ConditionValue xgetCValueElapsedTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @param correctSum The value of correctSum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectSum_Equal(Integer correctSum) {
        doSetCorrectSum_Equal(correctSum);
    }

    protected void doSetCorrectSum_Equal(Integer correctSum) {
        regCorrectSum(CK_EQ, correctSum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @param correctSum The value of correctSum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectSum_NotEqual(Integer correctSum) {
        doSetCorrectSum_NotEqual(correctSum);
    }

    protected void doSetCorrectSum_NotEqual(Integer correctSum) {
        regCorrectSum(CK_NES, correctSum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @param correctSum The value of correctSum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectSum_GreaterThan(Integer correctSum) {
        regCorrectSum(CK_GT, correctSum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @param correctSum The value of correctSum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectSum_LessThan(Integer correctSum) {
        regCorrectSum(CK_LT, correctSum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @param correctSum The value of correctSum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectSum_GreaterEqual(Integer correctSum) {
        regCorrectSum(CK_GE, correctSum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @param correctSum The value of correctSum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCorrectSum_LessEqual(Integer correctSum) {
        regCorrectSum(CK_LE, correctSum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @param minNumber The min number of correctSum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of correctSum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCorrectSum_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCorrectSum_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @param minNumber The min number of correctSum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of correctSum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCorrectSum_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCorrectSum(), "correct_sum", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @param correctSumList The collection of correctSum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectSum_InScope(Collection<Integer> correctSumList) {
        doSetCorrectSum_InScope(correctSumList);
    }

    protected void doSetCorrectSum_InScope(Collection<Integer> correctSumList) {
        regINS(CK_INS, cTL(correctSumList), xgetCValueCorrectSum(), "correct_sum");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @param correctSumList The collection of correctSum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCorrectSum_NotInScope(Collection<Integer> correctSumList) {
        doSetCorrectSum_NotInScope(correctSumList);
    }

    protected void doSetCorrectSum_NotInScope(Collection<Integer> correctSumList) {
        regINS(CK_NINS, cTL(correctSumList), xgetCValueCorrectSum(), "correct_sum");
    }

    protected void regCorrectSum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCorrectSum(), "correct_sum"); }
    protected abstract ConditionValue xgetCValueCorrectSum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * incorrect_sum: {NotNull, int4(10), default=[0]}
     * @param incorrectSum The value of incorrectSum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncorrectSum_Equal(Integer incorrectSum) {
        doSetIncorrectSum_Equal(incorrectSum);
    }

    protected void doSetIncorrectSum_Equal(Integer incorrectSum) {
        regIncorrectSum(CK_EQ, incorrectSum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * incorrect_sum: {NotNull, int4(10), default=[0]}
     * @param incorrectSum The value of incorrectSum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncorrectSum_NotEqual(Integer incorrectSum) {
        doSetIncorrectSum_NotEqual(incorrectSum);
    }

    protected void doSetIncorrectSum_NotEqual(Integer incorrectSum) {
        regIncorrectSum(CK_NES, incorrectSum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * incorrect_sum: {NotNull, int4(10), default=[0]}
     * @param incorrectSum The value of incorrectSum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncorrectSum_GreaterThan(Integer incorrectSum) {
        regIncorrectSum(CK_GT, incorrectSum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * incorrect_sum: {NotNull, int4(10), default=[0]}
     * @param incorrectSum The value of incorrectSum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncorrectSum_LessThan(Integer incorrectSum) {
        regIncorrectSum(CK_LT, incorrectSum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * incorrect_sum: {NotNull, int4(10), default=[0]}
     * @param incorrectSum The value of incorrectSum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncorrectSum_GreaterEqual(Integer incorrectSum) {
        regIncorrectSum(CK_GE, incorrectSum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * incorrect_sum: {NotNull, int4(10), default=[0]}
     * @param incorrectSum The value of incorrectSum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setIncorrectSum_LessEqual(Integer incorrectSum) {
        regIncorrectSum(CK_LE, incorrectSum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * incorrect_sum: {NotNull, int4(10), default=[0]}
     * @param minNumber The min number of incorrectSum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of incorrectSum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setIncorrectSum_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setIncorrectSum_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * incorrect_sum: {NotNull, int4(10), default=[0]}
     * @param minNumber The min number of incorrectSum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of incorrectSum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setIncorrectSum_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueIncorrectSum(), "incorrect_sum", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * incorrect_sum: {NotNull, int4(10), default=[0]}
     * @param incorrectSumList The collection of incorrectSum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIncorrectSum_InScope(Collection<Integer> incorrectSumList) {
        doSetIncorrectSum_InScope(incorrectSumList);
    }

    protected void doSetIncorrectSum_InScope(Collection<Integer> incorrectSumList) {
        regINS(CK_INS, cTL(incorrectSumList), xgetCValueIncorrectSum(), "incorrect_sum");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * incorrect_sum: {NotNull, int4(10), default=[0]}
     * @param incorrectSumList The collection of incorrectSum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIncorrectSum_NotInScope(Collection<Integer> incorrectSumList) {
        doSetIncorrectSum_NotInScope(incorrectSumList);
    }

    protected void doSetIncorrectSum_NotInScope(Collection<Integer> incorrectSumList) {
        regINS(CK_NINS, cTL(incorrectSumList), xgetCValueIncorrectSum(), "incorrect_sum");
    }

    protected void regIncorrectSum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIncorrectSum(), "incorrect_sum"); }
    protected abstract ConditionValue xgetCValueIncorrectSum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * detail_clean_flag: {NotNull, bool(1), default=[false]}
     * @param detailCleanFlag The value of detailCleanFlag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDetailCleanFlag_Equal(Boolean detailCleanFlag) {
        regDetailCleanFlag(CK_EQ, detailCleanFlag);
    }

    protected void regDetailCleanFlag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDetailCleanFlag(), "detail_clean_flag"); }
    protected abstract ConditionValue xgetCValueDetailCleanFlag();

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
    public HpSLCFunction<ChallengeHistoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ChallengeHistoryCB.class);
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
    public HpSLCFunction<ChallengeHistoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ChallengeHistoryCB.class);
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
    public HpSLCFunction<ChallengeHistoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ChallengeHistoryCB.class);
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
    public HpSLCFunction<ChallengeHistoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ChallengeHistoryCB.class);
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
    public HpSLCFunction<ChallengeHistoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ChallengeHistoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ChallengeHistoryCB&gt;() {
     *     public void query(ChallengeHistoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ChallengeHistoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ChallengeHistoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ChallengeHistoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ChallengeHistoryCQ sq);

    protected ChallengeHistoryCB xcreateScalarConditionCB() {
        ChallengeHistoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ChallengeHistoryCB xcreateScalarConditionPartitionByCB() {
        ChallengeHistoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ChallengeHistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ChallengeHistoryCB cb = new ChallengeHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "challenge_history_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ChallengeHistoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ChallengeHistoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ChallengeHistoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ChallengeHistoryCB cb = new ChallengeHistoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "challenge_history_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ChallengeHistoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ChallengeHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ChallengeHistoryCB cb = new ChallengeHistoryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ChallengeHistoryCQ sq);

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
    protected ChallengeHistoryCB newMyCB() {
        return new ChallengeHistoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ChallengeHistoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
