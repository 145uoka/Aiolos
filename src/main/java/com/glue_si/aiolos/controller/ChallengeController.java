package com.glue_si.aiolos.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.glue_si.aiolos.dbflute.exbhv.ChallengeDetailHistoryBhv;
import com.glue_si.aiolos.dbflute.exbhv.ChallengeHistoryBhv;
import com.glue_si.aiolos.dbflute.exbhv.QuestionBhv;
import com.glue_si.aiolos.dbflute.exentity.ChallengeHistory;
import com.glue_si.aiolos.dbflute.exentity.Question;
import com.glue_si.aiolos.dto.ChallengeResultDetailDto;
import com.glue_si.aiolos.dto.ChallengeResultDto;
import com.glue_si.aiolos.dto.KeywordDto;
import com.glue_si.aiolos.form.challenge.ChallengeForm;
import com.glue_si.aiolos.service.ChallengeService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/challenge")
public class ChallengeController {

    @Autowired
    QuestionBhv questionBhv;

    @Autowired
    ChallengeService challengeService;

    @Autowired
    ChallengeHistoryBhv challengeHistoryBhv;

    @Autowired
    ChallengeDetailHistoryBhv challengeDetailHistoryBhv;

    private static final Logger logger = LoggerFactory.getLogger(ChallengeController.class);

    @RequestMapping(method = {RequestMethod.GET})
    public String index(ChallengeForm form, BindingResult bindingResult
            , Locale locale, Model model) {

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
        model.addAttribute("form", form);

        return "/challenge/input";
    }

    @RequestMapping(value = "/answer", method = RequestMethod.POST)
    public String answer(ChallengeForm form, BindingResult bindingResult, RedirectAttributes redirectAttributes,
            Locale locale, Model model) {

        Integer challengeHistoryId = challengeService.store(form);

        return "redirect:/challenge/history/" + challengeHistoryId;
    }

    @RequestMapping(value = "/history", method = RequestMethod.GET)
    public String history(Locale locale, Model model) {

        List<ChallengeResultDto> challengeResultDtoList = new ArrayList<ChallengeResultDto>();
        challengeHistoryBhv.selectList(cb->{
            cb.query().addOrderBy_Score_Desc();
        }).forEach(entity->{
            ChallengeResultDto challengeResultDto = new ChallengeResultDto();
            BeanUtils.copyProperties(entity, challengeResultDto);

            SimpleDateFormat formatter = new SimpleDateFormat("mm:ss.SSS");
            formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
            String timeFormatted = formatter.format(entity.getElapsedTime());
            challengeResultDto.setElapsedTime(timeFormatted);

            challengeResultDtoList.add(challengeResultDto);
        });;

        model.addAttribute("challengeResultDtoList", challengeResultDtoList);

        return "/challenge/history";
    }

    @RequestMapping(value = "/history/{challengeHistoryId}", method = RequestMethod.GET)
    public String detialHistory(@PathVariable Integer challengeHistoryId, Locale locale, Model model) {

        OptionalEntity<ChallengeHistory> challengeHistoryOpEntity =
                challengeHistoryBhv.selectByPK(challengeHistoryId);

        ChallengeResultDto challengeResultDto = new ChallengeResultDto();
        if (challengeHistoryOpEntity.isPresent()) {
            ChallengeHistory challengeHistory = challengeHistoryOpEntity.get();
            BeanUtils.copyProperties(challengeHistory, challengeResultDto);

            SimpleDateFormat formatter = new SimpleDateFormat("mm:ss.SSS");
            formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
            String timeFormatted = formatter.format(challengeHistory.getElapsedTime());
            challengeResultDto.setElapsedTime(timeFormatted);

            model.addAttribute("challengeResultDto", challengeResultDto);
        }

        List<ChallengeResultDetailDto> detailDtoList = new ArrayList<ChallengeResultDetailDto>();

        challengeDetailHistoryBhv.selectList(cb->{
            cb.setupSelect_Question();
            cb.query().queryQuestion().innerJoin();
            cb.query().setChallengeHistoryId_Equal(challengeHistoryId);
            cb.query().queryQuestion().addOrderBy_QuestionId_Asc();
        }).forEach(entity->{
            ChallengeResultDetailDto detailDto = new ChallengeResultDetailDto();
            BeanUtils.copyProperties(entity, detailDto);
            BeanUtils.copyProperties(entity.getQuestion().get(), detailDto);
            detailDtoList.add(detailDto);
        });

        model.addAttribute("detailDtoList", detailDtoList);

        return "/challenge/result";
    }
}
