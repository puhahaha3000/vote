package edu.global.vote.dto;

public class VoteViewDto {
    private String name;
    private String birthDate;
    private String age;
    private String gender;
    private String memberNo;
    private String time;
    private String confirm;

    @Override
    public String toString() {
        return "VoteViewDto{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", memberNo='" + memberNo + '\'' +
                ", time='" + time + '\'' +
                ", confirm='" + confirm + '\'' +
                '}';
    }

    public VoteViewDto(String name, String birthDate, String age, String gender, String memberNo, String time, String confirm) {
        this.name = name;
        this.birthDate = birthDate;
        this.age = age;
        this.gender = gender;
        this.memberNo = memberNo;
        this.time = time;
        this.confirm = confirm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }
}
