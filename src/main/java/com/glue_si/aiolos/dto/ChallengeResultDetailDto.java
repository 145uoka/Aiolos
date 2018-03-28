package com.glue_si.aiolos.dto;

public class ChallengeResultDetailDto {

    private String answer;
    private Integer challengeHistoryId;
    private Boolean correctFlag;
    private Integer histroyDetailId;
    private Integer questionId;

    private String description;
    private String answerBranchNo;
    private Integer questionNum;
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public Integer getChallengeHistoryId() {
        return challengeHistoryId;
    }
    public void setChallengeHistoryId(Integer challengeHistoryId) {
        this.challengeHistoryId = challengeHistoryId;
    }
    public Boolean getCorrectFlag() {
        return correctFlag;
    }
    public void setCorrectFlag(Boolean correctFlag) {
        this.correctFlag = correctFlag;
    }
    public Integer getHistroyDetailId() {
        return histroyDetailId;
    }
    public void setHistroyDetailId(Integer histroyDetailId) {
        this.histroyDetailId = histroyDetailId;
    }
    public Integer getQuestionId() {
        return questionId;
    }
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
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
    public Integer getQuestionNum() {
        return questionNum;
    }
    public void setQuestionNum(Integer questionNum) {
        this.questionNum = questionNum;
    }

}
