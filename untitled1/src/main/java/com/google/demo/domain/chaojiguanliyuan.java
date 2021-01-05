package com.google.demo.domain;

public class chaojiguanliyuan {
private int chaoJiGuanLiYuanId;
private String chaoJiGuanLiYuanName;
private String quanXian;

    @Override
    public String toString() {
        return "chaojiguanliyuan{" +
                "chaoJiGuanLiYuanId=" + chaoJiGuanLiYuanId +
                ", chaoJiGuanLiYuanName='" + chaoJiGuanLiYuanName + '\'' +
                ", quanXian='" + quanXian + '\'' +
                '}';
    }

    public int getChaoJiGuanLiYuanId() {
        return chaoJiGuanLiYuanId;
    }

    public void setChaoJiGuanLiYuanId(int chaoJiGuanLiYuanId) {
        this.chaoJiGuanLiYuanId = chaoJiGuanLiYuanId;
    }

    public String getChaoJiGuanLiYuanName() {
        return chaoJiGuanLiYuanName;
    }

    public void setChaoJiGuanLiYuanName(String chaoJiGuanLiYuanName) {
        this.chaoJiGuanLiYuanName = chaoJiGuanLiYuanName;
    }

    public String getQuanXian() {
        return quanXian;
    }

    public void setQuanXian(String quanXian) {
        this.quanXian = quanXian;
    }

    public chaojiguanliyuan(int chaoJiGuanLiYuanId, String chaoJiGuanLiYuanName, String quanXian) {
        this.chaoJiGuanLiYuanId = chaoJiGuanLiYuanId;
        this.chaoJiGuanLiYuanName = chaoJiGuanLiYuanName;
        this.quanXian = quanXian;
    }

    public chaojiguanliyuan() {
    }
}
