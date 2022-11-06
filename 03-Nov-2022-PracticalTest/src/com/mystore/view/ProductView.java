package com.mystore.view;
import com.mystore.modelpackage.Product;
import com.mystore.service.ProductService;

public class ProductView {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		ProductService ps = new ProductService();
		for(int i=0; i<3;i++)
		{
			System.out.println("Enter the Product ID: ");
			int pID = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Product Name: ");
			String pName = sc.nextLine();
			
			System.out.println("Enter the Product Price: ");
			double pPrice = sc.nextDouble();
			sc.nextLine();
			
			Product product = new Product(pID,pName,pPrice);
			ps.addProductService(product);
		}
		
		System.out.println("Enter the Product name first letter.");
		String pl = sc.nextLine();
		
		Product[] p1 = ps.getProductByNameStartWithService(pl);
		
		Product[] productAr = ps.getAllProduct();
		
		System.out.println("The Products with same First Letter are: ");
		for(int i = 0; i < p1.length;i++)
		{
			if(p1[i] != null)
				System.out.println(p1[i].getProductName());
			else
				break;
		}
	}
}

