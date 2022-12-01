package edu.global.vote.dto;

public class PartyDto {
    private String partyCode;
    private String partyName;
    private String partyInDate;
    private String partyReader;
    private String partyTel1;
    private String partyTel2;
    private String partyTel3;

    @Override
    public String toString() {
        return "PartyDto{" +
                "partyCode='" + partyCode + '\'' +
                ", partyName='" + partyName + '\'' +
                ", partyInDate='" + partyInDate + '\'' +
                ", partyReader='" + partyReader + '\'' +
                ", partyTel1='" + partyTel1 + '\'' +
                ", partyTel2='" + partyTel2 + '\'' +
                ", partyTel3='" + partyTel3 + '\'' +
                '}';
    }

    public PartyDto(String partyCode, String partyName, String partyInDate, String partyReader, String partyTel1, String partyTel2, String partyTel3) {
        this.partyCode = partyCode;
        this.partyName = partyName;
        this.partyInDate = partyInDate;
        this.partyReader = partyReader;
        this.partyTel1 = partyTel1;
        this.partyTel2 = partyTel2;
        this.partyTel3 = partyTel3;
    }

    public String getPartyCode() {
        return partyCode;
    }

    public void setPartyCode(String partyCode) {
        this.partyCode = partyCode;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPartyInDate() {
        return partyInDate;
    }

    public void setPartyInDate(String partyInDate) {
        this.partyInDate = partyInDate;
    }

    public String getPartyReader() {
        return partyReader;
    }

    public void setPartyReader(String partyReader) {
        this.partyReader = partyReader;
    }

    public String getPartyTel1() {
        return partyTel1;
    }

    public void setPartyTel1(String partyTel1) {
        this.partyTel1 = partyTel1;
    }

    public String getPartyTel2() {
        return partyTel2;
    }

    public void setPartyTel2(String partyTel2) {
        this.partyTel2 = partyTel2;
    }

    public String getPartyTel3() {
        return partyTel3;
    }

    public void setPartyTel3(String partyTel3) {
        this.partyTel3 = partyTel3;
    }
}
