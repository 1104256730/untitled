package com.google.demo.domain;

public class yonghu {
    private Integer yhId ;
    private String YhName;
    private String qx;

    public yonghu() {
    }

    public yonghu(Integer yhId, String yhName, String qx) {
        this.yhId = yhId;
        YhName = yhName;
        this.qx = qx;
    }

    public Integer getYhId() {
        return yhId;
    }

    public void setYhId(Integer yhId) {
        this.yhId = yhId;
    }

    public String getYhName() {
        return YhName;
    }

    public void setYhName(String yhName) {
        YhName = yhName;
    }

    public String getQx() {
        return qx;
    }

    public void setQx(String qx) {
        this.qx = qx;
    }

    @Override
    public String toString() {
        return "YongHu{" +
                "yhId=" + yhId +
                ", YhName='" + YhName + '\'' +
                ", qx='" + qx + '\'' +
                '}';
    }
}

