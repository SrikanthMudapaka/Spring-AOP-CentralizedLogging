package com.example.mini.Aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mini.Aop.model.Product;

public interface ProductRepository extends  JpaRepository<Product,Integer>{
	
}