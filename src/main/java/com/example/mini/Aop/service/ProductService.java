package com.example.mini.Aop.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mini.Aop.model.Product;
import com.example.mini.Aop.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	@PostConstruct
	public void initDB() {
		repository.saveAll(Stream.of(new Product(101,"sam", 1000.0),new Product(102,"tom", 2000.0)).collect(Collectors.toList()));
	}

	public List<Product> addProduct(List<Product> products) {
		return repository.saveAll(products);
	}

	public List<Product> findAllProducts() {
		return repository.findAll();
	}

}
