package com.glue_si.aiolos.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.glue_si.aiolos.dbflute.exbhv.*;
import com.glue_si.aiolos.dbflute.exentity.*;

/**
 * The referrer loader of answer as TABLE. <br>
 * <pre>
 * [primary key]
 *     anwer_id
 *
 * [column]
 *     anwer_id, question_id, branch_no, label
 *
 * [sequence]
 *     answer_anwer_id_seq
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
public class LoaderOfAnswer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Answer> _selectedList;
    protected BehaviorSelector _selector;
    protected AnswerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAnswer ready(List<Answer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AnswerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AnswerBhv.class); return _myBhv; } }

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
    public List<Answer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
