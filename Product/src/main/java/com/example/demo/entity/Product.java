package com.example.demo.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Product {
	
	
	@Id
	private int productId;
	private String productName;
	private int productYear;
	private String productBarcode;
	private String department;
	private String agfsfsa;
	
	
	public String getAgfsfsa() {
		return agfsfsa;
	}
	public void setAgfsfsa(String agfsfsa) {
		this.agfsfsa = agfsfsa;
	}
	public int getProductId() {
		return productId;
	}
//	public String getAdress() {
//		return adress;
//	}
//	public void setAdress(String adress) {
//		this.adress = adress;
//	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductYear() {
		return productYear;
	}
	public void setProductYear(int productYear) {
		this.productYear = productYear;
	}
	public String getProductBarcode() {
		return productBarcode;
	}
	public void setProductBarcode(String productBarcode) {
		this.productBarcode = productBarcode;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
	
	


