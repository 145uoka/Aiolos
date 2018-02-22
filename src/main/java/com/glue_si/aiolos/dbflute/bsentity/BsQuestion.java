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
 *     question_id, keyword, description, order_num, delete_flag, register_datetime, update_datetime
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
 *     challenge_detail_history
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     challengeDetailHistoryList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer questionId = entity.getQuestionId();
 * String keyword = entity.getKeyword();
 * String description = entity.getDescription();
 * Integer orderNum = entity.getOrderNum();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setQuestionId(questionId);
 * entity.setKeyword(keyword);
 * entity.setDescription(description);
 * entity.setOrderNum(orderNum);
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

    /** keyword: {NotNull, text(2147483647)} */
    protected String _keyword;

    /** description: {text(2147483647)} */
    protected String _description;

    /** order_num: {UQ, int4(10)} */
    protected Integer _orderNum;

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

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param orderNum : UQ, int4(10). (NotNull)
     */
    public void uniqueBy(Integer orderNum) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("orderNum");
        setOrderNum(orderNum);
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
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_questionId));
        sb.append(dm).append(xfND(_keyword));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_orderNum));
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
     * [get] keyword: {NotNull, text(2147483647)} <br>
     * @return The value of the column 'keyword'. (basically NotNull if selected: for the constraint)
     */
    public String getKeyword() {
        checkSpecifiedProperty("keyword");
        return _keyword;
    }

    /**
     * [set] keyword: {NotNull, text(2147483647)} <br>
     * @param keyword The value of the column 'keyword'. (basically NotNull if update: for the constraint)
     */
    public void setKeyword(String keyword) {
        registerModifiedProperty("keyword");
        _keyword = keyword;
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
     * [get] order_num: {UQ, int4(10)} <br>
     * @return The value of the column 'order_num'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getOrderNum() {
        checkSpecifiedProperty("orderNum");
        return _orderNum;
    }

    /**
     * [set] order_num: {UQ, int4(10)} <br>
     * @param orderNum The value of the column 'order_num'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderNum(Integer orderNum) {
        registerModifiedProperty("orderNum");
        _orderNum = orderNum;
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
