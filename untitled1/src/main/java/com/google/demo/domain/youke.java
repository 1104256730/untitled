package com.google.demo.domain;

public class youke {
    private Integer yhID;
    private String yhName;
    private String qx;

    public youke() {
    }

    public youke(Integer yhID, String yhName, String qx) {
        this.yhID = yhID;
        this.yhName = yhName;
        this.qx = qx;
    }

    public Integer getYhID() {
        return yhID;
    }

    public void setYhID(Integer yhID) {
        this.yhID = yhID;
    }

    public String getYhName() {
        return yhName;
    }

    public void setYhName(String yhName) {
        this.yhName = yhName;
    }

    public String getQx() {
        return qx;
    }

    public void setQx(String qx) {
        this.qx = qx;
    }

    @Override
    public String toString() {
        return "YouKe{" +
                "yhID=" + yhID +
                ", yhName='" + yhName + '\'' +
                ", qx='" + qx + '\'' +
                '}';
    }
}

