package com.mystore.dao;
import com.mystore.modelpackage.Product;

public class ProductDAO {
	
	Product productArr[]=new Product[3];
	Product productArr1[]=new Product[3];
	int j = 0;
	
	public void addProduct(Product product)
	{
		for(int i = 0; i < productArr.length;i++) 
		{
			if(productArr[i] == null)
			{
				productArr[i] = product;
				break;
			}
		}
	}
	
	public Product[] getProductByNameStartWith(String s) throws NullPointerException
	{
		for(int i = 0; i < productArr.length;i++)
		{
			if(productArr[i].getProductName().startsWith(s))
			{
				productArr1[j] = productArr[i];
				j++;
			}
		}
		return productArr1;
	}
	
	public Product[] getAllProduct()
	{
		return productArr;
	}
}


    
