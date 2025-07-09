package com.vti.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.vti.entity.Department;
import com.vti.utils.HibernateUtils;

public class DepartmentRepository {
//	private SessionFactory sessionFactory;
	private HibernateUtils hibernateUtils;

	public DepartmentRepository() {
//		sessionFactory = buildSessionFactory();
		hibernateUtils = HibernateUtils.getInstance();
	}

//	private SessionFactory buildSessionFactory() {
//		Configuration configuration = new Configuration();
//		configuration.configure("hibernate.cfg.xml");
////		
//		configuration.addAnnotatedClass(Department.class);
////		
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//				.applySettings(configuration.getProperties()).build();
//		return configuration.buildSessionFactory(serviceRegistry);
//	}
// Lấy danh sách phòng ban
	public List<Department> getListDepartment() {
		Session session = null;
		try {
//			session = sessionFactory.openSession();
			session = hibernateUtils.openSession();
			Query<Department> query = session.createQuery("FROM Department");
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}

		}
	}

	// Lấy danh sách phòng ban theo id
	public Department getDepartmentByID(short id) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Department department = session.get(Department.class, id);
			return department;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	Tìm phòng ban theo tên truyền vào
	public Department getDepartmentByName(String name) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Department> query = session.createQuery("FROM Department WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Department department = query.uniqueResult();
			return department;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
