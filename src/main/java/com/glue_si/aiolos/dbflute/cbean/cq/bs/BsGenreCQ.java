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
 * The base condition-query of genre.
 * @author DBFlute(AutoGenerator)
 */
public class BsGenreCQ extends AbstractBsGenreCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected GenreCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsGenreCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from genre) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public GenreCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected GenreCIQ xcreateCIQ() {
        GenreCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected GenreCIQ xnewCIQ() {
        return new GenreCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join genre on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public GenreCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        GenreCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _genreId;
    public ConditionValue xdfgetGenreId()
    { if (_genreId == null) { _genreId = nCV(); }
      return _genreId; }
    protected ConditionValue xgetCValueGenreId() { return xdfgetGenreId(); }

    public Map<String, ChallengeHistoryCQ> xdfgetGenreId_ExistsReferrer_ChallengeHistoryList() { return xgetSQueMap("genreId_ExistsReferrer_ChallengeHistoryList"); }
    public String keepGenreId_ExistsReferrer_ChallengeHistoryList(ChallengeHistoryCQ sq) { return xkeepSQue("genreId_ExistsReferrer_ChallengeHistoryList", sq); }

    public Map<String, ChallengeHistoryCQ> xdfgetGenreId_NotExistsReferrer_ChallengeHistoryList() { return xgetSQueMap("genreId_NotExistsReferrer_ChallengeHistoryList"); }
    public String keepGenreId_NotExistsReferrer_ChallengeHistoryList(ChallengeHistoryCQ sq) { return xkeepSQue("genreId_NotExistsReferrer_ChallengeHistoryList", sq); }

    public Map<String, ChallengeHistoryCQ> xdfgetGenreId_SpecifyDerivedReferrer_ChallengeHistoryList() { return xgetSQueMap("genreId_SpecifyDerivedReferrer_ChallengeHistoryList"); }
    public String keepGenreId_SpecifyDerivedReferrer_ChallengeHistoryList(ChallengeHistoryCQ sq) { return xkeepSQue("genreId_SpecifyDerivedReferrer_ChallengeHistoryList", sq); }

    public Map<String, ChallengeHistoryCQ> xdfgetGenreId_QueryDerivedReferrer_ChallengeHistoryList() { return xgetSQueMap("genreId_QueryDerivedReferrer_ChallengeHistoryList"); }
    public String keepGenreId_QueryDerivedReferrer_ChallengeHistoryList(ChallengeHistoryCQ sq) { return xkeepSQue("genreId_QueryDerivedReferrer_ChallengeHistoryList", sq); }
    public Map<String, Object> xdfgetGenreId_QueryDerivedReferrer_ChallengeHistoryListParameter() { return xgetSQuePmMap("genreId_QueryDerivedReferrer_ChallengeHistoryList"); }
    public String keepGenreId_QueryDerivedReferrer_ChallengeHistoryListParameter(Object pm) { return xkeepSQuePm("genreId_QueryDerivedReferrer_ChallengeHistoryList", pm); }

    /**
     * Add order-by as ascend. <br>
     * genre_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_GenreId_Asc() { regOBA("genre_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * genre_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_GenreId_Desc() { regOBD("genre_id"); return this; }

    protected ConditionValue _genreName;
    public ConditionValue xdfgetGenreName()
    { if (_genreName == null) { _genreName = nCV(); }
      return _genreName; }
    protected ConditionValue xgetCValueGenreName() { return xdfgetGenreName(); }

    /**
     * Add order-by as ascend. <br>
     * genre_name: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_GenreName_Asc() { regOBA("genre_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * genre_name: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_GenreName_Desc() { regOBD("genre_name"); return this; }

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
    public BsGenreCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsGenreCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, GenreCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(GenreCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, GenreCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(GenreCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, GenreCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(GenreCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, GenreCQ> _myselfExistsMap;
    public Map<String, GenreCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(GenreCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, GenreCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(GenreCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return GenreCB.class.getName(); }
    protected String xCQ() { return GenreCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
