package com.lnsf.pojo;

public class TbCourse {
    private Integer coursenum;

    private String coursename;

    private Float coursetime;

    private Integer coursecredit;

    private String teachernum;

    private  TbTeacher tbTeacher;

    public TbTeacher getTbTeacher() {
        return tbTeacher;
    }

    public void setTbTeacher(TbTeacher tbTeacher) {
        this.tbTeacher = tbTeacher;
    }


    public Integer getCoursenum() {
        return coursenum;
    }

    public void setCoursenum(Integer coursenum) {
        this.coursenum = coursenum;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public Float getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(Float coursetime) {
        this.coursetime = coursetime;
    }

    public Integer getCoursecredit() {
        return coursecredit;
    }

    public void setCoursecredit(Integer coursecredit) {
        this.coursecredit = coursecredit;
    }

    public String getTeachernum() {
        return teachernum;
    }

    public void setTeachernum(String teachernum) {
        this.teachernum = teachernum == null ? null : teachernum.trim();
    }

    @Override
    public String toString() {
        return "TbCourse{" +
                "coursenum=" + coursenum +
                ", coursename='" + coursename + '\'' +
                ", coursetime=" + coursetime +
                ", coursecredit=" + coursecredit +
                ", teachernum='" + teachernum + '\'' +
                ", tbTeacher=" + tbTeacher +
                '}';
    }
}