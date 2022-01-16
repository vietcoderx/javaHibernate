package com.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	
	@Column(name = "address_name")
	private String addressName;
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL) //Tham chieu cac truong adress trong class student va tao moi quan he giua adress va student la bi- drectional :2 chiue
	
	private Student student;
	
	public Address() {
		super();
	}


	public Address(String addressName) {
		super();
		this.addressName = addressName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAddressName() {
		return addressName;
	}


	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	

	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", addressName=" + addressName + "]";
	}
	
	
	
	
}
