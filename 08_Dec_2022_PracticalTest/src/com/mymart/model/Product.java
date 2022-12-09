package com.mymart.model;

import java.util.Objects;

public class Product {
	private int productID;
	 private String productName;
	 private double productPrice;
	 public Product(int pid,String pdn,double pdp) {
		 this.productID=pid;
		 this.productName=pdn;
		 this.productPrice=pdp;
	 }
	public void setProductID(int pid) {
		productID=pid;
		
	}
	public void setProductName(String pdn) {
		productName=pdn;
		
	}
	public void setProductPrice(double pdp) {
		productPrice=pdp;
		
	}
	public int getProductID() {
		return productID;
		
	}
	public String getProductName() {
		return productName;
		
	}
	public double getProductPrice() {
		return productPrice;
		
	}
	//override toString method
	public String toString() {
		String text=productID+" "+productName+" "+productPrice;
		return text;
	}
	//overriding equals()
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Product other=(Product)obj;
		return false;
	}
	public int hashcode() {
		return Objects.hash(productID,productName,productPrice);
	}
}	




