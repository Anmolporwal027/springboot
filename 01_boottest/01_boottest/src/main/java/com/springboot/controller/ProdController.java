package com.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Product;
import com.springboot.service.ProductService;

@RestController
public class ProdController {

	private ProductService productService;
	
	public ProdController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/")
	public String mainPage() {
		return "<h2>Main Page</h2>";
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product p){
		return ResponseEntity.ok(productService.addProduct(p));
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Product> getbyId(@PathVariable int id){
		return ResponseEntity.ok(productService.getProductById(id));
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>delete(@PathVariable int id){
		Boolean status = productService.deleteProductById(id);
		if(status) {
			return ResponseEntity.ok("Product Deleted");
		}
		return ResponseEntity.ok("Proudct not present");
	}
	
	@GetMapping("/viewAll")
	public ResponseEntity<List<Product>>getAllProudct(){
		return ResponseEntity.ok(productService.viewAllProduct());
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Product>update(@RequestBody Product p,@PathVariable int id){
		return new ResponseEntity<Product>(productService.updateProduct(id, p),HttpStatus.OK);
	}
}