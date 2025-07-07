package com.vti.frontend;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.Department;

public class Demo {
	public static void main(String[] args) {
		Session session = null;
		session = buildSessionFactory().openSession();

//	Tạo câu Query
		String hqlQuery = "FROM Department";
		Query<Department> query = session.createQuery(hqlQuery);
		List<Department> listDepartment = query.list();

		for (Department department : listDepartment) {
			System.out.println(department.getId() + "     " + department.getName());
		}
	}

	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
//		
		configuration.addAnnotatedClass(Department.class);
//		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceRegistry);
	}

}
