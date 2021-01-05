package com.google.demo.domain;

import java.sql.Timestamp;

public class huifu {
    private int huiFuId;
    private String huiFuZhe;
    private String huiFuNeiRong;
    private Timestamp huiFuShiJian;

    @Override
    public String toString() {
        return "huifu{" +
                "huiFuId=" + huiFuId +
                ", huiFuZhe='" + huiFuZhe + '\'' +
                ", huiFuNeiRong='" + huiFuNeiRong + '\'' +
                ", huiFuShiJian=" + huiFuShiJian +
                '}';
    }

    public int getHuiFuId() {
        return huiFuId;
    }

    public void setHuiFuId(int huiFuId) {
        this.huiFuId = huiFuId;
    }

    public String getHuiFuZhe() {
        return huiFuZhe;
    }

    public void setHuiFuZhe(String huiFuZhe) {
        this.huiFuZhe = huiFuZhe;
    }

    public String getHuiFuNeiRong() {
        return huiFuNeiRong;
    }

    public void setHuiFuNeiRong(String huiFuNeiRong) {
        this.huiFuNeiRong = huiFuNeiRong;
    }

    public Timestamp getHuiFuShiJian() {
        return huiFuShiJian;
    }

    public void setHuiFuShiJian(Timestamp huiFuShiJian) {
        this.huiFuShiJian = huiFuShiJian;
    }

    public huifu(int huiFuId, String huiFuZhe, String huiFuNeiRong, Timestamp huiFuShiJian) {
        this.huiFuId = huiFuId;
        this.huiFuZhe = huiFuZhe;
        this.huiFuNeiRong = huiFuNeiRong;
        this.huiFuShiJian = huiFuShiJian;
    }

    public huifu() {
    }
}
