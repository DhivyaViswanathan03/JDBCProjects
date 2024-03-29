package com.divs.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.divs.dto.Student;
import com.divs.util.jdbcutil;

public class StudentDaoImpl implements IStudentDao{

	@Override
	public String addStudent(String name, int age, String address)  {
		Connection connection=null;
		PreparedStatement preStatement=null;
		ResultSet resultSet=null;
		Scanner input=null;
		try {
			String insertQuery="insert into student(`name`,`age`,`address`) values(?,?,?)";
			connection=jdbcutil.getJdbcConnection();
			if(connection!=null) {
				preStatement=connection.prepareStatement(insertQuery);
			}
			
			if(preStatement!=null) {
				preStatement.setString(1,name);
				preStatement.setInt(2,age);
				preStatement.setString(3, address);

				int rowCount=preStatement.executeUpdate();

				if(rowCount>0) 
					return "success";

			}

		} 

		catch(SQLException sql) {
			sql.printStackTrace();
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				jdbcutil.CleanUp(connection, preStatement, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			System.out.println("connection is closed....");
		}
		return "failure";
	}

	@Override
	public Student searchStudent(int sid) {

		Connection connection=null;
		PreparedStatement preStatement=null;
		ResultSet resultSet=null;
		Student student=null;
		
		try {
			String selectQuery="select id,name,age,address from student where id=?";
			connection=jdbcutil.getJdbcConnection();
			if(connection!=null) {
				preStatement=connection.prepareStatement(selectQuery);
			}
			
			if(preStatement!=null) {
				
				preStatement.setInt(1,sid);
				

				ResultSet rs=preStatement.executeQuery();
				
				while(rs.next()) {
					student=new Student();
					student.setId(rs.getInt(1));
					student.setName(rs.getString(2));
					student.setAge(rs.getInt(3));
					student.setAddress(rs.getString(4));
					}
				return student;
				
			}

		} 

		catch(SQLException sql) {
			sql.printStackTrace();
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				jdbcutil.CleanUp(connection, preStatement, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			System.out.println("connection is closed....");
		}
		return student;
		
	}

	@Override
	public String updateStudent(int sid, String name, int age, String address) {
		Connection connection=null;
		PreparedStatement preStatement=null;
		ResultSet resultSet=null;
		String oldName=null;
		try {
			System.out.println("Records before updation");
			connection=jdbcutil.getJdbcConnection();
			preStatement=connection.prepareStatement("select id ,name,age,address from student where id=?");
			preStatement.setInt(1, sid);
			resultSet=preStatement.executeQuery();
			System.out.println("id\tname\tage\taddress");
			while(resultSet.next()) {
				//oldName=resultSet.getString(2);
				System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3)
				+"\t"+resultSet.getString(4));
			}
			
			String updateQuery="update student set age=?,name=?,address=?where id=?";
			
			preStatement=connection.prepareStatement(updateQuery);
			preStatement.setInt(1, age);
			preStatement.setString(2, oldName+name);
		    preStatement.setString(3, address);
		    preStatement.setInt(4, sid);
		    
		    int rowCount=preStatement.executeUpdate();
		    
		    if(rowCount>0) 
		 return "success";
		  
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "failure";
	}

	@Override
	public String deleteStudent(int sid) {
		

		Connection connection=null;
		PreparedStatement preStatement=null;
		ResultSet resultSet=null;
		
		
		try {
			String deleteQuery="delete from student where id=?";
			connection=jdbcutil.getJdbcConnection();
			if(connection!=null) {
				preStatement=connection.prepareStatement(deleteQuery);
			}
			
			if(preStatement!=null) {
				
				preStatement.setInt(1,sid);
				int rowCount=preStatement.executeUpdate();
				if(rowCount>0)
				return "success";
				else
					return "not found";
				
			}

		} 

		catch(SQLException sql) {
			sql.printStackTrace();
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				jdbcutil.CleanUp(connection, preStatement, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		}
		return "failure";
	}

}
