package com.glue_si.aiolos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.dbflute.cbean.result.ListResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.glue_si.aiolos.dbflute.exbhv.QuestionBhv;
import com.glue_si.aiolos.dbflute.exentity.Question;
import com.glue_si.aiolos.dto.KeywordDto;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/question")
public class QuestionController {

    @Autowired
    QuestionBhv questionBhv;

    private static final Logger logger = LoggerFactory.getLogger(QuestionController.class);

    @RequestMapping(method = {RequestMethod.GET})
    public String index(Locale locale, Model model) {

        ListResultBean<Question> questionList = questionBhv.selectList(cb-> {
            cb.query().addOrderBy_OrderNum_Asc();
        });

        List<KeywordDto> questionDtoList = new ArrayList<KeywordDto>();

        for (Question question : questionList) {
            KeywordDto dto = new KeywordDto();
            BeanUtils.copyProperties(question, dto);
            questionDtoList.add(dto);
        }

        model.addAttribute("questionDtoList", questionDtoList);

        return "/question/index";
    }
}
