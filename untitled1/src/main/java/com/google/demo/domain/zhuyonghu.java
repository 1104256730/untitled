package com.google.demo.domain;

public class zhuyonghu {
    private  Integer zyhID;
    private String name;
    private String password;
    private Integer phone;/*电话号*/
    private String email;

    public zhuyonghu() {
    }

    public zhuyonghu(Integer zyhID, String name, String password, Integer phone, String email) {
        this.zyhID = zyhID;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

    public Integer getZyhID() {
        return zyhID;
    }

    public void setZyhID(Integer zyhID) {
        this.zyhID = zyhID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ZhuYongHu{" +
                "zyhID=" + zyhID +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}

