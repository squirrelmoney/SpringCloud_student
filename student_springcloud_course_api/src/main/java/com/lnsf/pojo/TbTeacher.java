package com.lnsf.pojo;

public class TbTeacher {
    private String teachernum;

    private Integer deptnum;

    private String teachername;

    private String teachersex;

    private String teacherentrydate;

    private String teacherpassword;

    private String teachertitle;

    private Integer teacherrights;

    private TbDept tbDept;

    public TbDept getTbDept() {
        return tbDept;
    }

    public void setTbDept(TbDept tbDept) {
        this.tbDept = tbDept;
    }

    public String getTeachernum() {
        return teachernum;
    }

    public void setTeachernum(String teachernum) {
        this.teachernum = teachernum == null ? null : teachernum.trim();
    }

    public Integer getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(Integer deptnum) {
        this.deptnum = deptnum;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getTeachersex() {
        return teachersex;
    }

    public void setTeachersex(String teachersex) {
        this.teachersex = teachersex == null ? null : teachersex.trim();
    }

    public String getTeacherentrydate() {
        return teacherentrydate;
    }

    public void setTeacherentrydate(String teacherentrydate) {
        this.teacherentrydate = teacherentrydate == null ? null : teacherentrydate.trim();
    }

    public String getTeacherpassword() {
        return teacherpassword;
    }

    public void setTeacherpassword(String teacherpassword) {
        this.teacherpassword = teacherpassword == null ? null : teacherpassword.trim();
    }

    public String getTeachertitle() {
        return teachertitle;
    }

    public void setTeachertitle(String teachertitle) {
        this.teachertitle = teachertitle == null ? null : teachertitle.trim();
    }

    public Integer getTeacherrights() {
        return teacherrights;
    }

    public void setTeacherrights(Integer teacherrights) {
        this.teacherrights = teacherrights;
    }
}