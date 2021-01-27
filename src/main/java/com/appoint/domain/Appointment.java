package com.appoint.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private String dob;
	private String bloodGroup;
	private String mobile;
	private String email;
	private String doa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDoa() {
		return doa;
	}
	public void setDoa(String doa) {
		this.doa = doa;
	}
	public Appointment(int id, String name, int age, String dob, String bloodGroup, String mobile, String email,
			String doa) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.bloodGroup = bloodGroup;
		this.mobile = mobile;
		this.email = email;
		this.doa = doa;
	}
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", bloodGroup="
				+ bloodGroup + ", mobile=" + mobile + ", email=" + email + ", doa=" + doa + "]";
	}
	
	
	
	
	
}
