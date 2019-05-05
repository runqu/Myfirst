package com.atguigu.javaweb.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	public List<Student> getALL() {
		
		List<Student> students = new ArrayList<>();
		Connection connection = null;
		PreparedStatement PreparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			String driverClass ="com.mysql.jdbc.Driver";
			String url ="jdbc:mysql://127.0.0.1:3306/atguigu";
			String user = "root";
			String password="997515";
			
			Class.forName(driverClass);
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("coon");
			String sql ="SELECT flow_id, Type, id_card, exam_card, student_name, Location, Grade from examstudent";

			PreparedStatement = connection.prepareStatement(sql);
			resultSet = PreparedStatement.executeQuery();
			while(resultSet.next()) {
				int flow_id = resultSet.getInt(1);
				int type =resultSet.getInt(2);
				int idCard = resultSet.getInt(3);
				int examCard =resultSet.getInt(4);
				String studentNmae = resultSet.getString(5);
				String location = resultSet.getString(6);
				int grade =resultSet.getInt(7);

				Student student =new Student(flow_id, type, idCard, examCard, studentNmae, location, grade);
				students.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(resultSet !=null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(PreparedStatement !=null) {
					PreparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}try {
				if(connection !=null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("coon");
		return students;
	}
}
