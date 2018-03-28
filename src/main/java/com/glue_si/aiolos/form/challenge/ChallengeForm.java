package com.glue_si.aiolos.form.challenge;

public class ChallengeForm {

    private Integer genreId;

    private String userName;

    private Long startTime;

    private Long endTime;

    private String[] answer;



    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String[] getAnswer() {
        return answer;
    }

    public void setAnswer(String[] answer) {
        this.answer = answer;
    }



}
