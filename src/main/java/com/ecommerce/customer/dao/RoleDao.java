package com.ecommerce.customer.dao;

import java.util.Set;

import com.ecommerce.customer.domain.Customer;
import com.ecommerce.customer.domain.CustomerRole;
import com.ecommerce.customer.domain.Role;

public interface RoleDao {
	
	public void addRoleToCustomer(CustomerRole customerRole);
	public Role readRoleById(Long roleId);
	public CustomerRole readRoleByCustomer(Customer customer);
	public CustomerRole readRoleByCustomerRoleiD(long customerRoleId);
}
