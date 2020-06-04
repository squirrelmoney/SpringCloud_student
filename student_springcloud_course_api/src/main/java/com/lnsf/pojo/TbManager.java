package com.lnsf.pojo;

public class TbManager {
    private String managernum;

    private String managername;

    private String managersex;

    private String managerentrydate;

    private String managerpassword;

    private Integer managerrights;

    public String getManagernum() {
        return managernum;
    }

    public void setManagernum(String managernum) {
        this.managernum = managernum == null ? null : managernum.trim();
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername == null ? null : managername.trim();
    }

    public String getManagersex() {
        return managersex;
    }

    public void setManagersex(String managersex) {
        this.managersex = managersex == null ? null : managersex.trim();
    }

    public String getManagerentrydate() {
        return managerentrydate;
    }

    public void setManagerentrydate(String managerentrydate) {
        this.managerentrydate = managerentrydate == null ? null : managerentrydate.trim();
    }

    public String getManagerpassword() {
        return managerpassword;
    }

    public void setManagerpassword(String managerpassword) {
        this.managerpassword = managerpassword == null ? null : managerpassword.trim();
    }

    public Integer getManagerrights() {
        return managerrights;
    }

    public void setManagerrights(Integer managerrights) {
        this.managerrights = managerrights;
    }
}