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
 * The base condition-query of challenge_detail_history.
 * @author DBFlute(AutoGenerator)
 */
public class BsChallengeDetailHistoryCQ extends AbstractBsChallengeDetailHistoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ChallengeDetailHistoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsChallengeDetailHistoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from challenge_detail_history) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ChallengeDetailHistoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ChallengeDetailHistoryCIQ xcreateCIQ() {
        ChallengeDetailHistoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ChallengeDetailHistoryCIQ xnewCIQ() {
        return new ChallengeDetailHistoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join challenge_detail_history on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ChallengeDetailHistoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ChallengeDetailHistoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _histroyDetailId;
    public ConditionValue xdfgetHistroyDetailId()
    { if (_histroyDetailId == null) { _histroyDetailId = nCV(); }
      return _histroyDetailId; }
    protected ConditionValue xgetCValueHistroyDetailId() { return xdfgetHistroyDetailId(); }

    /**
     * Add order-by as ascend. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsChallengeDetailHistoryCQ addOrderBy_HistroyDetailId_Asc() { regOBA("histroy_detail_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsChallengeDetailHistoryCQ addOrderBy_HistroyDetailId_Desc() { regOBD("histroy_detail_id"); return this; }

    protected ConditionValue _challengeHistoryId;
    public ConditionValue xdfgetChallengeHistoryId()
    { if (_challengeHistoryId == null) { _challengeHistoryId = nCV(); }
      return _challengeHistoryId; }
    protected ConditionValue xgetCValueChallengeHistoryId() { return xdfgetChallengeHistoryId(); }

    /**
     * Add order-by as ascend. <br>
     * challenge_history_id: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsChallengeDetailHistoryCQ addOrderBy_ChallengeHistoryId_Asc() { regOBA("challenge_history_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * challenge_history_id: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsChallengeDetailHistoryCQ addOrderBy_ChallengeHistoryId_Desc() { regOBD("challenge_history_id"); return this; }

    protected ConditionValue _questionId;
    public ConditionValue xdfgetQuestionId()
    { if (_questionId == null) { _questionId = nCV(); }
      return _questionId; }
    protected ConditionValue xgetCValueQuestionId() { return xdfgetQuestionId(); }

    /**
     * Add order-by as ascend. <br>
     * question_id: {NotNull, int4(10), FK to question}
     * @return this. (NotNull)
     */
    public BsChallengeDetailHistoryCQ addOrderBy_QuestionId_Asc() { regOBA("question_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * question_id: {NotNull, int4(10), FK to question}
     * @return this. (NotNull)
     */
    public BsChallengeDetailHistoryCQ addOrderBy_QuestionId_Desc() { regOBD("question_id"); return this; }

    protected ConditionValue _answer;
    public ConditionValue xdfgetAnswer()
    { if (_answer == null) { _answer = nCV(); }
      return _answer; }
    protected ConditionValue xgetCValueAnswer() { return xdfgetAnswer(); }

    /**
     * Add order-by as ascend. <br>
     * answer: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsChallengeDetailHistoryCQ addOrderBy_Answer_Asc() { regOBA("answer"); return this; }

    /**
     * Add order-by as descend. <br>
     * answer: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsChallengeDetailHistoryCQ addOrderBy_Answer_Desc() { regOBD("answer"); return this; }

    protected ConditionValue _correctFlag;
    public ConditionValue xdfgetCorrectFlag()
    { if (_correctFlag == null) { _correctFlag = nCV(); }
      return _correctFlag; }
    protected ConditionValue xgetCValueCorrectFlag() { return xdfgetCorrectFlag(); }

    /**
     * Add order-by as ascend. <br>
     * correct_flag: {NotNull, bool(1)}
     * @return this. (NotNull)
     */
    public BsChallengeDetailHistoryCQ addOrderBy_CorrectFlag_Asc() { regOBA("correct_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * correct_flag: {NotNull, bool(1)}
     * @return this. (NotNull)
     */
    public BsChallengeDetailHistoryCQ addOrderBy_CorrectFlag_Desc() { regOBD("correct_flag"); return this; }

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
    public BsChallengeDetailHistoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsChallengeDetailHistoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ChallengeDetailHistoryCQ bq = (ChallengeDetailHistoryCQ)bqs;
        ChallengeDetailHistoryCQ uq = (ChallengeDetailHistoryCQ)uqs;
        if (bq.hasConditionQueryQuestion()) {
            uq.queryQuestion().reflectRelationOnUnionQuery(bq.queryQuestion(), uq.queryQuestion());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * question by my question_id, named 'question'.
     * @return The instance of condition-query. (NotNull)
     */
    public QuestionCQ queryQuestion() {
        return xdfgetConditionQueryQuestion();
    }
    public QuestionCQ xdfgetConditionQueryQuestion() {
        String prop = "question";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryQuestion()); xsetupOuterJoinQuestion(); }
        return xgetQueRlMap(prop);
    }
    protected QuestionCQ xcreateQueryQuestion() {
        String nrp = xresolveNRP("challenge_detail_history", "question"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new QuestionCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "question", nrp);
    }
    protected void xsetupOuterJoinQuestion() { xregOutJo("question"); }
    public boolean hasConditionQueryQuestion() { return xhasQueRlMap("question"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ChallengeDetailHistoryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ChallengeDetailHistoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ChallengeDetailHistoryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ChallengeDetailHistoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ChallengeDetailHistoryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ChallengeDetailHistoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ChallengeDetailHistoryCQ> _myselfExistsMap;
    public Map<String, ChallengeDetailHistoryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ChallengeDetailHistoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ChallengeDetailHistoryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ChallengeDetailHistoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ChallengeDetailHistoryCB.class.getName(); }
    protected String xCQ() { return ChallengeDetailHistoryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
