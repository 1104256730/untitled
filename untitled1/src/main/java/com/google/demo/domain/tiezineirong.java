package com.google.demo.domain;

public class tiezineirong {
    private Integer tznrId;
    private String neiRong;
    private String tzName;
    private Integer fatieren;
    private Integer tzbtId;

    public tiezineirong() {
    }

    public tiezineirong(Integer tznrId, String neiRong, String tzName, Integer fatieren, Integer tzbtId) {
        this.tznrId = tznrId;
        this.neiRong = neiRong;
        this.tzName = tzName;
        this.fatieren = fatieren;
        this.tzbtId = tzbtId;
    }

    public Integer getTznrId() {
        return tznrId;
    }

    public void setTznrId(Integer tznrId) {
        this.tznrId = tznrId;
    }

    public String getNeiRong() {
        return neiRong;
    }

    public void setNeiRong(String neiRong) {
        this.neiRong = neiRong;
    }

    public String getTzName() {
        return tzName;
    }

    public void setTzName(String tzName) {
        this.tzName = tzName;
    }

    public Integer getFatieren() {
        return fatieren;
    }

    public void setFatieren(Integer fatieren) {
        this.fatieren = fatieren;
    }

    public Integer getTzbtId() {
        return tzbtId;
    }

    public void setTzbtId(Integer tzbtId) {
        this.tzbtId = tzbtId;
    }

    @Override
    public String toString() {
        return "TieZiNeiRong{" +
                "tznrId=" + tznrId +
                ", neiRong='" + neiRong + '\'' +
                ", tzName='" + tzName + '\'' +
                ", fatieren=" + fatieren +
                ", tzbtId=" + tzbtId +
                '}';
    }
 }

