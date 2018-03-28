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
 * The DB meta of answer. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AnswerDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AnswerDbm _instance = new AnswerDbm();
    private AnswerDbm() {}
    public static AnswerDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Answer)et).getAnwerId(), (et, vl) -> ((Answer)et).setAnwerId(cti(vl)), "anwerId");
        setupEpg(_epgMap, et -> ((Answer)et).getQuestionId(), (et, vl) -> ((Answer)et).setQuestionId(cti(vl)), "questionId");
        setupEpg(_epgMap, et -> ((Answer)et).getBranchNo(), (et, vl) -> ((Answer)et).setBranchNo(cti(vl)), "branchNo");
        setupEpg(_epgMap, et -> ((Answer)et).getLabel(), (et, vl) -> ((Answer)et).setLabel((String)vl), "label");
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
        setupEfpg(_efpgMap, et -> ((Answer)et).getQuestion(), (et, vl) -> ((Answer)et).setQuestion((OptionalEntity<Question>)vl), "question");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "answer";
    protected final String _tableDispName = "answer";
    protected final String _tablePropertyName = "answer";
    protected final TableSqlName _tableSqlName = new TableSqlName("answer", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAnwerId = cci("anwer_id", "anwer_id", null, null, Integer.class, "anwerId", null, true, true, true, "serial", 10, 0, null, "nextval('answer_anwer_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnQuestionId = cci("question_id", "question_id", null, null, Integer.class, "questionId", null, false, false, true, "int4", 10, 0, null, null, false, null, null, "question", null, null, false);
    protected final ColumnInfo _columnBranchNo = cci("branch_no", "branch_no", null, null, Integer.class, "branchNo", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLabel = cci("label", "label", null, null, String.class, "label", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);

    /**
     * anwer_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAnwerId() { return _columnAnwerId; }
    /**
     * question_id: {UQ+, NotNull, int4(10), FK to question}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnQuestionId() { return _columnQuestionId; }
    /**
     * branch_no: {+UQ, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBranchNo() { return _columnBranchNo; }
    /**
     * label: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLabel() { return _columnLabel; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnAnwerId());
        ls.add(columnQuestionId());
        ls.add(columnBranchNo());
        ls.add(columnLabel());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnAnwerId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnQuestionId());
        ls.add(columnBranchNo());
        return hpcui(ls);
    }

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
        return cfi("FK_question_answer_question_id", "question", this, QuestionDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, true, null, null, false, "answerList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "answer_anwer_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.glue_si.aiolos.dbflute.exentity.Answer"; }
    public String getConditionBeanTypeName() { return "com.glue_si.aiolos.dbflute.cbean.AnswerCB"; }
    public String getBehaviorTypeName() { return "com.glue_si.aiolos.dbflute.exbhv.AnswerBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Answer> getEntityType() { return Answer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Answer newEntity() { return new Answer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Answer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Answer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
