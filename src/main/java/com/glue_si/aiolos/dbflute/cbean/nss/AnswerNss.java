package com.glue_si.aiolos.dbflute.cbean.nss;

import com.glue_si.aiolos.dbflute.cbean.cq.AnswerCQ;

/**
 * The nest select set-upper of answer.
 * @author DBFlute(AutoGenerator)
 */
public class AnswerNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final AnswerCQ _query;
    public AnswerNss(AnswerCQ query) { _query = query; }
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
