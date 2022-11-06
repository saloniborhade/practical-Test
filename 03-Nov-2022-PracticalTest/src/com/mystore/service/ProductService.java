package com.mystore.service;
import com.mystore.dao.ProductDAO;
import com.mystore.modelpackage.Product;

public class ProductService {
	ProductDAO productDAO = new ProductDAO();
	
	public void addProductService(Product product)
	{
		productDAO.addProduct(product);
	}
	
	public Product[] getProductByNameStartWithService(String s)
	{
		Product[] pr = productDAO.getProductByNameStartWith(s);
		return pr;
	}
	
	public Product[] getAllProduct()
	{
		Product[] p = productDAO.getAllProduct();
		 return p;
	}
}


