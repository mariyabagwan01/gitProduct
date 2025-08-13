package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	 ProductService productservice;

	@PostMapping("save")
	public String saveProduct(@RequestBody Product product) {

		productservice.addProduct(product);
		return "product saved";
	}

	@GetMapping("get/{productId}")
	public Product getproduct(@PathVariable int productId) {
		return productservice.getproduct(productId);
	}

	@DeleteMapping("delete/{productId}")
	public String deleteproduct(@PathVariable int productId) {
		productservice.deleteproduct(productId);
		return "deleted";

	}
}
