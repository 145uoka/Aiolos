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
 * The abstract condition-query of answer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsAnswerCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsAnswerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "answer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @param anwerId The value of anwerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAnwerId_Equal(Integer anwerId) {
        doSetAnwerId_Equal(anwerId);
    }

    protected void doSetAnwerId_Equal(Integer anwerId) {
        regAnwerId(CK_EQ, anwerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @param anwerId The value of anwerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAnwerId_NotEqual(Integer anwerId) {
        doSetAnwerId_NotEqual(anwerId);
    }

    protected void doSetAnwerId_NotEqual(Integer anwerId) {
        regAnwerId(CK_NES, anwerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @param anwerId The value of anwerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAnwerId_GreaterThan(Integer anwerId) {
        regAnwerId(CK_GT, anwerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @param anwerId The value of anwerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAnwerId_LessThan(Integer anwerId) {
        regAnwerId(CK_LT, anwerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @param anwerId The value of anwerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAnwerId_GreaterEqual(Integer anwerId) {
        regAnwerId(CK_GE, anwerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @param anwerId The value of anwerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAnwerId_LessEqual(Integer anwerId) {
        regAnwerId(CK_LE, anwerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of anwerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of anwerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAnwerId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAnwerId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of anwerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of anwerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAnwerId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAnwerId(), "anwer_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @param anwerIdList The collection of anwerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwerId_InScope(Collection<Integer> anwerIdList) {
        doSetAnwerId_InScope(anwerIdList);
    }

    protected void doSetAnwerId_InScope(Collection<Integer> anwerIdList) {
        regINS(CK_INS, cTL(anwerIdList), xgetCValueAnwerId(), "anwer_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @param anwerIdList The collection of anwerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAnwerId_NotInScope(Collection<Integer> anwerIdList) {
        doSetAnwerId_NotInScope(anwerIdList);
    }

    protected void doSetAnwerId_NotInScope(Collection<Integer> anwerIdList) {
        regINS(CK_NINS, cTL(anwerIdList), xgetCValueAnwerId(), "anwer_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     */
    public void setAnwerId_IsNull() { regAnwerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * anwer_id: {PK, ID, NotNull, serial(10)}
     */
    public void setAnwerId_IsNotNull() { regAnwerId(CK_ISNN, DOBJ); }

    protected void regAnwerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAnwerId(), "anwer_id"); }
    protected abstract ConditionValue xgetCValueAnwerId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {UQ+, NotNull, int4(10), FK to question}
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
     * question_id: {UQ+, NotNull, int4(10), FK to question}
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
     * question_id: {UQ+, NotNull, int4(10), FK to question}
     * @param questionId The value of questionId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_GreaterThan(Integer questionId) {
        regQuestionId(CK_GT, questionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {UQ+, NotNull, int4(10), FK to question}
     * @param questionId The value of questionId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_LessThan(Integer questionId) {
        regQuestionId(CK_LT, questionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {UQ+, NotNull, int4(10), FK to question}
     * @param questionId The value of questionId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_GreaterEqual(Integer questionId) {
        regQuestionId(CK_GE, questionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {UQ+, NotNull, int4(10), FK to question}
     * @param questionId The value of questionId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestionId_LessEqual(Integer questionId) {
        regQuestionId(CK_LE, questionId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * question_id: {UQ+, NotNull, int4(10), FK to question}
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
     * question_id: {UQ+, NotNull, int4(10), FK to question}
     * @param minNumber The min number of questionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of questionId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setQuestionId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQuestionId(), "question_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * question_id: {UQ+, NotNull, int4(10), FK to question}
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
     * question_id: {UQ+, NotNull, int4(10), FK to question}
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * branch_no: {+UQ, NotNull, int4(10)}
     * @param branchNo The value of branchNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBranchNo_Equal(Integer branchNo) {
        doSetBranchNo_Equal(branchNo);
    }

    protected void doSetBranchNo_Equal(Integer branchNo) {
        regBranchNo(CK_EQ, branchNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * branch_no: {+UQ, NotNull, int4(10)}
     * @param branchNo The value of branchNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBranchNo_NotEqual(Integer branchNo) {
        doSetBranchNo_NotEqual(branchNo);
    }

    protected void doSetBranchNo_NotEqual(Integer branchNo) {
        regBranchNo(CK_NES, branchNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * branch_no: {+UQ, NotNull, int4(10)}
     * @param branchNo The value of branchNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBranchNo_GreaterThan(Integer branchNo) {
        regBranchNo(CK_GT, branchNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * branch_no: {+UQ, NotNull, int4(10)}
     * @param branchNo The value of branchNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBranchNo_LessThan(Integer branchNo) {
        regBranchNo(CK_LT, branchNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * branch_no: {+UQ, NotNull, int4(10)}
     * @param branchNo The value of branchNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBranchNo_GreaterEqual(Integer branchNo) {
        regBranchNo(CK_GE, branchNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * branch_no: {+UQ, NotNull, int4(10)}
     * @param branchNo The value of branchNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBranchNo_LessEqual(Integer branchNo) {
        regBranchNo(CK_LE, branchNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * branch_no: {+UQ, NotNull, int4(10)}
     * @param minNumber The min number of branchNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of branchNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBranchNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBranchNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * branch_no: {+UQ, NotNull, int4(10)}
     * @param minNumber The min number of branchNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of branchNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBranchNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBranchNo(), "branch_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * branch_no: {+UQ, NotNull, int4(10)}
     * @param branchNoList The collection of branchNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranchNo_InScope(Collection<Integer> branchNoList) {
        doSetBranchNo_InScope(branchNoList);
    }

    protected void doSetBranchNo_InScope(Collection<Integer> branchNoList) {
        regINS(CK_INS, cTL(branchNoList), xgetCValueBranchNo(), "branch_no");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * branch_no: {+UQ, NotNull, int4(10)}
     * @param branchNoList The collection of branchNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBranchNo_NotInScope(Collection<Integer> branchNoList) {
        doSetBranchNo_NotInScope(branchNoList);
    }

    protected void doSetBranchNo_NotInScope(Collection<Integer> branchNoList) {
        regINS(CK_NINS, cTL(branchNoList), xgetCValueBranchNo(), "branch_no");
    }

    protected void regBranchNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBranchNo(), "branch_no"); }
    protected abstract ConditionValue xgetCValueBranchNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * label: {text(2147483647)}
     * @param label The value of label as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabel_Equal(String label) {
        doSetLabel_Equal(fRES(label));
    }

    protected void doSetLabel_Equal(String label) {
        regLabel(CK_EQ, label);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * label: {text(2147483647)}
     * @param label The value of label as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabel_NotEqual(String label) {
        doSetLabel_NotEqual(fRES(label));
    }

    protected void doSetLabel_NotEqual(String label) {
        regLabel(CK_NES, label);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * label: {text(2147483647)}
     * @param label The value of label as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabel_GreaterThan(String label) {
        regLabel(CK_GT, fRES(label));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * label: {text(2147483647)}
     * @param label The value of label as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabel_LessThan(String label) {
        regLabel(CK_LT, fRES(label));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * label: {text(2147483647)}
     * @param label The value of label as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabel_GreaterEqual(String label) {
        regLabel(CK_GE, fRES(label));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * label: {text(2147483647)}
     * @param label The value of label as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabel_LessEqual(String label) {
        regLabel(CK_LE, fRES(label));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * label: {text(2147483647)}
     * @param labelList The collection of label as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabel_InScope(Collection<String> labelList) {
        doSetLabel_InScope(labelList);
    }

    protected void doSetLabel_InScope(Collection<String> labelList) {
        regINS(CK_INS, cTL(labelList), xgetCValueLabel(), "label");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * label: {text(2147483647)}
     * @param labelList The collection of label as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabel_NotInScope(Collection<String> labelList) {
        doSetLabel_NotInScope(labelList);
    }

    protected void doSetLabel_NotInScope(Collection<String> labelList) {
        regINS(CK_NINS, cTL(labelList), xgetCValueLabel(), "label");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * label: {text(2147483647)} <br>
     * <pre>e.g. setLabel_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param label The value of label as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLabel_LikeSearch(String label, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLabel_LikeSearch(label, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * label: {text(2147483647)} <br>
     * <pre>e.g. setLabel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param label The value of label as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLabel_LikeSearch(String label, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(label), xgetCValueLabel(), "label", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * label: {text(2147483647)}
     * @param label The value of label as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLabel_NotLikeSearch(String label, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLabel_NotLikeSearch(label, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * label: {text(2147483647)}
     * @param label The value of label as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLabel_NotLikeSearch(String label, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(label), xgetCValueLabel(), "label", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * label: {text(2147483647)}
     */
    public void setLabel_IsNull() { regLabel(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * label: {text(2147483647)}
     */
    public void setLabel_IsNullOrEmpty() { regLabel(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * label: {text(2147483647)}
     */
    public void setLabel_IsNotNull() { regLabel(CK_ISNN, DOBJ); }

    protected void regLabel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLabel(), "label"); }
    protected abstract ConditionValue xgetCValueLabel();

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
    public HpSLCFunction<AnswerCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, AnswerCB.class);
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
    public HpSLCFunction<AnswerCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, AnswerCB.class);
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
    public HpSLCFunction<AnswerCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, AnswerCB.class);
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
    public HpSLCFunction<AnswerCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, AnswerCB.class);
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
    public HpSLCFunction<AnswerCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, AnswerCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AnswerCB&gt;() {
     *     public void query(AnswerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AnswerCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, AnswerCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        AnswerCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(AnswerCQ sq);

    protected AnswerCB xcreateScalarConditionCB() {
        AnswerCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected AnswerCB xcreateScalarConditionPartitionByCB() {
        AnswerCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<AnswerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AnswerCB cb = new AnswerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "anwer_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(AnswerCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<AnswerCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(AnswerCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AnswerCB cb = new AnswerCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "anwer_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(AnswerCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<AnswerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AnswerCB cb = new AnswerCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(AnswerCQ sq);

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
    protected AnswerCB newMyCB() {
        return new AnswerCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return AnswerCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
