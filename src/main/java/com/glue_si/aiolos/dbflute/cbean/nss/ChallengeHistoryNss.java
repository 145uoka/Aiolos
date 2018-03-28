package com.glue_si.aiolos.dbflute.cbean.nss;

import com.glue_si.aiolos.dbflute.cbean.cq.ChallengeHistoryCQ;

/**
 * The nest select set-upper of challenge_history.
 * @author DBFlute(AutoGenerator)
 */
public class ChallengeHistoryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ChallengeHistoryCQ _query;
    public ChallengeHistoryNss(ChallengeHistoryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * genre by my genre_id, named 'genre'.
     */
    public void withGenre() {
        _query.xdoNss(() -> _query.queryGenre());
    }
}
