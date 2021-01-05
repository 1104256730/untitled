package com.google.demo.domain;

public class xiaoxi {
    private  Integer xiaoXiId;
    private  Integer tieZiId;
    private  String xiaoXiNeiRong;
    private String name;

    public xiaoxi() {
    }

    public xiaoxi(Integer xiaoXiId, Integer tieZiId, String xiaoXiNeiRong, String name) {
        this.xiaoXiId = xiaoXiId;
        this.tieZiId = tieZiId;
        this.xiaoXiNeiRong = xiaoXiNeiRong;
        this.name = name;
    }

    public Integer getXiaoXiId() {
        return xiaoXiId;
    }

    public void setXiaoXiId(Integer xiaoXiId) {
        this.xiaoXiId = xiaoXiId;
    }

    public Integer getTieZiId() {
        return tieZiId;
    }

    public void setTieZiId(Integer tieZiId) {
        this.tieZiId = tieZiId;
    }

    public String getXiaoXiNeiRong() {
        return xiaoXiNeiRong;
    }

    public void setXiaoXiNeiRong(String xiaoXiNeiRong) {
        this.xiaoXiNeiRong = xiaoXiNeiRong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "XiaoXi{" +
                "xiaoXiId=" + xiaoXiId +
                ", tieZiId=" + tieZiId +
                ", xiaoXiNeiRong='" + xiaoXiNeiRong + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
