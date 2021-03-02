package com.hcl.MusicStore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.MusicStore.entity.CartEntity;
import com.hcl.MusicStore.repositories.CartRepository;
@Service
public class CartService {
	@Autowired
	CartRepository cartRepo;;
	
	public Iterable<CartEntity> GetAllProducts() {
		return cartRepo.findAll();
	}
}
