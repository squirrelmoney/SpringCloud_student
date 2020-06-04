package com.lnsf.pojo;

public class TbStucourse extends TbStucourseKey {
    private String teachernum;

    private Integer grade;

    private TbTeacher tbTeacher;

    private TbCourse tbCourse;


    public TbTeacher getTbTeacher() {
        return tbTeacher;
    }

    public void setTbTeacher(TbTeacher tbTeacher) {
        this.tbTeacher = tbTeacher;
    }

    public TbCourse getTbCourse() {
        return tbCourse;
    }

    public void setTbCourse(TbCourse tbCourse) {
        this.tbCourse = tbCourse;
    }

    public String getTeachernum() {
        return teachernum;
    }

    public void setTeachernum(String teachernum) {
        this.teachernum = teachernum == null ? null : teachernum.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }


}