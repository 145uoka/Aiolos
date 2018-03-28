package com.glue_si.aiolos.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.glue_si.aiolos.dbflute.allcommon.DBMetaInstanceHandler;
import com.glue_si.aiolos.dbflute.exentity.*;

/**
 * The entity of answer as TABLE. <br>
 * <pre>
 * [primary-key]
 *     anwer_id
 *
 * [column]
 *     anwer_id, question_id, branch_no, label
 *
 * [sequence]
 *     answer_anwer_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     question
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     question
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer anwerId = entity.getAnwerId();
 * Integer questionId = entity.getQuestionId();
 * Integer branchNo = entity.getBranchNo();
 * String label = entity.getLabel();
 * entity.setAnwerId(anwerId);
 * entity.setQuestionId(questionId);
 * entity.setBranchNo(branchNo);
 * entity.setLabel(label);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAnswer extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** anwer_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _anwerId;

    /** question_id: {UQ+, NotNull, int4(10), FK to question} */
    protected Integer _questionId;

    /** branch_no: {+UQ, NotNull, int4(10)} */
    protected Integer _branchNo;

    /** label: {text(2147483647)} */
    protected String _label;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "answer";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_anwerId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param questionId : UQ+, NotNull, int4(10), FK to question. (NotNull)
     * @param branchNo : +UQ, NotNull, int4(10). (NotNull)
     */
    public void uniqueBy(Integer questionId, Integer branchNo) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("questionId");
        __uniqueDrivenProperties.addPropertyName("branchNo");
        setQuestionId(questionId);setBranchNo(branchNo);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** question by my question_id, named 'question'. */
    protected OptionalEntity<Question> _question;

    /**
     * [get] question by my question_id, named 'question'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'question'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Question> getQuestion() {
        if (_question == null) { _question = OptionalEntity.relationEmpty(this, "question"); }
        return _question;
    }

    /**
     * [set] question by my question_id, named 'question'.
     * @param question The entity of foreign property 'question'. (NullAllowed)
     */
    public void setQuestion(OptionalEntity<Question> question) {
        _question = question;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsAnswer) {
            BsAnswer other = (BsAnswer)obj;
            if (!xSV(_anwerId, other._anwerId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _anwerId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_question != null && _question.isPresent())
        { sb.append(li).append(xbRDS(_question, "question")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_anwerId));
        sb.append(dm).append(xfND(_questionId));
        sb.append(dm).append(xfND(_branchNo));
        sb.append(dm).append(xfND(_label));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_question != null && _question.isPresent())
        { sb.append(dm).append("question"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Answer clone() {
        return (Answer)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] anwer_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'anwer_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAnwerId() {
        checkSpecifiedProperty("anwerId");
        return _anwerId;
    }

    /**
     * [set] anwer_id: {PK, ID, NotNull, serial(10)} <br>
     * @param anwerId The value of the column 'anwer_id'. (basically NotNull if update: for the constraint)
     */
    public void setAnwerId(Integer anwerId) {
        registerModifiedProperty("anwerId");
        _anwerId = anwerId;
    }

    /**
     * [get] question_id: {UQ+, NotNull, int4(10), FK to question} <br>
     * @return The value of the column 'question_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getQuestionId() {
        checkSpecifiedProperty("questionId");
        return _questionId;
    }

    /**
     * [set] question_id: {UQ+, NotNull, int4(10), FK to question} <br>
     * @param questionId The value of the column 'question_id'. (basically NotNull if update: for the constraint)
     */
    public void setQuestionId(Integer questionId) {
        registerModifiedProperty("questionId");
        _questionId = questionId;
    }

    /**
     * [get] branch_no: {+UQ, NotNull, int4(10)} <br>
     * @return The value of the column 'branch_no'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBranchNo() {
        checkSpecifiedProperty("branchNo");
        return _branchNo;
    }

    /**
     * [set] branch_no: {+UQ, NotNull, int4(10)} <br>
     * @param branchNo The value of the column 'branch_no'. (basically NotNull if update: for the constraint)
     */
    public void setBranchNo(Integer branchNo) {
        registerModifiedProperty("branchNo");
        _branchNo = branchNo;
    }

    /**
     * [get] label: {text(2147483647)} <br>
     * @return The value of the column 'label'. (NullAllowed even if selected: for no constraint)
     */
    public String getLabel() {
        checkSpecifiedProperty("label");
        return _label;
    }

    /**
     * [set] label: {text(2147483647)} <br>
     * @param label The value of the column 'label'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLabel(String label) {
        registerModifiedProperty("label");
        _label = label;
    }
}
