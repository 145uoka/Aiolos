package com.glue_si.aiolos.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.glue_si.aiolos.dbflute.allcommon.EntityDefinedCommonColumn;
import com.glue_si.aiolos.dbflute.allcommon.DBMetaInstanceHandler;
import com.glue_si.aiolos.dbflute.exentity.*;

/**
 * The entity of question as TABLE. <br>
 * <pre>
 * [primary-key]
 *     question_id
 *
 * [column]
 *     question_id, genre_id, question_num, answer_branch_no, description, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     question_question_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     challenge_detail_history, answer
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     challengeDetailHistoryList, answerList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer questionId = entity.getQuestionId();
 * Integer genreId = entity.getGenreId();
 * Integer questionNum = entity.getQuestionNum();
 * String answerBranchNo = entity.getAnswerBranchNo();
 * String description = entity.getDescription();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setQuestionId(questionId);
 * entity.setGenreId(genreId);
 * entity.setQuestionNum(questionNum);
 * entity.setAnswerBranchNo(answerBranchNo);
 * entity.setDescription(description);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsQuestion extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** question_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _questionId;

    /** genre_id: {NotNull, int4(10)} */
    protected Integer _genreId;

    /** question_num: {NotNull, int4(10)} */
    protected Integer _questionNum;

    /** answer_branch_no: {NotNull, text(2147483647)} */
    protected String _answerBranchNo;

    /** description: {text(2147483647)} */
    protected String _description;

    /** delete_flag: {NotNull, bool(1), default=[false]} */
    protected Boolean _deleteFlag;

    /** register_datetime: {NotNull, timestamp(26, 3), default=[now()]} */
    protected java.time.LocalDateTime _registerDatetime;

    /** update_datetime: {timestamp(26, 3)} */
    protected java.time.LocalDateTime _updateDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "question";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_questionId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** challenge_detail_history by question_id, named 'challengeDetailHistoryList'. */
    protected List<ChallengeDetailHistory> _challengeDetailHistoryList;

    /**
     * [get] challenge_detail_history by question_id, named 'challengeDetailHistoryList'.
     * @return The entity list of referrer property 'challengeDetailHistoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<ChallengeDetailHistory> getChallengeDetailHistoryList() {
        if (_challengeDetailHistoryList == null) { _challengeDetailHistoryList = newReferrerList(); }
        return _challengeDetailHistoryList;
    }

    /**
     * [set] challenge_detail_history by question_id, named 'challengeDetailHistoryList'.
     * @param challengeDetailHistoryList The entity list of referrer property 'challengeDetailHistoryList'. (NullAllowed)
     */
    public void setChallengeDetailHistoryList(List<ChallengeDetailHistory> challengeDetailHistoryList) {
        _challengeDetailHistoryList = challengeDetailHistoryList;
    }

    /** answer by question_id, named 'answerList'. */
    protected List<Answer> _answerList;

    /**
     * [get] answer by question_id, named 'answerList'.
     * @return The entity list of referrer property 'answerList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Answer> getAnswerList() {
        if (_answerList == null) { _answerList = newReferrerList(); }
        return _answerList;
    }

    /**
     * [set] answer by question_id, named 'answerList'.
     * @param answerList The entity list of referrer property 'answerList'. (NullAllowed)
     */
    public void setAnswerList(List<Answer> answerList) {
        _answerList = answerList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsQuestion) {
            BsQuestion other = (BsQuestion)obj;
            if (!xSV(_questionId, other._questionId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _questionId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_challengeDetailHistoryList != null) { for (ChallengeDetailHistory et : _challengeDetailHistoryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "challengeDetailHistoryList")); } } }
        if (_answerList != null) { for (Answer et : _answerList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "answerList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_questionId));
        sb.append(dm).append(xfND(_genreId));
        sb.append(dm).append(xfND(_questionNum));
        sb.append(dm).append(xfND(_answerBranchNo));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_deleteFlag));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_updateDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_challengeDetailHistoryList != null && !_challengeDetailHistoryList.isEmpty())
        { sb.append(dm).append("challengeDetailHistoryList"); }
        if (_answerList != null && !_answerList.isEmpty())
        { sb.append(dm).append("answerList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Question clone() {
        return (Question)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] question_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'question_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getQuestionId() {
        checkSpecifiedProperty("questionId");
        return _questionId;
    }

    /**
     * [set] question_id: {PK, ID, NotNull, serial(10)} <br>
     * @param questionId The value of the column 'question_id'. (basically NotNull if update: for the constraint)
     */
    public void setQuestionId(Integer questionId) {
        registerModifiedProperty("questionId");
        _questionId = questionId;
    }

    /**
     * [get] genre_id: {NotNull, int4(10)} <br>
     * @return The value of the column 'genre_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGenreId() {
        checkSpecifiedProperty("genreId");
        return _genreId;
    }

    /**
     * [set] genre_id: {NotNull, int4(10)} <br>
     * @param genreId The value of the column 'genre_id'. (basically NotNull if update: for the constraint)
     */
    public void setGenreId(Integer genreId) {
        registerModifiedProperty("genreId");
        _genreId = genreId;
    }

    /**
     * [get] question_num: {NotNull, int4(10)} <br>
     * @return The value of the column 'question_num'. (basically NotNull if selected: for the constraint)
     */
    public Integer getQuestionNum() {
        checkSpecifiedProperty("questionNum");
        return _questionNum;
    }

    /**
     * [set] question_num: {NotNull, int4(10)} <br>
     * @param questionNum The value of the column 'question_num'. (basically NotNull if update: for the constraint)
     */
    public void setQuestionNum(Integer questionNum) {
        registerModifiedProperty("questionNum");
        _questionNum = questionNum;
    }

    /**
     * [get] answer_branch_no: {NotNull, text(2147483647)} <br>
     * @return The value of the column 'answer_branch_no'. (basically NotNull if selected: for the constraint)
     */
    public String getAnswerBranchNo() {
        checkSpecifiedProperty("answerBranchNo");
        return _answerBranchNo;
    }

    /**
     * [set] answer_branch_no: {NotNull, text(2147483647)} <br>
     * @param answerBranchNo The value of the column 'answer_branch_no'. (basically NotNull if update: for the constraint)
     */
    public void setAnswerBranchNo(String answerBranchNo) {
        registerModifiedProperty("answerBranchNo");
        _answerBranchNo = answerBranchNo;
    }

    /**
     * [get] description: {text(2147483647)} <br>
     * @return The value of the column 'description'. (NullAllowed even if selected: for no constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return _description;
    }

    /**
     * [set] description: {text(2147483647)} <br>
     * @param description The value of the column 'description'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] delete_flag: {NotNull, bool(1), default=[false]} <br>
     * @return The value of the column 'delete_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDeleteFlag() {
        checkSpecifiedProperty("deleteFlag");
        return _deleteFlag;
    }

    /**
     * [set] delete_flag: {NotNull, bool(1), default=[false]} <br>
     * @param deleteFlag The value of the column 'delete_flag'. (basically NotNull if update: for the constraint)
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        registerModifiedProperty("deleteFlag");
        _deleteFlag = deleteFlag;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] update_datetime: {timestamp(26, 3)} <br>
     * @return The value of the column 'update_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {timestamp(26, 3)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }
}
