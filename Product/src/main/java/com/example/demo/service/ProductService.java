package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;

	public String addProduct(Product product) {

		productRepo.save(product);

		return "saved";
	}

	public Product getproduct(int productId) {

		return productRepo.findById(productId).get();
	}

	public void deleteproduct( int productId) {
		productRepo.deleteById(productId);

	}

}