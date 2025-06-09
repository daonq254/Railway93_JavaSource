package com.vti.frontend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.vti.entity.Department;

public class Demo {
	public static void main(String[] args) {
// Kết nối CSDL MySQL, hiển thị thông tin Department đang có trên hệ thống
//		Tạo 1 kết nối tới DB Server
//		String url = "jdbc:mysql://localhost:3306/testingsystem_railway93?autoReconnect=true&useSSL=false&characterEncoding=latin1";
//		String user = "root";
//		String password = "root";

		try {
//			Tạo đối tượng Properties
			Properties property = new Properties();
			property.load(new FileInputStream(
					"C:\\Users\\ThinkPad\\eclipse-workspace\\Railway93\\P93_P11_DemoConnectDB\\src\\com\\vti\\resources\\database.properties"));
			String url = property.getProperty("url");
			String user = property.getProperty("username");
			String password = property.getProperty("password");

			Connection conn = DriverManager.getConnection(url, user, password);

			// Tạo Statement
			Statement statement = conn.createStatement();

//			Viết câu lệnh SQL tương ứng
			String selectDepSQL = "SELECT * FROM department ORDER BY DepartmentID;";

//			Nhờ JDBC-Statent ==> gửi câu lệnh vào DB Server ==> kết quả ResultSet
			ResultSet resultSet = statement.executeQuery(selectDepSQL);

			List<Department> listDepartments = new ArrayList();
			while (resultSet.next()) {
				Department department = new Department();
				department.setId(resultSet.getInt(1));
				department.setName(resultSet.getString(2));
				listDepartments.add(department);
//				System.out.println(
//						resultSet.getInt("DepartmentID") + "          " + resultSet.getString("DepartmentName"));
			}
//			Hiển thị dữ liệu
			System.out.println("ID             Name");
			for (Department department : listDepartments) {
				System.out.println(department.getId() + "                 " + department.getName());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
