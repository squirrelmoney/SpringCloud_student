package com.lnsf.controller;

import com.lnsf.pojo.*;
import com.lnsf.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class Admin_stuCourseController {
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


    @GetMapping("stucourses")
    public  String StuCourse(Model m){
        List<TbStucourse> tbStucourses = tbStucourseService.selectByExample(null);
        for (TbStucourse tbStucourse:tbStucourses) {
            TbTeacher tbTeacher = tbTeacherService.selectByPrimaryKey(tbStucourse.getTeachernum());
            tbStucourse.setTbTeacher(tbTeacher);
        }
        m.addAttribute("StuCourses",tbStucourses);
        return "admin/stucourses";
    }


    @GetMapping("stucourse")
    public String edit(Model m) {
        List<TbTeacher> tbTeachers = tbTeacherService.selectByExample(null);
        List<TbCourse> tbCourses = tbCourseService.selectByExample(null);
        m.addAttribute("tbTeachers", tbTeachers);
        m.addAttribute("tbCourses",tbCourses);
        return "admin/editstucourse";
    }


    @PostMapping("stucourse")
    public String add(TbStucourse tbStucourse) {
        System.out.println(tbStucourse);
        int i = tbStucourseService.insertSelective(tbStucourse);
        if (i != 0) {
            return "redirect:/stucourses";
        } else
            return "redirect:/error";
    }

    @GetMapping("stucourse/{sid}/{cid}")
    public String edit(Model m, @PathVariable String sid,@PathVariable Integer cid) {
        TbStucourseKey tbStucourseKey=new TbStucourse();
        tbStucourseKey.setStudentnum(sid);
        tbStucourseKey.setCoursenum(cid);
        TbStucourse tbStucourse = tbStucourseService.selectByPrimaryKey(tbStucourseKey);
        TbTeacher teacher = tbTeacherService.selectByPrimaryKey(tbStucourse.getTeachernum());
        TbCourse course = tbCourseService.selectByPrimaryKey(tbStucourse.getCoursenum());
        tbStucourse.setTbTeacher(teacher);
        tbStucourse.setTbCourse(course);
        List<TbTeacher> tbTeachers = tbTeacherService.selectByExample(null);
        TbCourseExample tbcourseExample= new TbCourseExample();
        tbcourseExample.setDistinct(true);
        List<TbCourse> tbCourses = tbCourseService.selectByExample(tbcourseExample);
        m.addAttribute("tbTeachers", tbTeachers);
        m.addAttribute("tbCourses",tbCourses);
        m.addAttribute("tbstucourse", tbStucourse);
        return "admin/editstucourse";
    }

    @PutMapping("stucourse")
    public String update(TbStucourse tbStucourse) {
        System.out.println(tbStucourse);
        int i = tbStucourseService.updateByPrimaryKey(tbStucourse);
        if (i != 0) {
            return "redirect:/stucourses";
        } else
            return "redirect:/error";
    }

    @DeleteMapping("stucourse/{sid}/{cid}")
    public String delete( @PathVariable String sid,@PathVariable Integer cid)
    {
        TbStucourseKey tbStucourseKey=new TbStucourse();
        tbStucourseKey.setStudentnum(sid);
        tbStucourseKey.setCoursenum(cid);
        int i = tbStucourseService.deleteByPrimaryKey(tbStucourseKey);
        if (i != 0) {
            return "redirect:/stucourses";
        } else
            return "redirect:/error";
    }


}
