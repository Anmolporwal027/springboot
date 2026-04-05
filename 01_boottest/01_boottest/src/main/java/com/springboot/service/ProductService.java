package com.springboot.service;

import java.util.List;

import com.springboot.entity.Product;

public interface ProductService {
	public Product addProduct(Product p);
	public Product getProductById(int id);
	public boolean deleteProductById(int id);
	public List<Product> viewAllProduct();
	public Product updateProduct(int id,Product p);
}
