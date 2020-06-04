package com.lnsf.pojo;

public class TbDept {
    private Integer deptnum;

    private String deptname;

    private String teachernum;

    private String depttel;

    public Integer getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(Integer deptnum) {
        this.deptnum = deptnum;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getTeachernum() {
        return teachernum;
    }

    public void setTeachernum(String teachernum) {
        this.teachernum = teachernum == null ? null : teachernum.trim();
    }

    public String getDepttel() {
        return depttel;
    }

    public void setDepttel(String depttel) {
        this.depttel = depttel == null ? null : depttel.trim();
    }
}