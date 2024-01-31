package com.mapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private int laptopId;
	private String brand;
	private String modelNumber;
	
	
	@OneToOne
	@JoinColumn(name ="student_id")
	private Student student;
	
	
	
	
	public Laptop(int laptopId, String brand, String modelNumber, Student student) {
		super();
		this.laptopId = laptopId;
		this.brand = brand;
		this.modelNumber = modelNumber;
		this.student = student;
	}
	
	public Laptop(){
		
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
	
	

}
