package com.glue_si.aiolos.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.glue_si.aiolos.dbflute.exbhv.*;
import com.glue_si.aiolos.dbflute.exentity.*;
import com.glue_si.aiolos.dbflute.cbean.*;

/**
 * The referrer loader of question as TABLE. <br>
 * <pre>
 * [primary key]
 *     question_id
 *
 * [column]
 *     question_id, keyword, description, order_num
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfQuestion {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Question> _selectedList;
    protected BehaviorSelector _selector;
    protected QuestionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfQuestion ready(List<Question> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected QuestionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(QuestionBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ChallengeDetailHistory> _referrerChallengeDetailHistory;

    /**
     * Load referrer of challengeDetailHistoryList by the set-upper of referrer. <br>
     * challenge_detail_history by question_id, named 'challengeDetailHistoryList'.
     * <pre>
     * <span style="color: #0000C0">questionBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">questionList</span>, <span style="color: #553000">questionLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">questionLoader</span>.<span style="color: #CC4747">loadChallengeDetailHistory</span>(<span style="color: #553000">historyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">historyCB</span>.setupSelect...
     *         <span style="color: #553000">historyCB</span>.query().set...
     *         <span style="color: #553000">historyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">historyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    historyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Question question : <span style="color: #553000">questionList</span>) {
     *     ... = question.<span style="color: #CC4747">getChallengeDetailHistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setQuestionId_InScope(pkList);
     * cb.query().addOrderBy_QuestionId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfChallengeDetailHistory> loadChallengeDetailHistory(ReferrerConditionSetupper<ChallengeDetailHistoryCB> refCBLambda) {
        myBhv().loadChallengeDetailHistory(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerChallengeDetailHistory = refLs);
        return hd -> hd.handle(new LoaderOfChallengeDetailHistory().ready(_referrerChallengeDetailHistory, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Question> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
