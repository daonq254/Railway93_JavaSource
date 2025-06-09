package com.vti.frontend;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.vti.entity.Department;

public class Demo {
	public static void main(String[] args) {

//		Load dữ liệu từ file database.properties
		Properties property = new Properties();
		try {
			property.load(new FileInputStream(
					"C:\\Users\\ThinkPad\\eclipse-workspace\\Railway93\\RainlWay90_ConnectDBMaven\\RainlWay90_ConnectDBMaven\\src\\main\\resources\\database.properties"));
			String url = property.getProperty("url");
			String user = property.getProperty("username");
			String password = property.getProperty("password");
			String dirver = property.getProperty("driver");
//		Tạo kết nối
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement selectStmt = conn.createStatement();

// 		Lấy danh sách phòng ban
			String selectSQL = "SELECT * FROM Department";
			ResultSet rs = selectStmt.executeQuery(selectSQL);
			List<Department> departmentList = new ArrayList<Department>();

			while (rs.next()) {
				Department dept = new Department();
				dept.setId(rs.getInt("DepartmentID"));
				dept.setName(rs.getString("DepartmentName"));
				departmentList.add(dept);
			}

// 		In danh sách phòng ban
			System.out.println("\n=== Department List ===");
			for (Department dept : departmentList) {
				System.out.println(dept);
			}

			rs.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
