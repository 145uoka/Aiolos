package com.glue_si.aiolos.dto;

import java.util.List;

public class KeywordDto {

    private String description;
    private String answerBranchNo;
    private Integer questionId;

    protected Integer genreId;
    protected Integer questionNum;

    private List<AnswerDto> answerDtoList;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnswerBranchNo() {
        return answerBranchNo;
    }

    public void setAnswerBranchNo(String answerBranchNo) {
        this.answerBranchNo = answerBranchNo;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Integer getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(Integer questionNum) {
        this.questionNum = questionNum;
    }

    public List<AnswerDto> getAnswerDtoList() {
        return answerDtoList;
    }

    public void setAnswerDtoList(List<AnswerDto> answerDtoList) {
        this.answerDtoList = answerDtoList;
    }

}
