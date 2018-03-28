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
 * The DB meta of genre. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class GenreDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final GenreDbm _instance = new GenreDbm();
    private GenreDbm() {}
    public static GenreDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Genre)et).getGenreId(), (et, vl) -> ((Genre)et).setGenreId(cti(vl)), "genreId");
        setupEpg(_epgMap, et -> ((Genre)et).getGenreName(), (et, vl) -> ((Genre)et).setGenreName((String)vl), "genreName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "genre";
    protected final String _tableDispName = "genre";
    protected final String _tablePropertyName = "genre";
    protected final TableSqlName _tableSqlName = new TableSqlName("genre", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnGenreId = cci("genre_id", "genre_id", null, null, Integer.class, "genreId", null, true, true, true, "serial", 10, 0, null, "nextval('genre_genre_id_seq'::regclass)", false, null, null, null, "challengeHistoryList", null, false);
    protected final ColumnInfo _columnGenreName = cci("genre_name", "genre_name", null, null, String.class, "genreName", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);

    /**
     * genre_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenreId() { return _columnGenreId; }
    /**
     * genre_name: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenreName() { return _columnGenreName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnGenreId());
        ls.add(columnGenreName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnGenreId()); }
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
     * challenge_history by genre_id, named 'challengeHistoryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerChallengeHistoryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGenreId(), ChallengeHistoryDbm.getInstance().columnGenreId());
        return cri("FK_genre_challenge_history_genre_id", "challengeHistoryList", this, ChallengeHistoryDbm.getInstance(), mp, false, "genre");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "genre_genre_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.glue_si.aiolos.dbflute.exentity.Genre"; }
    public String getConditionBeanTypeName() { return "com.glue_si.aiolos.dbflute.cbean.GenreCB"; }
    public String getBehaviorTypeName() { return "com.glue_si.aiolos.dbflute.exbhv.GenreBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Genre> getEntityType() { return Genre.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Genre newEntity() { return new Genre(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Genre)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Genre)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
