package com.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;
import com.service.ProductService;

public class ProductServiceImpl implements ProductService {
	
	static List<Product> plist=new ArrayList<>();

	@Override
	public void addProduct(Product p) {
		plist.add(p);
		System.out.println("--added success---size="+plist.size());
		
		
	}

	@Override
	public void deleteProduct(int index) {
		plist.remove(index);
	
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return plist;
	}
	

}
