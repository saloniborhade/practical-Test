package com.mystore.modelpackage;

public class Product {
	int productId;
	String productName;
	double productPrice;
    public Product(){
	
    }
    public Product(int pdId, String pdName, double pdPrice ){
	productId=pdId;
	productName=pdName;
	productPrice=pdPrice;
    }
    public Product(int pdId){
    	productId=pdId;
    	
    }
    public Product(String pdName){
    	productName=pdName;
    }
    public Product(double pdPrice){
    	productPrice=pdPrice;
    } 	
    public void  setProductId(int pdId) {
	   productId=pdId;
	      
   }
    public void  setProductPrice(double pdPrice) {
 	   productPrice=pdPrice;
 	    
    }
    public void setProductName(String pdName) {
	   productName=pdName;
	     
   }
    public int getProductId() {
 	   return productId;
    }
    public String getProductName() {
 	   return productName;
 	   
    }
     public double getProductPrice() {
 	   return productPrice;
     }
}  
	


	
