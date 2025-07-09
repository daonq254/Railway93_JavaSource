package com.vti.frontend;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.Department;

public class Demo {
	public static void main(String[] args) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();

//	Insert dữ liệu
			session.beginTransaction();
			Department department = new Department();
			department.setName("Test");
			session.save(department);
			session.getTransaction().commit();

		} finally {
			session.close();
		}

//		

//	Tạo câu Query
//		String hqlQuery = "FROM Department WHERE id >=5 ORDER BY id";
//		Query<Department> query = session.createQuery(hqlQuery);
//		List<Department> listDepartment = query.list();
//
//		for (Department department : listDepartment) {
//			System.out.println(department.getId() + "     " + department.getName());
//		}

	}

	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
//		
		configuration.addAnnotatedClass(Department.class);
//		configuration.addAnnotatedClass(Account.class);
//		configuration.addAnnotatedClass(Position.class);

//		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceRegistry);
	}

}
