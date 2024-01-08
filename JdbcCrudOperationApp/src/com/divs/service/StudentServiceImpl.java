package com.divs.service;

import com.divs.daofactory.StudentDaoFactory;
import com.divs.dto.Student;
import com.divs.persistence.IStudentDao;

public class StudentServiceImpl implements IStudentService{
   private  IStudentDao studentDao;

	@Override
	public String addStudent(String name, int age, String address) {
		studentDao=StudentDaoFactory.getStudentDao();
		return studentDao.addStudent(name, age, address);
		
	}

	@Override
	public Student searchStudent(int sid) {
		studentDao=StudentDaoFactory.getStudentDao();
		return studentDao.searchStudent(sid);
	}

	@Override
	public String updateStudent(int sid, String name, int age, String address) {
		studentDao=StudentDaoFactory.getStudentDao();
		return studentDao.updateStudent(sid, name, age, address);
		
	}

	@Override
	public String deleteStudent(int sid) {
		studentDao=StudentDaoFactory.getStudentDao();
		return studentDao.deleteStudent(sid);
	}

}
