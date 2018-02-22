package com.glue_si.aiolos.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.glue_si.aiolos.dbflute.exbhv.*;
import com.glue_si.aiolos.dbflute.exentity.*;

/**
 * The referrer loader of challenge_detail_history as TABLE. <br>
 * <pre>
 * [primary key]
 *     histroy_detail_id
 *
 * [column]
 *     histroy_detail_id, challenge_history_id, question_id, answer, correct_flag
 *
 * [sequence]
 *     challenge_detail_history_histroy_detail_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     question
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     question
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfChallengeDetailHistory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ChallengeDetailHistory> _selectedList;
    protected BehaviorSelector _selector;
    protected ChallengeDetailHistoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfChallengeDetailHistory ready(List<ChallengeDetailHistory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ChallengeDetailHistoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ChallengeDetailHistoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfQuestion _foreignQuestionLoader;
    public LoaderOfQuestion pulloutQuestion() {
        if (_foreignQuestionLoader == null)
        { _foreignQuestionLoader = new LoaderOfQuestion().ready(myBhv().pulloutQuestion(_selectedList), _selector); }
        return _foreignQuestionLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ChallengeDetailHistory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
