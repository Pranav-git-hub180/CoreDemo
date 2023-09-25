package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.serviceimpl.ProductServiceImpl;


public class Test {
	public static void main(String[] args) {
		addBtn();
		 getAll();
		 deleteBtn();
		 //-------show all product after deleted------
		 getAll();
		
	}
	// add product
	static void addBtn()  {
		
		ProductService ps=new ProductServiceImpl();
		Scanner sc=new Scanner(System.in);
		char flag='y';
		
		do {
			
		
		Product p=new Product();
		System.out.println("enter id");
		p.setId(sc.nextInt());
		System.out.println("enter name");
		p.setName(sc.next());
		System.out.println("enter category");
		p.setCategory(sc.next());
		System.out.println("enter price");
		p.setPrice(sc.nextInt());
		System.out.println("enter company");
		p.setCompany(sc.next());
		
		ps.addProduct(p);
		System.out.println("Do you want to add more product[y/n]");
		flag=sc.next().charAt(0);// read character from console
		
		}while(flag=='y');
	}
	
//--------------get all products-----------
	static void getAll() {
		ProductService ps=new ProductServiceImpl();
		
		List<Product> plist=ps.getAllProducts();
		System.out.println(plist);
	}
	//----------------delete product-------------
	static void deleteBtn() {
		ProductService ps=new ProductServiceImpl();
		ps.deleteProduct(0);
	}

}
