package edu.global.vote.dto;

public class VoteDto {
    String voteJumin;
    String voteName;
    String member_No;
    String voteTime;
    String voteArea;
    String voteConfirm;

    @Override
    public String toString() {
        return "VoteDto{" +
                "voteJumin='" + voteJumin + '\'' +
                ", voteName='" + voteName + '\'' +
                ", member_No='" + member_No + '\'' +
                ", voteTime='" + voteTime + '\'' +
                ", voteArea='" + voteArea + '\'' +
                ", voteConfirm='" + voteConfirm + '\'' +
                '}';
    }

    public VoteDto(String voteJumin, String voteName, String member_No, String voteTime, String voteArea, String voteConfirm) {
        this.voteJumin = voteJumin;
        this.voteName = voteName;
        this.member_No = member_No;
        this.voteTime = voteTime;
        this.voteArea = voteArea;
        this.voteConfirm = voteConfirm;
    }

    public String getVoteJumin() {
        return voteJumin;
    }

    public void setVoteJumin(String voteJumin) {
        this.voteJumin = voteJumin;
    }

    public String getVoteName() {
        return voteName;
    }

    public void setVoteName(String voteName) {
        this.voteName = voteName;
    }

    public String getMember_No() {
        return member_No;
    }

    public void setMember_No(String member_No) {
        this.member_No = member_No;
    }

    public String getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(String voteTime) {
        this.voteTime = voteTime;
    }

    public String getVoteArea() {
        return voteArea;
    }

    public void setVoteArea(String voteArea) {
        this.voteArea = voteArea;
    }

    public String getVoteConfirm() {
        return voteConfirm;
    }

    public void setVoteConfirm(String voteConfirm) {
        this.voteConfirm = voteConfirm;
    }
}
