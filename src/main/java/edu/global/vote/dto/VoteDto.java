package edu.global.vote.dto;

public class VoteDto {
    String voteJumin;
    String voteName;
    String memberNo;
    String voteTime;
    String voteArea;
    String voteConfirm;

    @Override
    public String toString() {
        return "VoteDto{" +
                "voteJumin='" + voteJumin + '\'' +
                ", voteName='" + voteName + '\'' +
                ", memberNo='" + memberNo + '\'' +
                ", voteTime='" + voteTime + '\'' +
                ", voteArea='" + voteArea + '\'' +
                ", voteConfirm='" + voteConfirm + '\'' +
                '}';
    }

    public VoteDto(String voteJumin, String voteName, String memberNo, String voteTime, String voteArea, String voteConfirm) {
        this.voteJumin = voteJumin;
        this.voteName = voteName;
        this.memberNo = memberNo;
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

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
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
