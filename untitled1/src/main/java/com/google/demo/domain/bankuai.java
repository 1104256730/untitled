package com.google.demo.domain;

public class bankuai {
    @Override
    public String toString() {
        return "bankuai{" +
                "banKuaiId=" + banKuaiId +
                ", banKuaiName='" + banKuaiName + '\'' +
                '}';
    }

    private int banKuaiId;
    private String banKuaiName ;

    public bankuai() {
    }

    public int getBanKuaiId() {
        return banKuaiId;
    }

    public void setBanKuaiId(int banKuaiId) {
        this.banKuaiId = banKuaiId;
    }

    public String getBanKuaiName() {
        return banKuaiName;
    }

    public void setBanKuaiName(String banKuaiName) {
        this.banKuaiName = banKuaiName;
    }

    public bankuai(int banKuaiId, String banKuaiName) {
        this.banKuaiId = banKuaiId;
        this.banKuaiName = banKuaiName;
    }
}
