package com.glue_si.aiolos.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.glue_si.aiolos.dbflute.cbean.*;
import com.glue_si.aiolos.dbflute.cbean.cq.bs.*;
import com.glue_si.aiolos.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of question.
 * @author DBFlute(AutoGenerator)
 */
public class QuestionCIQ extends AbstractBsQuestionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsQuestionCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public QuestionCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsQuestionCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueQuestionId() { return _myCQ.xdfgetQuestionId(); }
    public String keepQuestionId_ExistsReferrer_ChallengeDetailHistoryList(ChallengeDetailHistoryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepQuestionId_ExistsReferrer_AnswerList(AnswerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepQuestionId_NotExistsReferrer_ChallengeDetailHistoryList(ChallengeDetailHistoryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepQuestionId_NotExistsReferrer_AnswerList(AnswerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepQuestionId_SpecifyDerivedReferrer_ChallengeDetailHistoryList(ChallengeDetailHistoryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepQuestionId_SpecifyDerivedReferrer_AnswerList(AnswerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepQuestionId_QueryDerivedReferrer_ChallengeDetailHistoryList(ChallengeDetailHistoryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepQuestionId_QueryDerivedReferrer_ChallengeDetailHistoryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepQuestionId_QueryDerivedReferrer_AnswerList(AnswerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepQuestionId_QueryDerivedReferrer_AnswerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueGenreId() { return _myCQ.xdfgetGenreId(); }
    protected ConditionValue xgetCValueQuestionNum() { return _myCQ.xdfgetQuestionNum(); }
    protected ConditionValue xgetCValueAnswerBranchNo() { return _myCQ.xdfgetAnswerBranchNo(); }
    protected ConditionValue xgetCValueDescription() { return _myCQ.xdfgetDescription(); }
    protected ConditionValue xgetCValueDeleteFlag() { return _myCQ.xdfgetDeleteFlag(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(QuestionCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(QuestionCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(QuestionCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(QuestionCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return QuestionCB.class.getName(); }
    protected String xinCQ() { return QuestionCQ.class.getName(); }
}
