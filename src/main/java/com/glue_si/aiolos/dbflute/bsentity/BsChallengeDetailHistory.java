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
 * The entity of challenge_detail_history as TABLE. <br>
 * <pre>
 * [primary-key]
 *     histroy_detail_id
 *
 * [column]
 *     histroy_detail_id, challenge_history_id, question_id, answer, correct_flag
 *
 * [sequence]
 *     challenge_detail_history_histroy_detail_id_seq
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
 * Integer histroyDetailId = entity.getHistroyDetailId();
 * Integer challengeHistoryId = entity.getChallengeHistoryId();
 * Integer questionId = entity.getQuestionId();
 * String answer = entity.getAnswer();
 * Boolean correctFlag = entity.getCorrectFlag();
 * entity.setHistroyDetailId(histroyDetailId);
 * entity.setChallengeHistoryId(challengeHistoryId);
 * entity.setQuestionId(questionId);
 * entity.setAnswer(answer);
 * entity.setCorrectFlag(correctFlag);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsChallengeDetailHistory extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** histroy_detail_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _histroyDetailId;

    /** challenge_history_id: {NotNull, int4(10)} */
    protected Integer _challengeHistoryId;

    /** question_id: {NotNull, int4(10), FK to question} */
    protected Integer _questionId;

    /** answer: {text(2147483647)} */
    protected String _answer;

    /** correct_flag: {NotNull, bool(1)} */
    protected Boolean _correctFlag;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "challenge_detail_history";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_histroyDetailId == null) { return false; }
        return true;
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
        if (obj instanceof BsChallengeDetailHistory) {
            BsChallengeDetailHistory other = (BsChallengeDetailHistory)obj;
            if (!xSV(_histroyDetailId, other._histroyDetailId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _histroyDetailId);
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
        sb.append(dm).append(xfND(_histroyDetailId));
        sb.append(dm).append(xfND(_challengeHistoryId));
        sb.append(dm).append(xfND(_questionId));
        sb.append(dm).append(xfND(_answer));
        sb.append(dm).append(xfND(_correctFlag));
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
    public ChallengeDetailHistory clone() {
        return (ChallengeDetailHistory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] histroy_detail_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'histroy_detail_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getHistroyDetailId() {
        checkSpecifiedProperty("histroyDetailId");
        return _histroyDetailId;
    }

    /**
     * [set] histroy_detail_id: {PK, ID, NotNull, serial(10)} <br>
     * @param histroyDetailId The value of the column 'histroy_detail_id'. (basically NotNull if update: for the constraint)
     */
    public void setHistroyDetailId(Integer histroyDetailId) {
        registerModifiedProperty("histroyDetailId");
        _histroyDetailId = histroyDetailId;
    }

    /**
     * [get] challenge_history_id: {NotNull, int4(10)} <br>
     * @return The value of the column 'challenge_history_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getChallengeHistoryId() {
        checkSpecifiedProperty("challengeHistoryId");
        return _challengeHistoryId;
    }

    /**
     * [set] challenge_history_id: {NotNull, int4(10)} <br>
     * @param challengeHistoryId The value of the column 'challenge_history_id'. (basically NotNull if update: for the constraint)
     */
    public void setChallengeHistoryId(Integer challengeHistoryId) {
        registerModifiedProperty("challengeHistoryId");
        _challengeHistoryId = challengeHistoryId;
    }

    /**
     * [get] question_id: {NotNull, int4(10), FK to question} <br>
     * @return The value of the column 'question_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getQuestionId() {
        checkSpecifiedProperty("questionId");
        return _questionId;
    }

    /**
     * [set] question_id: {NotNull, int4(10), FK to question} <br>
     * @param questionId The value of the column 'question_id'. (basically NotNull if update: for the constraint)
     */
    public void setQuestionId(Integer questionId) {
        registerModifiedProperty("questionId");
        _questionId = questionId;
    }

    /**
     * [get] answer: {text(2147483647)} <br>
     * @return The value of the column 'answer'. (NullAllowed even if selected: for no constraint)
     */
    public String getAnswer() {
        checkSpecifiedProperty("answer");
        return _answer;
    }

    /**
     * [set] answer: {text(2147483647)} <br>
     * @param answer The value of the column 'answer'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAnswer(String answer) {
        registerModifiedProperty("answer");
        _answer = answer;
    }

    /**
     * [get] correct_flag: {NotNull, bool(1)} <br>
     * @return The value of the column 'correct_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getCorrectFlag() {
        checkSpecifiedProperty("correctFlag");
        return _correctFlag;
    }

    /**
     * [set] correct_flag: {NotNull, bool(1)} <br>
     * @param correctFlag The value of the column 'correct_flag'. (basically NotNull if update: for the constraint)
     */
    public void setCorrectFlag(Boolean correctFlag) {
        registerModifiedProperty("correctFlag");
        _correctFlag = correctFlag;
    }
}
