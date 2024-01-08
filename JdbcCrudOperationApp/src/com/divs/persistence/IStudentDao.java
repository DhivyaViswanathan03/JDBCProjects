package com.divs.persistence;

import com.divs.dto.Student;

public interface IStudentDao {
	
public String addStudent(String name,int age,String address);
	
	public Student searchStudent(int sid);
	
	public String updateStudent(int sid,String name,int age,String address);
	
	public String deleteStudent(int sid);
	

}
