package com.glue_si.aiolos.dto;

public class ChallengeResultDto {

    private Integer attendanceRate;
    private Integer challengeHistoryId;
    private String elapsedTime;
    private Integer correctSum;
    private Integer score;
    private String userName;
    private String registerDatetime;
    public Integer getAttendanceRate() {
        return attendanceRate;
    }
    public void setAttendanceRate(Integer attendanceRate) {
        this.attendanceRate = attendanceRate;
    }
    public Integer getChallengeHistoryId() {
        return challengeHistoryId;
    }
    public void setChallengeHistoryId(Integer challengeHistoryId) {
        this.challengeHistoryId = challengeHistoryId;
    }
    public String getElapsedTime() {
        return elapsedTime;
    }
    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
    public Integer getCorrectSum() {
        return correctSum;
    }
    public void setCorrectSum(Integer correctSum) {
        this.correctSum = correctSum;
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getRegisterDatetime() {
        return registerDatetime;
    }
    public void setRegisterDatetime(String registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

}
