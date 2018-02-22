package com.glue_si.aiolos.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.glue_si.aiolos.dbflute.cbean.cq.ciq.*;
import com.glue_si.aiolos.dbflute.cbean.*;
import com.glue_si.aiolos.dbflute.cbean.cq.*;

/**
 * The base condition-query of challenge_history.
 * @author DBFlute(AutoGenerator)
 */
public class BsChallengeHistoryCQ extends AbstractBsChallengeHistoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ChallengeHistoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsChallengeHistoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from challenge_history) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ChallengeHistoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ChallengeHistoryCIQ xcreateCIQ() {
        ChallengeHistoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ChallengeHistoryCIQ xnewCIQ() {
        return new ChallengeHistoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join challenge_history on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ChallengeHistoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ChallengeHistoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _challengeHistoryId;
    public ConditionValue xdfgetChallengeHistoryId()
    { if (_challengeHistoryId == null) { _challengeHistoryId = nCV(); }
      return _challengeHistoryId; }
    protected ConditionValue xgetCValueChallengeHistoryId() { return xdfgetChallengeHistoryId(); }

    /**
     * Add order-by as ascend. <br>
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_ChallengeHistoryId_Asc() { regOBA("challenge_history_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_ChallengeHistoryId_Desc() { regOBD("challenge_history_id"); return this; }

    protected ConditionValue _score;
    public ConditionValue xdfgetScore()
    { if (_score == null) { _score = nCV(); }
      return _score; }
    protected ConditionValue xgetCValueScore() { return xdfgetScore(); }

    /**
     * Add order-by as ascend. <br>
     * score: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_Score_Asc() { regOBA("score"); return this; }

    /**
     * Add order-by as descend. <br>
     * score: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_Score_Desc() { regOBD("score"); return this; }

    protected ConditionValue _attendanceRate;
    public ConditionValue xdfgetAttendanceRate()
    { if (_attendanceRate == null) { _attendanceRate = nCV(); }
      return _attendanceRate; }
    protected ConditionValue xgetCValueAttendanceRate() { return xdfgetAttendanceRate(); }

    /**
     * Add order-by as ascend. <br>
     * attendance_rate: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_AttendanceRate_Asc() { regOBA("attendance_rate"); return this; }

    /**
     * Add order-by as descend. <br>
     * attendance_rate: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_AttendanceRate_Desc() { regOBD("attendance_rate"); return this; }

    protected ConditionValue _userName;
    public ConditionValue xdfgetUserName()
    { if (_userName == null) { _userName = nCV(); }
      return _userName; }
    protected ConditionValue xgetCValueUserName() { return xdfgetUserName(); }

    /**
     * Add order-by as ascend. <br>
     * user_name: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_UserName_Asc() { regOBA("user_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * user_name: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_UserName_Desc() { regOBD("user_name"); return this; }

    protected ConditionValue _elapsedTime;
    public ConditionValue xdfgetElapsedTime()
    { if (_elapsedTime == null) { _elapsedTime = nCV(); }
      return _elapsedTime; }
    protected ConditionValue xgetCValueElapsedTime() { return xdfgetElapsedTime(); }

    /**
     * Add order-by as ascend. <br>
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_ElapsedTime_Asc() { regOBA("elapsed_time"); return this; }

    /**
     * Add order-by as descend. <br>
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_ElapsedTime_Desc() { regOBD("elapsed_time"); return this; }

    protected ConditionValue _correctSum;
    public ConditionValue xdfgetCorrectSum()
    { if (_correctSum == null) { _correctSum = nCV(); }
      return _correctSum; }
    protected ConditionValue xgetCValueCorrectSum() { return xdfgetCorrectSum(); }

    /**
     * Add order-by as ascend. <br>
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_CorrectSum_Asc() { regOBA("correct_sum"); return this; }

    /**
     * Add order-by as descend. <br>
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_CorrectSum_Desc() { regOBD("correct_sum"); return this; }

    protected ConditionValue _deleteFlag;
    public ConditionValue xdfgetDeleteFlag()
    { if (_deleteFlag == null) { _deleteFlag = nCV(); }
      return _deleteFlag; }
    protected ConditionValue xgetCValueDeleteFlag() { return xdfgetDeleteFlag(); }

    /**
     * Add order-by as ascend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsChallengeHistoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ChallengeHistoryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ChallengeHistoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ChallengeHistoryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ChallengeHistoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ChallengeHistoryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ChallengeHistoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ChallengeHistoryCQ> _myselfExistsMap;
    public Map<String, ChallengeHistoryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ChallengeHistoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ChallengeHistoryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ChallengeHistoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ChallengeHistoryCB.class.getName(); }
    protected String xCQ() { return ChallengeHistoryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
