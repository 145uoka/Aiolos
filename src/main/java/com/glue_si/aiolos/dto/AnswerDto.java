package com.glue_si.aiolos.dto;

public class AnswerDto {

    private Integer anwerId;
    private Integer branchNo;
    private String label;
    private Integer questionId;
    public Integer getAnwerId() {
        return anwerId;
    }
    public void setAnwerId(Integer anwerId) {
        this.anwerId = anwerId;
    }
    public Integer getBranchNo() {
        return branchNo;
    }
    public void setBranchNo(Integer branchNo) {
        this.branchNo = branchNo;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public Integer getQuestionId() {
        return questionId;
    }
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

}
