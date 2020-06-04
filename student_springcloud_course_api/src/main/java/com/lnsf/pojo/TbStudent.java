package com.lnsf.pojo;

public class TbStudent {
    private String studentnum;

    private Integer majornum;

    private String studentname;

    private String studentsex;

    private String studententrydate;

    private String studentpassword;

    private Integer studentrights;

    private TbMajor tbMajor;

    public TbMajor getTbMajor() {
        return tbMajor;
    }

    public void setTbMajor(TbMajor tbMajor) {
        this.tbMajor = tbMajor;
    }

    public String getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(String studentnum) {
        this.studentnum = studentnum == null ? null : studentnum.trim();
    }

    public Integer getMajornum() {
        return majornum;
    }

    public void setMajornum(Integer majornum) {
        this.majornum = majornum;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getStudentsex() {
        return studentsex;
    }

    public void setStudentsex(String studentsex) {
        this.studentsex = studentsex == null ? null : studentsex.trim();
    }

    public String getStudententrydate() {
        return studententrydate;
    }

    public void setStudententrydate(String studententrydate) {
        this.studententrydate = studententrydate == null ? null : studententrydate.trim();
    }

    public String getStudentpassword() {
        return studentpassword;
    }

    public void setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword == null ? null : studentpassword.trim();
    }

    public Integer getStudentrights() {
        return studentrights;
    }

    public void setStudentrights(Integer studentrights) {
        this.studentrights = studentrights;
    }

    @Override
    public String toString() {
        return "TbStudent{" +
                "studentnum='" + studentnum + '\'' +
                ", majornum=" + majornum +
                ", studentname='" + studentname + '\'' +
                ", studentsex='" + studentsex + '\'' +
                ", studententrydate='" + studententrydate + '\'' +
                ", studentpassword='" + studentpassword + '\'' +
                ", studentrights=" + studentrights +
                ", tbMajor=" + tbMajor +
                '}';
    }
}