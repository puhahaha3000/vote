package edu.global.vote.dto;

public class MemberRankDto {
    private String memberNo;
    private String memberName;
    private String count;

    @Override
    public String toString() {
        return "MemberRankDto{" +
                "memberNo='" + memberNo + '\'' +
                ", memberName='" + memberName + '\'' +
                ", count='" + count + '\'' +
                '}';
    }

    public MemberRankDto(String memberNo, String memberName, String count) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.count = count;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
