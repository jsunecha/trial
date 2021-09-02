package com.faith.app.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VisitTable")
public class VisitTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int visitId;
	private String customerName;
	private String contactPerson;
	private int contactNumber;
	private String interestProduct;
	private String visitSubject;
	private String desciption;
	private LocalDateTime visitDateTime;
	private boolean is_disabled;
	private boolean is_deleted;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=User.class)
	@JoinColumn(name="user_id")
	private User emp_id;

	public VisitTable() {
	}
	
	public int getVisitId() {
		return visitId;
	}
	public void setVisitId(int visitId) {
		this.visitId = visitId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getInterestProduct() {
		return interestProduct;
	}
	public void setInterestProduct(String interestProduct) {
		this.interestProduct = interestProduct;
	}
	public String getVisitSubject() {
		return visitSubject;
	}
	public void setVisitSubject(String visitSubject) {
		this.visitSubject = visitSubject;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public LocalDateTime getVisitDateTime() {
		return visitDateTime;
	}
	public void setVisitDateTime(LocalDateTime visitDateTime) {
		this.visitDateTime = visitDateTime;
	}
	public boolean isIs_disabled() {
		return is_disabled;
	}
	public void setIs_disabled(boolean is_disabled) {
		this.is_disabled = is_disabled;
	}
	public boolean isIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}
	public User getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(User emp_id) {
		this.emp_id = emp_id;
	}
	
}
