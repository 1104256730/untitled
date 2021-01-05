package com.google.demo.domain;

public class guanliyuan {
    private int guanLiYuanId;
    private String guanLiYuanName;
    private String quanXian;

    public int getGuanLiYuanId() {
        return guanLiYuanId;
    }

    public void setGuanLiYuanId(int guanLiYuanId) {
        this.guanLiYuanId = guanLiYuanId;
    }

    public String getGuanLiYuanName() {
        return guanLiYuanName;
    }

    public void setGuanLiYuanName(String guanLiYuanName) {
        this.guanLiYuanName = guanLiYuanName;
    }

    public String getQuanXian() {
        return quanXian;
    }

    public void setQuanXian(String quanXian) {
        this.quanXian = quanXian;
    }

    public guanliyuan(int guanLiYuanId, String guanLiYuanName, String quanXian) {
        this.guanLiYuanId = guanLiYuanId;
        this.guanLiYuanName = guanLiYuanName;
        this.quanXian = quanXian;
    }

    public guanliyuan() {
    }

    @Override
    public String toString() {
        return "guanliyuan{" +
                "guanLiYuanId=" + guanLiYuanId +
                ", guanLiYuanName='" + guanLiYuanName + '\'' +
                ", quanXian='" + quanXian + '\'' +
                '}';
    }
}
