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
import javax.validation.constraints.Size;

import com.ecommerce.customer.annotation.UniqueUsername;
@Entity
@org.hibernate.annotations.Proxy(lazy=true)
@Table(name="Customer")
public class Customer implements Serializable {
	public Customer() {
	}
	
	@Column(name="customerId", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="COM_ECOMMERCE_CUSTOMER_DOMAIN_CUSTOMER_CUSTOMERID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_ECOMMERCE_CUSTOMER_DOMAIN_CUSTOMER_CUSTOMERID_GENERATOR", strategy="native")	
	private long customerId;
	
	@Size(min=3,max=30)
	@Column(name="userName",nullable=true, length=255)	
//	@UniqueUsername(message="Such username already exist!")
	private String userName;
	@Size(min=3,message="First Name must at least 3 characters")
	@Column(name="firstName", nullable=true, length=255)	
	private String firstName;
	@Column(name="lastName", nullable=true, length=255)	
	@Size(min=3,message="First Name must at least 3 characters")
	private String lastName;
	
	@Column(name="isRegistred", nullable=true)	
	private Boolean isRegistred;
	
	@Column(name="isDeleted", nullable=true)	
	private Boolean isDeleted;
	
	@Column(name="dateCreated", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date dateCreated;
	
	@Column(name="dateUpdated", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date dateUpdated;
	private String password;
	@Size(min=6,message="password must at least 6 characters")
	private String passwordChangeRequest;
	@Column(name="emailAdress", nullable=true, length=255)	
	@Size(min=1,message="Email adress can't be null")
	private String emailAdress;
	
	@Column(name="reciveEmail", nullable=true, length=255)	
	private String reciveEmail;
	
	@OneToMany(mappedBy="customer", targetEntity=com.ecommerce.customer.domain.CustomerAdress.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set customerAdress = new java.util.HashSet();
	
	@OneToMany(mappedBy="custoer", targetEntity=com.ecommerce.customer.domain.CustomerRole.class,fetch = FetchType.EAGER)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
//	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set customerRole = new java.util.HashSet();
	
	private void setCustomerId(long value) {
		this.customerId = value;
	}
	
	public long getCustomerId() {
		return customerId;
	}
	
	public long getORMID() {
		return getCustomerId();
	}
	
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setFirstName(String value) {
		this.firstName = value;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String value) {
		this.lastName = value;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setIsRegistred(boolean value) {
		setIsRegistred(new Boolean(value));
	}
	
	public void setIsRegistred(Boolean value) {
		this.isRegistred = value;
	}
	
	public Boolean getIsRegistred() {
		return isRegistred;
	}
	
	public void setIsDeleted(boolean value) {
		setIsDeleted(new Boolean(value));
	}
	
	public void setIsDeleted(Boolean value) {
		this.isDeleted = value;
	}
	
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	
	public void setDateCreated(java.util.Date value) {
		this.dateCreated = value;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public void setDateUpdated(java.util.Date value) {
		this.dateUpdated = value;
	}
	
	public java.util.Date getDateUpdated() {
		return dateUpdated;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPasswordChangeRequest(String value) {
		this.passwordChangeRequest = value;
	}
	
	public String getPasswordChangeRequest() {
		return passwordChangeRequest;
	}
	
	public void setEmailAdress(String value) {
		this.emailAdress = value;
	}
	
	public String getEmailAdress() {
		return emailAdress;
	}
	
	public void setReciveEmail(String value) {
		this.reciveEmail = value;
	}
	
	public String getReciveEmail() {
		return reciveEmail;
	}
	
	public void setCustomerAdress(java.util.Set value) {
		this.customerAdress = value;
	}
	
	public java.util.Set getCustomerAdress() {
		return customerAdress;
	}
	
	
	public void setCustomerRole(java.util.Set value) {
		this.customerRole = value;
	}
	
	public java.util.Set getCustomerRole() {
		return customerRole;
	}
	
	
	public String toString() {
		return String.valueOf(getCustomerId());
	}
	
}
