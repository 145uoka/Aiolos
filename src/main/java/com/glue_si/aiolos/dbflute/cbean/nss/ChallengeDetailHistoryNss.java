package com.glue_si.aiolos.dbflute.cbean.nss;

import com.glue_si.aiolos.dbflute.cbean.cq.ChallengeDetailHistoryCQ;

/**
 * The nest select set-upper of challenge_detail_history.
 * @author DBFlute(AutoGenerator)
 */
public class ChallengeDetailHistoryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ChallengeDetailHistoryCQ _query;
    public ChallengeDetailHistoryNss(ChallengeDetailHistoryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * question by my question_id, named 'question'.
     */
    public void withQuestion() {
        _query.xdoNss(() -> _query.queryQuestion());
    }
}
