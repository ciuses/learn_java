package ru.ciuse.hw_2_java_db.entity;

public class Gem {
    private Long gemId;
    private String gemType;
    private String gemName;
    private Integer gemPrice;

    //Setter
    public Gem(long gemId, String gemType, String gemName, int gemPrice) {
        this.gemId = gemId;
        this.gemType = gemType;
        this.gemName = gemName;
        this.gemPrice = gemPrice;
    }

    //Setters
    public void setGemId(Long gemId) {
        this.gemId = gemId;
    }

    public void setGemType(String gemType) {
        this.gemType = gemType;
    }

    public void setGemName(String gemName) {
        this.gemName = gemName;
    }

    public void setGemPrice(Integer gemPrice) {
        this.gemPrice = gemPrice;
    }

    //Getters
    public Long getGemId() {
        return this.gemId;
    }

    public String getGemType() {
        return this.gemType;
    }

    public String getGemName() {
        return this.gemName;
    }

    public Integer getGemPrice() {
        return this.gemPrice;
    }

}
//TODO сделал сеттер сразу для всех полей, но возможно нужен сеттер для каждого поля по отдельности.