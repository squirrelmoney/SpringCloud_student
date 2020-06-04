package com.lnsf.pojo;

public class TbMajor {
    private Integer majornum;

    private String deptnum;

    private String majorname;

    private String teachernum;

    private String majortel;

    public Integer getMajornum() {
        return majornum;
    }

    public void setMajornum(Integer majornum) {
        this.majornum = majornum;
    }

    public String getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(String deptnum) {
        this.deptnum = deptnum == null ? null : deptnum.trim();
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public String getTeachernum() {
        return teachernum;
    }

    public void setTeachernum(String teachernum) {
        this.teachernum = teachernum == null ? null : teachernum.trim();
    }

    public String getMajortel() {
        return majortel;
    }

    public void setMajortel(String majortel) {
        this.majortel = majortel == null ? null : majortel.trim();
    }

    @Override
    public String toString() {
        return "TbMajor{" +
                "majornum=" + majornum +
                ", deptnum='" + deptnum + '\'' +
                ", majorname='" + majorname + '\'' +
                ", teachernum='" + teachernum + '\'' +
                ", majortel='" + majortel + '\'' +
                '}';
    }
}