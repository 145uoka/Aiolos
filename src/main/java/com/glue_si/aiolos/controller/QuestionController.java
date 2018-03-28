package com.glue_si.aiolos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.glue_si.aiolos.dbflute.exbhv.QuestionBhv;

/**
 * Handles requests for the application home page.
 */
@Controller
//@RequestMapping(value = "/question")
public class QuestionController {

    @Autowired
    QuestionBhv questionBhv;

    private static final Logger logger = LoggerFactory.getLogger(QuestionController.class);

//    @RequestMapping(method = {RequestMethod.GET})
//    public String index(Locale locale, Model model) {
//
//        ListResultBean<Question> questionList = questionBhv.selectList(cb-> {
//            cb.query().addOrderBy_OrderNum_Asc();
//        });
//
//        List<KeywordDto> questionDtoList = new ArrayList<KeywordDto>();
//
//        for (Question question : questionList) {
//            KeywordDto dto = new KeywordDto();
//            BeanUtils.copyProperties(question, dto);
//            questionDtoList.add(dto);
//        }
//
//        model.addAttribute("questionDtoList", questionDtoList);
//
//        return "/question/index";
//    }
}
