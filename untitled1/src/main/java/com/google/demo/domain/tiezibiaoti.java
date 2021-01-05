package com.google.demo.domain;

import java.sql.Timestamp;

public class tiezibiaoti {
    private Integer tzbtId;
    private String tzName;
    private Timestamp time;
    private  Integer fatieren;
    private String nkName;

    public tiezibiaoti() {
    }

    public tiezibiaoti(Integer tzbtId, String tzName, Timestamp time, Integer fatieren, String nkName) {
        this.tzbtId = tzbtId;
        this.tzName = tzName;
        this.time = time;
        this.fatieren = fatieren;
        this.nkName = nkName;
    }

    public Integer getTzbtId() {
        return tzbtId;
    }

    public void setTzbtId(Integer tzbtId) {
        this.tzbtId = tzbtId;
    }

    public String getTzName() {
        return tzName;
    }

    public void setTzName(String tzName) {
        this.tzName = tzName;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Integer getFatieren() {
        return fatieren;
    }

    public void setFatieren(Integer fatieren) {
        this.fatieren = fatieren;
    }

    public String getNkName() {
        return nkName;
    }

    public void setNkName(String nkName) {
        this.nkName = nkName;
    }

    @Override
    public String toString() {
        return "TieZiBiaoTi{" +
                "tzbtId=" + tzbtId +
                ", tzName='" + tzName + '\'' +
                ", time=" + time +
                ", fatieren=" + fatieren +
                ", nkName='" + nkName + '\'' +
                '}';
    }
}
