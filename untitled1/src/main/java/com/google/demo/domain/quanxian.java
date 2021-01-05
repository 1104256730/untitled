package com.google.demo.domain;

public class quanxian {
    private int quanXianId;
    private String quanXianName;

    @Override
    public String toString() {
        return "quanxian{" +
                "quanXianId=" + quanXianId +
                ", quanXianName='" + quanXianName + '\'' +
                '}';
    }

    public int getQuanXianId() {
        return quanXianId;
    }

    public void setQuanXianId(int quanXianId) {
        this.quanXianId = quanXianId;
    }

    public String getQuanXianName() {
        return quanXianName;
    }

    public void setQuanXianName(String quanXianName) {
        this.quanXianName = quanXianName;
    }

    public quanxian(int quanXianId, String quanXianName) {
        this.quanXianId = quanXianId;
        this.quanXianName = quanXianName;
    }

    public quanxian() {
    }
}
