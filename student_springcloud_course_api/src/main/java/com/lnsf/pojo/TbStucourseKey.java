package com.lnsf.pojo;

public class TbStucourseKey {
    private String studentnum;

    private Integer coursenum;

    public String getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(String studentnum) {
        this.studentnum = studentnum == null ? null : studentnum.trim();
    }

    public Integer getCoursenum() {
        return coursenum;
    }

    public void setCoursenum(Integer coursenum) {
        this.coursenum = coursenum;
    }

    @Override
    public String toString() {
        return "TbStucourseKey{" +
                "studentnum='" + studentnum + '\'' +
                ", coursenum=" + coursenum +
                '}';
    }
}