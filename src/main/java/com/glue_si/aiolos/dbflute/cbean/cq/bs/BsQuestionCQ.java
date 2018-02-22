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
 * The base condition-query of question.
 * @author DBFlute(AutoGenerator)
 */
public class BsQuestionCQ extends AbstractBsQuestionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected QuestionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsQuestionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from question) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public QuestionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected QuestionCIQ xcreateCIQ() {
        QuestionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected QuestionCIQ xnewCIQ() {
        return new QuestionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join question on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public QuestionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        QuestionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _questionId;
    public ConditionValue xdfgetQuestionId()
    { if (_questionId == null) { _questionId = nCV(); }
      return _questionId; }
    protected ConditionValue xgetCValueQuestionId() { return xdfgetQuestionId(); }

    public Map<String, ChallengeDetailHistoryCQ> xdfgetQuestionId_ExistsReferrer_ChallengeDetailHistoryList() { return xgetSQueMap("questionId_ExistsReferrer_ChallengeDetailHistoryList"); }
    public String keepQuestionId_ExistsReferrer_ChallengeDetailHistoryList(ChallengeDetailHistoryCQ sq) { return xkeepSQue("questionId_ExistsReferrer_ChallengeDetailHistoryList", sq); }

    public Map<String, ChallengeDetailHistoryCQ> xdfgetQuestionId_NotExistsReferrer_ChallengeDetailHistoryList() { return xgetSQueMap("questionId_NotExistsReferrer_ChallengeDetailHistoryList"); }
    public String keepQuestionId_NotExistsReferrer_ChallengeDetailHistoryList(ChallengeDetailHistoryCQ sq) { return xkeepSQue("questionId_NotExistsReferrer_ChallengeDetailHistoryList", sq); }

    public Map<String, ChallengeDetailHistoryCQ> xdfgetQuestionId_SpecifyDerivedReferrer_ChallengeDetailHistoryList() { return xgetSQueMap("questionId_SpecifyDerivedReferrer_ChallengeDetailHistoryList"); }
    public String keepQuestionId_SpecifyDerivedReferrer_ChallengeDetailHistoryList(ChallengeDetailHistoryCQ sq) { return xkeepSQue("questionId_SpecifyDerivedReferrer_ChallengeDetailHistoryList", sq); }

    public Map<String, ChallengeDetailHistoryCQ> xdfgetQuestionId_QueryDerivedReferrer_ChallengeDetailHistoryList() { return xgetSQueMap("questionId_QueryDerivedReferrer_ChallengeDetailHistoryList"); }
    public String keepQuestionId_QueryDerivedReferrer_ChallengeDetailHistoryList(ChallengeDetailHistoryCQ sq) { return xkeepSQue("questionId_QueryDerivedReferrer_ChallengeDetailHistoryList", sq); }
    public Map<String, Object> xdfgetQuestionId_QueryDerivedReferrer_ChallengeDetailHistoryListParameter() { return xgetSQuePmMap("questionId_QueryDerivedReferrer_ChallengeDetailHistoryList"); }
    public String keepQuestionId_QueryDerivedReferrer_ChallengeDetailHistoryListParameter(Object pm) { return xkeepSQuePm("questionId_QueryDerivedReferrer_ChallengeDetailHistoryList", pm); }

    /**
     * Add order-by as ascend. <br>
     * question_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsQuestionCQ addOrderBy_QuestionId_Asc() { regOBA("question_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * question_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsQuestionCQ addOrderBy_QuestionId_Desc() { regOBD("question_id"); return this; }

    protected ConditionValue _keyword;
    public ConditionValue xdfgetKeyword()
    { if (_keyword == null) { _keyword = nCV(); }
      return _keyword; }
    protected ConditionValue xgetCValueKeyword() { return xdfgetKeyword(); }

    /**
     * Add order-by as ascend. <br>
     * keyword: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsQuestionCQ addOrderBy_Keyword_Asc() { regOBA("keyword"); return this; }

    /**
     * Add order-by as descend. <br>
     * keyword: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsQuestionCQ addOrderBy_Keyword_Desc() { regOBD("keyword"); return this; }

    protected ConditionValue _description;
    public ConditionValue xdfgetDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue xgetCValueDescription() { return xdfgetDescription(); }

    /**
     * Add order-by as ascend. <br>
     * description: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsQuestionCQ addOrderBy_Description_Asc() { regOBA("description"); return this; }

    /**
     * Add order-by as descend. <br>
     * description: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsQuestionCQ addOrderBy_Description_Desc() { regOBD("description"); return this; }

    protected ConditionValue _orderNum;
    public ConditionValue xdfgetOrderNum()
    { if (_orderNum == null) { _orderNum = nCV(); }
      return _orderNum; }
    protected ConditionValue xgetCValueOrderNum() { return xdfgetOrderNum(); }

    /**
     * Add order-by as ascend. <br>
     * order_num: {UQ, int4(10)}
     * @return this. (NotNull)
     */
    public BsQuestionCQ addOrderBy_OrderNum_Asc() { regOBA("order_num"); return this; }

    /**
     * Add order-by as descend. <br>
     * order_num: {UQ, int4(10)}
     * @return this. (NotNull)
     */
    public BsQuestionCQ addOrderBy_OrderNum_Desc() { regOBD("order_num"); return this; }

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
    public BsQuestionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsQuestionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, QuestionCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(QuestionCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, QuestionCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(QuestionCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, QuestionCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(QuestionCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, QuestionCQ> _myselfExistsMap;
    public Map<String, QuestionCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(QuestionCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, QuestionCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(QuestionCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return QuestionCB.class.getName(); }
    protected String xCQ() { return QuestionCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
