package com.glue_si.aiolos.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.glue_si.aiolos.dbflute.allcommon.DBMetaInstanceHandler;
import com.glue_si.aiolos.dbflute.exentity.*;

/**
 * The entity of genre as TABLE. <br>
 * <pre>
 * [primary-key]
 *     genre_id
 *
 * [column]
 *     genre_id, genre_name
 *
 * [sequence]
 *     genre_genre_id_seq
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
 *     challenge_history
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     challengeHistoryList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer genreId = entity.getGenreId();
 * String genreName = entity.getGenreName();
 * entity.setGenreId(genreId);
 * entity.setGenreName(genreName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsGenre extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** genre_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _genreId;

    /** genre_name: {NotNull, text(2147483647)} */
    protected String _genreName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "genre";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_genreId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** challenge_history by genre_id, named 'challengeHistoryList'. */
    protected List<ChallengeHistory> _challengeHistoryList;

    /**
     * [get] challenge_history by genre_id, named 'challengeHistoryList'.
     * @return The entity list of referrer property 'challengeHistoryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<ChallengeHistory> getChallengeHistoryList() {
        if (_challengeHistoryList == null) { _challengeHistoryList = newReferrerList(); }
        return _challengeHistoryList;
    }

    /**
     * [set] challenge_history by genre_id, named 'challengeHistoryList'.
     * @param challengeHistoryList The entity list of referrer property 'challengeHistoryList'. (NullAllowed)
     */
    public void setChallengeHistoryList(List<ChallengeHistory> challengeHistoryList) {
        _challengeHistoryList = challengeHistoryList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsGenre) {
            BsGenre other = (BsGenre)obj;
            if (!xSV(_genreId, other._genreId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _genreId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_challengeHistoryList != null) { for (ChallengeHistory et : _challengeHistoryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "challengeHistoryList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_genreId));
        sb.append(dm).append(xfND(_genreName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_challengeHistoryList != null && !_challengeHistoryList.isEmpty())
        { sb.append(dm).append("challengeHistoryList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Genre clone() {
        return (Genre)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] genre_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'genre_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGenreId() {
        checkSpecifiedProperty("genreId");
        return _genreId;
    }

    /**
     * [set] genre_id: {PK, ID, NotNull, serial(10)} <br>
     * @param genreId The value of the column 'genre_id'. (basically NotNull if update: for the constraint)
     */
    public void setGenreId(Integer genreId) {
        registerModifiedProperty("genreId");
        _genreId = genreId;
    }

    /**
     * [get] genre_name: {NotNull, text(2147483647)} <br>
     * @return The value of the column 'genre_name'. (basically NotNull if selected: for the constraint)
     */
    public String getGenreName() {
        checkSpecifiedProperty("genreName");
        return _genreName;
    }

    /**
     * [set] genre_name: {NotNull, text(2147483647)} <br>
     * @param genreName The value of the column 'genre_name'. (basically NotNull if update: for the constraint)
     */
    public void setGenreName(String genreName) {
        registerModifiedProperty("genreName");
        _genreName = genreName;
    }
}
