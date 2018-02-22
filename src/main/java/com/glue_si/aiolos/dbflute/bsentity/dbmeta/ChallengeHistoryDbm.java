package com.glue_si.aiolos.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.glue_si.aiolos.dbflute.allcommon.*;
import com.glue_si.aiolos.dbflute.exentity.*;

/**
 * The DB meta of challenge_history. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ChallengeHistoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ChallengeHistoryDbm _instance = new ChallengeHistoryDbm();
    private ChallengeHistoryDbm() {}
    public static ChallengeHistoryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((ChallengeHistory)et).getChallengeHistoryId(), (et, vl) -> ((ChallengeHistory)et).setChallengeHistoryId(cti(vl)), "challengeHistoryId");
        setupEpg(_epgMap, et -> ((ChallengeHistory)et).getScore(), (et, vl) -> ((ChallengeHistory)et).setScore(cti(vl)), "score");
        setupEpg(_epgMap, et -> ((ChallengeHistory)et).getAttendanceRate(), (et, vl) -> ((ChallengeHistory)et).setAttendanceRate(cti(vl)), "attendanceRate");
        setupEpg(_epgMap, et -> ((ChallengeHistory)et).getUserName(), (et, vl) -> ((ChallengeHistory)et).setUserName((String)vl), "userName");
        setupEpg(_epgMap, et -> ((ChallengeHistory)et).getElapsedTime(), (et, vl) -> ((ChallengeHistory)et).setElapsedTime(ctl(vl)), "elapsedTime");
        setupEpg(_epgMap, et -> ((ChallengeHistory)et).getCorrectSum(), (et, vl) -> ((ChallengeHistory)et).setCorrectSum(cti(vl)), "correctSum");
        setupEpg(_epgMap, et -> ((ChallengeHistory)et).getDeleteFlag(), (et, vl) -> ((ChallengeHistory)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((ChallengeHistory)et).getRegisterDatetime(), (et, vl) -> ((ChallengeHistory)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((ChallengeHistory)et).getUpdateDatetime(), (et, vl) -> ((ChallengeHistory)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "challenge_history";
    protected final String _tableDispName = "challenge_history";
    protected final String _tablePropertyName = "challengeHistory";
    protected final TableSqlName _tableSqlName = new TableSqlName("challenge_history", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnChallengeHistoryId = cci("challenge_history_id", "challenge_history_id", null, null, Integer.class, "challengeHistoryId", null, true, true, true, "serial", 10, 0, null, "nextval('challenge_history_challenge_history_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScore = cci("score", "score", null, null, Integer.class, "score", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAttendanceRate = cci("attendance_rate", "attendance_rate", null, null, Integer.class, "attendanceRate", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserName = cci("user_name", "user_name", null, null, String.class, "userName", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnElapsedTime = cci("elapsed_time", "elapsed_time", null, null, Long.class, "elapsedTime", null, false, false, true, "int8", 19, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCorrectSum = cci("correct_sum", "correct_sum", null, null, Integer.class, "correctSum", null, false, false, true, "int4", 10, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * challenge_history_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChallengeHistoryId() { return _columnChallengeHistoryId; }
    /**
     * score: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScore() { return _columnScore; }
    /**
     * attendance_rate: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAttendanceRate() { return _columnAttendanceRate; }
    /**
     * user_name: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserName() { return _columnUserName; }
    /**
     * elapsed_time: {NotNull, int8(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnElapsedTime() { return _columnElapsedTime; }
    /**
     * correct_sum: {NotNull, int4(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorrectSum() { return _columnCorrectSum; }
    /**
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeleteFlag() { return _columnDeleteFlag; }
    /**
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * update_datetime: {timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnChallengeHistoryId());
        ls.add(columnScore());
        ls.add(columnAttendanceRate());
        ls.add(columnUserName());
        ls.add(columnElapsedTime());
        ls.add(columnCorrectSum());
        ls.add(columnDeleteFlag());
        ls.add(columnRegisterDatetime());
        ls.add(columnUpdateDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnChallengeHistoryId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "challenge_history_challenge_history_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnUpdateDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.glue_si.aiolos.dbflute.exentity.ChallengeHistory"; }
    public String getConditionBeanTypeName() { return "com.glue_si.aiolos.dbflute.cbean.ChallengeHistoryCB"; }
    public String getBehaviorTypeName() { return "com.glue_si.aiolos.dbflute.exbhv.ChallengeHistoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ChallengeHistory> getEntityType() { return ChallengeHistory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ChallengeHistory newEntity() { return new ChallengeHistory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ChallengeHistory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ChallengeHistory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
