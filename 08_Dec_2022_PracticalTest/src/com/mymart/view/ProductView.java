package com.mymart.view;
import java.util.LinkedList;
import com.mymart.model.Product;
import com.mymart.service.ProductService;
public class ProductView {
	private static ProductService productService=new ProductService();
	public void addProduct() {
		int pid=1;
		String pdn="Laptop";
		double pdp=65000;
		Product product=new Product(pid,pdn,pdp);
		productService.addProductService(product);
		
	}
	public void displayAllProducts() {
		LinkedList<Product>product=productService.getAllProductService();
		for(Product p:product) {
			System.out.println("Product Details");
			System.out.println("ProductID:"+p.getProductID());
			System.out.println("ProductName:"+p.getProductName());
			System.out.println("ProductPrice:"+p.getProductPrice());
			
		}
	}

}
