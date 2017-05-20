package com.ecommerce.customer.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.customer.domain.Customer;
import com.ecommerce.customer.domain.CustomerRole;
import com.ecommerce.customer.domain.Role;

@Repository
@Transactional
public class RoleDaoImpl implements RoleDao {
	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override

	public void addRoleToCustomer(CustomerRole customerRole) {

		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(customerRole);
		tx.commit();
		session.close();

	}

	@Override
	public Role readRoleById(Long roleId) {
		
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Role role= session.get(Role.class,new Long(roleId));
		tx.commit();
		session.close();
		return role;
	}

	@Override
	public CustomerRole readRoleByCustomer(Customer customer) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		CustomerRole role= session.get(CustomerRole.class,customer);
		tx.commit();
		session.close();
		
		return role;
	}

	@Override
	public CustomerRole readRoleByCustomerRoleiD(long customerRoleId) {
		
		
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		CustomerRole custoemrRole= session.get(CustomerRole.class,customerRoleId);
		tx.commit();
		session.close();
		
		return custoemrRole;
		
		
	}



}
