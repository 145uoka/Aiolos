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
 * The DB meta of question. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class QuestionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final QuestionDbm _instance = new QuestionDbm();
    private QuestionDbm() {}
    public static QuestionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Question)et).getQuestionId(), (et, vl) -> ((Question)et).setQuestionId(cti(vl)), "questionId");
        setupEpg(_epgMap, et -> ((Question)et).getGenreId(), (et, vl) -> ((Question)et).setGenreId(cti(vl)), "genreId");
        setupEpg(_epgMap, et -> ((Question)et).getQuestionNum(), (et, vl) -> ((Question)et).setQuestionNum(cti(vl)), "questionNum");
        setupEpg(_epgMap, et -> ((Question)et).getAnswerBranchNo(), (et, vl) -> ((Question)et).setAnswerBranchNo((String)vl), "answerBranchNo");
        setupEpg(_epgMap, et -> ((Question)et).getDescription(), (et, vl) -> ((Question)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((Question)et).getDeleteFlag(), (et, vl) -> ((Question)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((Question)et).getRegisterDatetime(), (et, vl) -> ((Question)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Question)et).getUpdateDatetime(), (et, vl) -> ((Question)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "question";
    protected final String _tableDispName = "question";
    protected final String _tablePropertyName = "question";
    protected final TableSqlName _tableSqlName = new TableSqlName("question", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnQuestionId = cci("question_id", "question_id", null, null, Integer.class, "questionId", null, true, true, true, "serial", 10, 0, null, "nextval('question_question_id_seq'::regclass)", false, null, null, null, "challengeDetailHistoryList,answerList", null, false);
    protected final ColumnInfo _columnGenreId = cci("genre_id", "genre_id", null, null, Integer.class, "genreId", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQuestionNum = cci("question_num", "question_num", null, null, Integer.class, "questionNum", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAnswerBranchNo = cci("answer_branch_no", "answer_branch_no", null, null, String.class, "answerBranchNo", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("description", "description", null, null, String.class, "description", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * question_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuestionId() { return _columnQuestionId; }
    /**
     * genre_id: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenreId() { return _columnGenreId; }
    /**
     * question_num: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuestionNum() { return _columnQuestionNum; }
    /**
     * answer_branch_no: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAnswerBranchNo() { return _columnAnswerBranchNo; }
    /**
     * description: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
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
        ls.add(columnQuestionId());
        ls.add(columnGenreId());
        ls.add(columnQuestionNum());
        ls.add(columnAnswerBranchNo());
        ls.add(columnDescription());
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
    protected UniqueInfo cpui() { return hpcpui(columnQuestionId()); }
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
    /**
     * challenge_detail_history by question_id, named 'challengeDetailHistoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerChallengeDetailHistoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnQuestionId(), ChallengeDetailHistoryDbm.getInstance().columnQuestionId());
        return cri("FK_question_detail_history_question_id", "challengeDetailHistoryList", this, ChallengeDetailHistoryDbm.getInstance(), mp, false, "question");
    }
    /**
     * answer by question_id, named 'answerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerAnswerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnQuestionId(), AnswerDbm.getInstance().columnQuestionId());
        return cri("FK_question_answer_question_id", "answerList", this, AnswerDbm.getInstance(), mp, false, "question");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "question_question_id_seq"; }
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
    public String getEntityTypeName() { return "com.glue_si.aiolos.dbflute.exentity.Question"; }
    public String getConditionBeanTypeName() { return "com.glue_si.aiolos.dbflute.cbean.QuestionCB"; }
    public String getBehaviorTypeName() { return "com.glue_si.aiolos.dbflute.exbhv.QuestionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Question> getEntityType() { return Question.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Question newEntity() { return new Question(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Question)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Question)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
