package com.hcl.MusicStore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.MusicStore.entity.ProductsEntity;
import com.hcl.MusicStore.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepo;
	
	public Iterable<ProductsEntity> GetAllProducts() {
		return productRepo.findAll();
	}
}
