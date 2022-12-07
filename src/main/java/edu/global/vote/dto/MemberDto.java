package edu.global.vote.dto;

public class MemberDto {
    private String no;
    private String name;
    private String party;
    private String school;
    private String jumin;
    private String city;
    private String tel;

    public MemberDto(String no, String name, String party, String school, String jumin, String city, String tel) {
        this.no = no;
        this.name = name;
        this.party = party;
        this.school = school;
        this.jumin = jumin;
        this.city = city;
        this.tel = tel;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getJumin() {
        return jumin;
    }

    public void setJumin(String jumin) {
        this.jumin = jumin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
