package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.Product;
import com.springboot.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	@Override
	public Product addProduct(Product p) {
		
		return productRepository.save(p);
	}
	
	@Override
	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}
	
	@Override
	public boolean deleteProductById(int id) {
		Product obj = productRepository.findById(id).orElse(null);
		boolean res = false;
		if(obj!=null) {
			productRepository.deleteById(id);
			res = true;
		}
		return res;
	}
	
	@Override
	public List<Product> viewAllProduct(){
		return productRepository.findAll();
	}
	
	@Override
	public Product updateProduct(int id, Product p) {
	    Product existingProduct = productRepository.findById(id).orElse(null);

	    if (existingProduct != null) {
	        existingProduct.setPname(p.getPname());
	        existingProduct.setQuantity(p.getQuantity());
	        return productRepository.save(existingProduct);
	    } else {
	        return null;
	    }
	}
}
