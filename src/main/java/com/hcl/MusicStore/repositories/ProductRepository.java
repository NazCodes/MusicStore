package com.hcl.MusicStore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hcl.MusicStore.entity.ProductsEntity;

public interface ProductRepository extends CrudRepository<ProductsEntity, Long> {
	
}
