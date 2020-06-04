package com.lnsf.controller;

import com.lnsf.pojo.TbCourse;
import com.lnsf.pojo.TbTeacher;
import com.lnsf.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Admin_courseController {
    @Autowired
    private TbCourseService tbCourseService;
    @Autowired
    private TbTeacherService tbTeacherService;
    @Autowired
    private TbStucourseService tbStucourseService;
    @Autowired
    private TbDeptService tbDeptService;
    @Autowired
    private TbStudentService tbStudentService;

    @GetMapping("courses")
    public String AllCourse(Model m){
        List<TbCourse> Courses = tbCourseService.selectByExample(null);
        for (TbCourse course:Courses) {
            System.out.println(course);
            TbTeacher tbTeacher = tbTeacherService.selectByPrimaryKey(course.getTeachernum());
            course.setTbTeacher(tbTeacher);
        }
        m.addAttribute("Courses",Courses);
        return "admin/courses";
    }

    @GetMapping("course")
    public String edit(Model m) {
        List<TbTeacher> tbTeachers = tbTeacherService.selectByExample(null);
        m.addAttribute("tbTeachers", tbTeachers);
        return "admin/editcourse";
    }


    @PostMapping("course")
    public String add(TbCourse tbCourse) {
        int i = tbCourseService.insertSelective(tbCourse);
        if (i != 0) {
            return "redirect:/courses";
        } else
            return "redirect:/error";
    }

    @GetMapping("course/{id}")
    public String edit(Model m, @PathVariable Integer id) {
        TbCourse course = tbCourseService.selectByPrimaryKey(id);
        TbTeacher teacher = tbTeacherService.selectByPrimaryKey(course.getTeachernum());
        course.setTbTeacher(teacher);
        List<TbTeacher> tbTeachers = tbTeacherService.selectByExample(null);
        m.addAttribute("tbTeachers", tbTeachers);
        m.addAttribute("course", course);
        return "admin/editcourse";
    }

    @PutMapping("course")
    public String update(TbCourse tbCourse) {
        int i = tbCourseService.updateByPrimaryKeySelective(tbCourse);
        if (i != 0) {
            return "redirect:/courses";
        } else
            return "redirect:/error";
    }

    @DeleteMapping("course/{id}")
    public String delete(Model m, @PathVariable Integer id) {
        int i = tbCourseService.deleteByPrimaryKey(id);
        if (i != 0) {
            return "redirect:/courses";
        } else
            return "redirect:/error";
    }

}