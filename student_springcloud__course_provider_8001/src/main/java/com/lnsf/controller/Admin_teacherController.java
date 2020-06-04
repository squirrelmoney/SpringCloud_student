package com.lnsf.controller;

import com.lnsf.pojo.TbDept;
import com.lnsf.pojo.TbTeacher;
import com.lnsf.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Admin_teacherController {
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


    @GetMapping("teachers")
    public  String teacher(Model m){
        List<TbTeacher> tbTeachers = tbTeacherService.selectByExample(null);
        for (TbTeacher tbTeacher:tbTeachers) {
            TbDept tbDept=tbDeptService.selectByPrimaryKey(tbTeacher.getDeptnum());
            tbTeacher.setTbDept(tbDept);
        }
        m.addAttribute("tbTeachers",tbTeachers);
        return "admin/teachers";
    }

    @GetMapping("teacher")
    public String edit(Model m) {
        List<TbDept> tbDepts = tbDeptService.selectByExample(null);
        m.addAttribute("tbDepts", tbDepts);
        return "admin/editteacher";
    }


    @PostMapping("teacher")
    public String add(TbTeacher TbTeacher) {
        int i = tbTeacherService.insertSelective(TbTeacher);
        if (i != 0) {
            return "redirect:/teachers";
        } else
            return "redirect:/error";
    }

    @GetMapping("teacher/{id}")
    public String edit(Model m, @PathVariable String id) {
        TbTeacher teacher = tbTeacherService.selectByPrimaryKey(id);
        TbDept Major = tbDeptService.selectByPrimaryKey(teacher.getDeptnum());
        teacher.setTbDept(Major);
        List<TbDept> tbDepts = tbDeptService.selectByExample(null);
        m.addAttribute("tbDepts", tbDepts);
        m.addAttribute("teacher", teacher);
        return "admin/editteacher";
    }

    @PutMapping("teacher")
    public String update(TbTeacher TbTeacher) {
        int i = tbTeacherService.updateByPrimaryKeySelective(TbTeacher);
        if (i != 0) {
            return "redirect:/teachers";
        } else
            return "redirect:/error";
    }

    @DeleteMapping("teacher/{id}")
    public String delete(@PathVariable String id) {
        int i = tbTeacherService.deleteByPrimaryKey(id);
        if (i != 0) {
            return "redirect:/teachers";
        } else
            return "redirect:/error";
    }


}
