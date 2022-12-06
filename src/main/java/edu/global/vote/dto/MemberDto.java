package edu.global.vote.dto;

import java.util.HashMap;

public class MemberDto {
    private String no;
    private String name;
    private String party;
    private String school;
    private String jumin;
    private String city;
    private String tel;
    private final HashMap<String, String> schoolMap = new HashMap<>();

    public MemberDto(String no, String name, String party, String school, String jumin, String city, String tel) {
        schoolMap.put("1", "고졸");
        schoolMap.put("2", "학사");
        schoolMap.put("3", "석사");
        schoolMap.put("4", "박사");

        this.no = no;
        this.name = name;
        this.party = party;
        this.school = schoolMap.get(school);
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
        this.school = schoolMap.get(school);
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
