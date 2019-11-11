package com.ssm.dao;

import java.util.List;

import com.ssm.entity.Student;
import org.springframework.stereotype.Repository;

import javax.imageio.stream.IIOByteBuffer;

/**
 * @author Rubik
 */
@Repository("stuDao")
public interface StuDao {

	List<Student> listAllStus();

	boolean addStu(Student stu);

	void deleteStuBySid(String sid);

	Student findStuBySid(String sid);

	boolean updateStu(Student stu);

	List<Student> queryStu(String sql);

	boolean queryStuBySname(String sname);

	List<Student> pageListStus(int limit, int offset);

	int getCount();

}
