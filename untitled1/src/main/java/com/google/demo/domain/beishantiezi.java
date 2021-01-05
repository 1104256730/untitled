package com.google.demo.domain;

public class beishantiezi {
    private int tieZiId;
    private String beiShanTiZiBiaoTi;
    private String banKuaiName;
    private String zhuYongHhuName;

    public int getTieZiId() {
        return tieZiId;
    }

    public void setTieZiId(int tieZiId) {
        this.tieZiId = tieZiId;
    }

    public String getBeiShanTiZiBiaoTi() {
        return beiShanTiZiBiaoTi;
    }

    public void setBeiShanTiZiBiaoTi(String beiShanTiZiBiaoTi) {
        this.beiShanTiZiBiaoTi = beiShanTiZiBiaoTi;
    }

    public String getBanKuaiName() {
        return banKuaiName;
    }

    public void setBanKuaiName(String banKuaiName) {
        this.banKuaiName = banKuaiName;
    }

    public String getZhuYongHhuName() {
        return zhuYongHhuName;
    }

    public void setZhuYongHhuName(String zhuYongHhuName) {
        this.zhuYongHhuName = zhuYongHhuName;
    }

    public beishantiezi(int tieZiId, String beiShanTiZiBiaoTi, String banKuaiName, String zhuYongHhuName) {
        this.tieZiId = tieZiId;
        this.beiShanTiZiBiaoTi = beiShanTiZiBiaoTi;
        this.banKuaiName = banKuaiName;
        this.zhuYongHhuName = zhuYongHhuName;
    }

    public beishantiezi() {
    }

    @Override
    public String toString() {
        return "beishantiezi{" +
                "tieZiId=" + tieZiId +
                ", beiShanTiZiBiaoTi='" + beiShanTiZiBiaoTi + '\'' +
                ", banKuaiName='" + banKuaiName + '\'' +
                ", zhuYongHhuName='" + zhuYongHhuName + '\'' +
                '}';
    }
}
