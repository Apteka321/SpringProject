/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: The State School of Higher Vocational Education in Jaroslaw
 * License Type: Academic
 */
package com.ecommerce.customer.domain;

import java.io.Serializable;
import javax.persistence.*;
@Entity
//@org.hibernate.annotations.Proxy(lazy=true)
@Table(name="CustomerRole")
public class CustomerRole implements Serializable {
	public CustomerRole() {
	}
	
	@Column(name="customerRoleId", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="COM_ECOMMERCE_CUSTOMER_DOMAIN_CUSTOMERROLE_CUSTOMERROLEID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_ECOMMERCE_CUSTOMER_DOMAIN_CUSTOMERROLE_CUSTOMERROLEID_GENERATOR", strategy="native")	
	private long customerRoleId;
	
	@ManyToOne(targetEntity=com.ecommerce.customer.domain.Customer.class, fetch=FetchType.EAGER)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="custoerId", referencedColumnName="customerId", nullable=false) })	
	private com.ecommerce.customer.domain.Customer custoer;
	
	@ManyToOne(targetEntity=com.ecommerce.customer.domain.Role.class, fetch=FetchType.EAGER)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="roleId", referencedColumnName="roleId", nullable=false) })	
	private com.ecommerce.customer.domain.Role role;
	
	private void setCustomerRoleId(long value) {
		this.customerRoleId = value;
	}
	
	public long getCustomerRoleId() {
		return customerRoleId;
	}
	
	public long getORMID() {
		return getCustomerRoleId();
	}
	
	public void setCustoer(com.ecommerce.customer.domain.Customer value) {
		this.custoer = value;
	}
	
	public com.ecommerce.customer.domain.Customer getCustoer() {
		return custoer;
	}
	
	public void setRole(com.ecommerce.customer.domain.Role value) {
		this.role = value;
	}
	
	public com.ecommerce.customer.domain.Role getRole() {
		return role;
	}
	
	public String toString() {
		return String.valueOf(getCustomerRoleId());
	}
	
}
