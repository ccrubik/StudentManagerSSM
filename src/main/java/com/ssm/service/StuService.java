package com.ssm.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.ssm.entity.Student;

/**
 * @author Rubik
 */
public interface StuService {

    List<Student> listAllStus();

    boolean addStu(Student stu);

    void deleteStuBySid(String sid);

    Student findStuBySid(String sid);

    boolean updateStu(Student stu);

    List<Student> queryStu(String sname, String sgender);

    boolean queryStuBySname(String sname);

    PageInfo<Student> pageListStus(int currentPage);

}
