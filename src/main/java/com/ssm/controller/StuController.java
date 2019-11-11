package com.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.ssm.entity.Student;
import com.ssm.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Rubik
 */
@Controller
public class StuController {

    private StuService stuService;

    @Autowired
    public void setStuService(StuService stuService) {
        this.stuService = stuService;
    }

    @RequestMapping("/addStu")
    public String goToAddStu() {
        return "addStu";
    }

    @RequestMapping("/list")
    public void listAllStus(Model model) {
        List<Student> stusList = stuService.listAllStus();
        model.addAttribute("stuList", stusList);

    }

    @RequestMapping("/addstu")
    public String addStu(Student student, Model model) {
        boolean flag = stuService.addStu(student);
        if (flag) {
            return "list";
        } else {
            return "addStu";
        }
    }

    @RequestMapping("pagelist/{currentPage}")
    public String pageListAllStus(@PathVariable("currentPage") int currentPage, Model model) {
        PageInfo<Student> pageInfo = stuService.pageListStus(currentPage);
        model.addAttribute("pageInfo", pageInfo);
        return "pageList";
    }
}
