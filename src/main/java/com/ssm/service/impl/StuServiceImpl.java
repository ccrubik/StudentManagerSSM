package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.dao.StuDao;
import com.ssm.entity.Student;
import com.ssm.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

@Service("stuService")
public class StuServiceImpl implements StuService {
    private StuDao stuDao;

    @Autowired
    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public List<Student> listAllStus() {
        return stuDao.listAllStus();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public boolean addStu(Student stu) {
        try {
            stuDao.addStu(stu);
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return false;
        }
        return true;
    }

    @Override
    public void deleteStuBySid(String sid) {
        stuDao.deleteStuBySid(sid);
    }

    @Override
    public Student findStuBySid(String sid) {
        return stuDao.findStuBySid(sid);
    }

    @Override
    public boolean updateStu(Student stu) {
        return stuDao.updateStu(stu);
    }

    @Override
    public List<Student> queryStu(String sname, String sgender) {
        String sql = "SELECT sid,sname,sage,sgender,shobby,sbirthday FROM stus WHERE 1 = 1";
        if (sname != null && sname.length() != 0) {
            sql += " AND sname LIKE '%" + sname + "%'";
        }
        if (sgender != null && sgender.length() != 0) {
            sql += " AND sgender='" + sgender + "'";
        }
        return stuDao.queryStu(sql);
    }

    @Override
    public boolean queryStuBySname(String sname) {
        return stuDao.queryStuBySname(sname);
    }

    @Override
    public PageInfo<Student> pageListStus(int currentPage) {
        PageHelper.startPage(currentPage, 6);
        List<Student> students = stuDao.listAllStus();
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        return pageInfo;
    }
}
