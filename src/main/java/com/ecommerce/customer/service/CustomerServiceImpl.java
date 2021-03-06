package com.ecommerce.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.customer.dao.CustomerDao;
import com.ecommerce.customer.dao.RoleDao;
import com.ecommerce.customer.domain.Customer;
import com.ecommerce.customer.domain.CustomerRole;
import com.ecommerce.customer.domain.Role;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	@Autowired
	RoleDao roleDao;

	@Override
	public Customer createCustomer(Customer customer) {
		customer.setIsRegistred(true);

		return customer;
	}

	@Override
	public void createRegisteredCustomerRoles(Customer customer) {
		Role role = roleDao.readRoleById(new Long(2));
		CustomerRole customerRole = new CustomerRole();		
        customerRole.setRole(role);
        customerRole.setCustoer(customer);
        roleDao.addRoleToCustomer(customerRole);

	}

	public Customer saveCustomer(Customer customer) {
		return saveCustomer(customer, customer.getIsRegistred());
	}

	@Override
	public Customer saveCustomer(Customer customer, boolean registred) {

		return customerDao.save(customer);
	}

	@Override
	public Customer createNewCustomer() {
		// TODO Auto-generated method stub
		return new Customer();
	}

	@Override
	public void registerCustomer(Customer customer, String password, String passwordConfirm) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();	
		customer.setPassword(encoder.encode(password));
		saveCustomer(customer, true);
		createRegisteredCustomerRoles(customer);

	}

	@Override
	public Customer findCustomerByName(String username) {
		
		Customer customer =customerDao.findCustomerByName(username);
		return customer;
	}

	public CustomerRole readRoleByCustomerRoleiD(long customerRoleId) {
		
		CustomerRole customerRole = roleDao.readRoleByCustomerRoleiD(customerRoleId);
		return customerRole;
	}

	@Override
	public Boolean isDoubleEmail(String email) {
		
		Boolean isDoubledMain =customerDao.isDoubleMail(email);
		return isDoubledMain;
	}

}
