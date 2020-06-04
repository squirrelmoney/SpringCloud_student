package com.lnsf.controller;

import com.lnsf.pojo.TbMajor;
import com.lnsf.pojo.TbStudent;
import com.lnsf.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class Admin_studentController {
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
    @Autowired
    private TbMajorService tbMajorService;

    @GetMapping("students")
    public  String student(Model m){
        List<TbStudent> tbStudents = tbStudentService.selectByExample(null);
        for (TbStudent tbStudent:tbStudents) {
            TbMajor tbMajor = tbMajorService.selectByPrimaryKey(tbStudent.getMajornum());
            System.out.println(tbMajor);
            tbStudent.setTbMajor(tbMajor);
        }
        m.addAttribute("tbStudents",tbStudents);
        return "admin/students";
    }

    @GetMapping("student")
    public String edit(Model m) {
        List<TbMajor> tbMajors = tbMajorService.selectByExample(null);
        m.addAttribute("tbMajors", tbMajors);
        return "admin/editstudent";
    }


    @PostMapping("student")
    public String add(TbStudent TbStudent) {
        int i = tbStudentService.insertSelective(TbStudent);
        if (i != 0) {
            return "redirect:/students";
        } else
            return "redirect:/error";
    }

    @GetMapping("student/{id}")
    public String edit(Model m, @PathVariable String id) {
        TbStudent student = tbStudentService.selectByPrimaryKey(id);
        TbMajor Major = tbMajorService.selectByPrimaryKey(student.getMajornum());
        student.setTbMajor(Major);
        List<TbMajor> tbMajors = tbMajorService.selectByExample(null);
        m.addAttribute("tbMajors", tbMajors);
        m.addAttribute("student", student);
        return "admin/editstudent";
    }

    @PutMapping("student")
    public String update(TbStudent TbStudent) {
        int i = tbStudentService.updateByPrimaryKeySelective(TbStudent);
        if (i != 0) {
            return "redirect:/students";
        } else
            return "redirect:/error";
    }

    @DeleteMapping("student/{id}")
    public String delete(@PathVariable String id) {
        int i = tbStudentService.deleteByPrimaryKey(id);
        if (i != 0) {
            return "redirect:/students";
        } else
            return "redirect:/error";
    }


}
