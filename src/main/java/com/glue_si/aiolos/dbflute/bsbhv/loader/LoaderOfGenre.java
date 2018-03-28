package com.glue_si.aiolos.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.glue_si.aiolos.dbflute.exbhv.*;
import com.glue_si.aiolos.dbflute.exentity.*;
import com.glue_si.aiolos.dbflute.cbean.*;

/**
 * The referrer loader of genre as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfGenre {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Genre> _selectedList;
    protected BehaviorSelector _selector;
    protected GenreBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfGenre ready(List<Genre> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected GenreBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(GenreBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ChallengeHistory> _referrerChallengeHistory;

    /**
     * Load referrer of challengeHistoryList by the set-upper of referrer. <br>
     * challenge_history by genre_id, named 'challengeHistoryList'.
     * <pre>
     * <span style="color: #0000C0">genreBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">genreList</span>, <span style="color: #553000">genreLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">genreLoader</span>.<span style="color: #CC4747">loadChallengeHistory</span>(<span style="color: #553000">historyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">historyCB</span>.setupSelect...
     *         <span style="color: #553000">historyCB</span>.query().set...
     *         <span style="color: #553000">historyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">historyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    historyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Genre genre : <span style="color: #553000">genreList</span>) {
     *     ... = genre.<span style="color: #CC4747">getChallengeHistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGenreId_InScope(pkList);
     * cb.query().addOrderBy_GenreId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfChallengeHistory> loadChallengeHistory(ReferrerConditionSetupper<ChallengeHistoryCB> refCBLambda) {
        myBhv().loadChallengeHistory(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerChallengeHistory = refLs);
        return hd -> hd.handle(new LoaderOfChallengeHistory().ready(_referrerChallengeHistory, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Genre> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
