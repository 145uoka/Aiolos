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
 * The base condition-query of answer.
 * @author DBFlute(AutoGenerator)
 */
public class BsAnswerCQ extends AbstractBsAnswerCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AnswerCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAnswerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from answer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AnswerCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AnswerCIQ xcreateCIQ() {
        AnswerCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AnswerCIQ xnewCIQ() {
        return new AnswerCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join answer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AnswerCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AnswerCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _anwerId;
    public ConditionValue xdfgetAnwerId()
    { if (_anwerId == null) { _anwerId = nCV(); }
      return _anwerId; }
    protected ConditionValue xgetCValueAnwerId() { return xdfgetAnwerId(); }

    /**
     * Add order-by as ascend. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsAnswerCQ addOrderBy_AnwerId_Asc() { regOBA("anwer_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsAnswerCQ addOrderBy_AnwerId_Desc() { regOBD("anwer_id"); return this; }

    protected ConditionValue _questionId;
    public ConditionValue xdfgetQuestionId()
    { if (_questionId == null) { _questionId = nCV(); }
      return _questionId; }
    protected ConditionValue xgetCValueQuestionId() { return xdfgetQuestionId(); }

    /**
     * Add order-by as ascend. <br>
     * question_id: {UQ+, NotNull, int4(10), FK to question}
     * @return this. (NotNull)
     */
    public BsAnswerCQ addOrderBy_QuestionId_Asc() { regOBA("question_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * question_id: {UQ+, NotNull, int4(10), FK to question}
     * @return this. (NotNull)
     */
    public BsAnswerCQ addOrderBy_QuestionId_Desc() { regOBD("question_id"); return this; }

    protected ConditionValue _branchNo;
    public ConditionValue xdfgetBranchNo()
    { if (_branchNo == null) { _branchNo = nCV(); }
      return _branchNo; }
    protected ConditionValue xgetCValueBranchNo() { return xdfgetBranchNo(); }

    /**
     * Add order-by as ascend. <br>
     * branch_no: {+UQ, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsAnswerCQ addOrderBy_BranchNo_Asc() { regOBA("branch_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * branch_no: {+UQ, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsAnswerCQ addOrderBy_BranchNo_Desc() { regOBD("branch_no"); return this; }

    protected ConditionValue _label;
    public ConditionValue xdfgetLabel()
    { if (_label == null) { _label = nCV(); }
      return _label; }
    protected ConditionValue xgetCValueLabel() { return xdfgetLabel(); }

    /**
     * Add order-by as ascend. <br>
     * label: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsAnswerCQ addOrderBy_Label_Asc() { regOBA("label"); return this; }

    /**
     * Add order-by as descend. <br>
     * label: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsAnswerCQ addOrderBy_Label_Desc() { regOBD("label"); return this; }

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
    public BsAnswerCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsAnswerCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        AnswerCQ bq = (AnswerCQ)bqs;
        AnswerCQ uq = (AnswerCQ)uqs;
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
        String nrp = xresolveNRP("answer", "question"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, AnswerCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(AnswerCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, AnswerCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(AnswerCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, AnswerCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(AnswerCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, AnswerCQ> _myselfExistsMap;
    public Map<String, AnswerCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(AnswerCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, AnswerCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(AnswerCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AnswerCB.class.getName(); }
    protected String xCQ() { return AnswerCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
