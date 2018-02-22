package com.glue_si.aiolos.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.glue_si.aiolos.dbflute.allcommon.DBMetaInstanceHandler;
import com.glue_si.aiolos.dbflute.exentity.*;

/**
 * The entity of challenge_history as TABLE. <br>
 * <pre>
 * [primary-key]
 *     challenge_history_id
 *
 * [column]
 *     challenge_history_id, score, attendance_rate, user_name, elapsed_time, correct_sum
 *
 * [sequence]
 *     challenge_history_challenge_history_id_seq
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer challengeHistoryId = entity.getChallengeHistoryId();
 * Integer score = entity.getScore();
 * Integer attendanceRate = entity.getAttendanceRate();
 * String userName = entity.getUserName();
 * Long elapsedTime = entity.getElapsedTime();
 * Integer correctSum = entity.getCorrectSum();
 * entity.setChallengeHistoryId(challengeHistoryId);
 * entity.setScore(score);
 * entity.setAttendanceRate(attendanceRate);
 * entity.setUserName(userName);
 * entity.setElapsedTime(elapsedTime);
 * entity.setCorrectSum(correctSum);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsChallengeHistory extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** challenge_history_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _challengeHistoryId;

    /** score: {NotNull, int4(10)} */
    protected Integer _score;

    /** attendance_rate: {NotNull, int4(10)} */
    protected Integer _attendanceRate;

    /** user_name: {NotNull, text(2147483647)} */
    protected String _userName;

    /** elapsed_time: {NotNull, int8(19), default=[0]} */
    protected Long _elapsedTime;

    /** correct_sum: {NotNull, int4(10), default=[0]} */
    protected Integer _correctSum;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "challenge_history";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_challengeHistoryId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsChallengeHistory) {
            BsChallengeHistory other = (BsChallengeHistory)obj;
            if (!xSV(_challengeHistoryId, other._challengeHistoryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _challengeHistoryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_challengeHistoryId));
        sb.append(dm).append(xfND(_score));
        sb.append(dm).append(xfND(_attendanceRate));
        sb.append(dm).append(xfND(_userName));
        sb.append(dm).append(xfND(_elapsedTime));
        sb.append(dm).append(xfND(_correctSum));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public ChallengeHistory clone() {
        return (ChallengeHistory)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] challenge_history_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'challenge_history_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getChallengeHistoryId() {
        checkSpecifiedProperty("challengeHistoryId");
        return _challengeHistoryId;
    }

    /**
     * [set] challenge_history_id: {PK, ID, NotNull, serial(10)} <br>
     * @param challengeHistoryId The value of the column 'challenge_history_id'. (basically NotNull if update: for the constraint)
     */
    public void setChallengeHistoryId(Integer challengeHistoryId) {
        registerModifiedProperty("challengeHistoryId");
        _challengeHistoryId = challengeHistoryId;
    }

    /**
     * [get] score: {NotNull, int4(10)} <br>
     * @return The value of the column 'score'. (basically NotNull if selected: for the constraint)
     */
    public Integer getScore() {
        checkSpecifiedProperty("score");
        return _score;
    }

    /**
     * [set] score: {NotNull, int4(10)} <br>
     * @param score The value of the column 'score'. (basically NotNull if update: for the constraint)
     */
    public void setScore(Integer score) {
        registerModifiedProperty("score");
        _score = score;
    }

    /**
     * [get] attendance_rate: {NotNull, int4(10)} <br>
     * @return The value of the column 'attendance_rate'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAttendanceRate() {
        checkSpecifiedProperty("attendanceRate");
        return _attendanceRate;
    }

    /**
     * [set] attendance_rate: {NotNull, int4(10)} <br>
     * @param attendanceRate The value of the column 'attendance_rate'. (basically NotNull if update: for the constraint)
     */
    public void setAttendanceRate(Integer attendanceRate) {
        registerModifiedProperty("attendanceRate");
        _attendanceRate = attendanceRate;
    }

    /**
     * [get] user_name: {NotNull, text(2147483647)} <br>
     * @return The value of the column 'user_name'. (basically NotNull if selected: for the constraint)
     */
    public String getUserName() {
        checkSpecifiedProperty("userName");
        return _userName;
    }

    /**
     * [set] user_name: {NotNull, text(2147483647)} <br>
     * @param userName The value of the column 'user_name'. (basically NotNull if update: for the constraint)
     */
    public void setUserName(String userName) {
        registerModifiedProperty("userName");
        _userName = userName;
    }

    /**
     * [get] elapsed_time: {NotNull, int8(19), default=[0]} <br>
     * @return The value of the column 'elapsed_time'. (basically NotNull if selected: for the constraint)
     */
    public Long getElapsedTime() {
        checkSpecifiedProperty("elapsedTime");
        return _elapsedTime;
    }

    /**
     * [set] elapsed_time: {NotNull, int8(19), default=[0]} <br>
     * @param elapsedTime The value of the column 'elapsed_time'. (basically NotNull if update: for the constraint)
     */
    public void setElapsedTime(Long elapsedTime) {
        registerModifiedProperty("elapsedTime");
        _elapsedTime = elapsedTime;
    }

    /**
     * [get] correct_sum: {NotNull, int4(10), default=[0]} <br>
     * @return The value of the column 'correct_sum'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCorrectSum() {
        checkSpecifiedProperty("correctSum");
        return _correctSum;
    }

    /**
     * [set] correct_sum: {NotNull, int4(10), default=[0]} <br>
     * @param correctSum The value of the column 'correct_sum'. (basically NotNull if update: for the constraint)
     */
    public void setCorrectSum(Integer correctSum) {
        registerModifiedProperty("correctSum");
        _correctSum = correctSum;
    }
}
