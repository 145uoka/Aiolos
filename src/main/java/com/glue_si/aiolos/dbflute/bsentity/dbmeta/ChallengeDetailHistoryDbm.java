package com.glue_si.aiolos.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.glue_si.aiolos.dbflute.allcommon.*;
import com.glue_si.aiolos.dbflute.exentity.*;

/**
 * The DB meta of challenge_detail_history. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ChallengeDetailHistoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ChallengeDetailHistoryDbm _instance = new ChallengeDetailHistoryDbm();
    private ChallengeDetailHistoryDbm() {}
    public static ChallengeDetailHistoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ChallengeDetailHistory)et).getHistroyDetailId(), (et, vl) -> ((ChallengeDetailHistory)et).setHistroyDetailId(cti(vl)), "histroyDetailId");
        setupEpg(_epgMap, et -> ((ChallengeDetailHistory)et).getChallengeHistoryId(), (et, vl) -> ((ChallengeDetailHistory)et).setChallengeHistoryId(cti(vl)), "challengeHistoryId");
        setupEpg(_epgMap, et -> ((ChallengeDetailHistory)et).getQuestionId(), (et, vl) -> ((ChallengeDetailHistory)et).setQuestionId(cti(vl)), "questionId");
        setupEpg(_epgMap, et -> ((ChallengeDetailHistory)et).getAnswer(), (et, vl) -> ((ChallengeDetailHistory)et).setAnswer((String)vl), "answer");
        setupEpg(_epgMap, et -> ((ChallengeDetailHistory)et).getCorrectFlag(), (et, vl) -> ((ChallengeDetailHistory)et).setCorrectFlag((Boolean)vl), "correctFlag");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((ChallengeDetailHistory)et).getQuestion(), (et, vl) -> ((ChallengeDetailHistory)et).setQuestion((OptionalEntity<Question>)vl), "question");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "challenge_detail_history";
    protected final String _tableDispName = "challenge_detail_history";
    protected final String _tablePropertyName = "challengeDetailHistory";
    protected final TableSqlName _tableSqlName = new TableSqlName("challenge_detail_history", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHistroyDetailId = cci("histroy_detail_id", "histroy_detail_id", null, null, Integer.class, "histroyDetailId", null, true, true, true, "serial", 10, 0, null, "nextval('challenge_detail_history_histroy_detail_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChallengeHistoryId = cci("challenge_history_id", "challenge_history_id", null, null, Integer.class, "challengeHistoryId", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQuestionId = cci("question_id", "question_id", null, null, Integer.class, "questionId", null, false, false, true, "int4", 10, 0, null, null, false, null, null, "question", null, null, false);
    protected final ColumnInfo _columnAnswer = cci("answer", "answer", null, null, String.class, "answer", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCorrectFlag = cci("correct_flag", "correct_flag", null, null, Boolean.class, "correctFlag", null, false, false, true, "bool", 1, 0, null, null, false, null, null, null, null, null, false);

    /**
     * histroy_detail_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistroyDetailId() { return _columnHistroyDetailId; }
    /**
     * challenge_history_id: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChallengeHistoryId() { return _columnChallengeHistoryId; }
    /**
     * question_id: {NotNull, int4(10), FK to question}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuestionId() { return _columnQuestionId; }
    /**
     * answer: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAnswer() { return _columnAnswer; }
    /**
     * correct_flag: {NotNull, bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCorrectFlag() { return _columnCorrectFlag; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnHistroyDetailId());
        ls.add(columnChallengeHistoryId());
        ls.add(columnQuestionId());
        ls.add(columnAnswer());
        ls.add(columnCorrectFlag());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnHistroyDetailId()); }
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
    /**
     * question by my question_id, named 'question'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignQuestion() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnQuestionId(), QuestionDbm.getInstance().columnQuestionId());
        return cfi("FK_MEMBER_MEMBER_STATUS_CODE", "question", this, QuestionDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "challengeDetailHistoryList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "challenge_detail_history_histroy_detail_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.glue_si.aiolos.dbflute.exentity.ChallengeDetailHistory"; }
    public String getConditionBeanTypeName() { return "com.glue_si.aiolos.dbflute.cbean.ChallengeDetailHistoryCB"; }
    public String getBehaviorTypeName() { return "com.glue_si.aiolos.dbflute.exbhv.ChallengeDetailHistoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ChallengeDetailHistory> getEntityType() { return ChallengeDetailHistory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ChallengeDetailHistory newEntity() { return new ChallengeDetailHistory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ChallengeDetailHistory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ChallengeDetailHistory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
