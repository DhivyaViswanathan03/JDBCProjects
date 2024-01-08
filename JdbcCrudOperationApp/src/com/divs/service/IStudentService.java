package com.divs.service;

import com.divs.dto.Student;

public interface IStudentService {
	
	public String addStudent(String name,int age,String address);
	
	public Student searchStudent(int sid);
	
	public String updateStudent(int sid,String name,int age,String address);
	
	public String deleteStudent(int sid);
	

}
