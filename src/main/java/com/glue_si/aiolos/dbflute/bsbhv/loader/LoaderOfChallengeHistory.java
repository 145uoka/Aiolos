package com.glue_si.aiolos.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.glue_si.aiolos.dbflute.exbhv.*;
import com.glue_si.aiolos.dbflute.exentity.*;

/**
 * The referrer loader of challenge_history as TABLE. <br>
 * <pre>
 * [primary key]
 *     challenge_history_id
 *
 * [column]
 *     challenge_history_id, score, attendance_rate, user_name, elapsed_time, correct_sum, detail_clean_flag, delete_flag, register_datetime, update_datetime
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfChallengeHistory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ChallengeHistory> _selectedList;
    protected BehaviorSelector _selector;
    protected ChallengeHistoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfChallengeHistory ready(List<ChallengeHistory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ChallengeHistoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ChallengeHistoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ChallengeHistory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
