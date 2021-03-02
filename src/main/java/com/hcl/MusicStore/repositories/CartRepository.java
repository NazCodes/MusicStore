package com.hcl.MusicStore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hcl.MusicStore.entity.CartEntity;

public interface CartRepository extends CrudRepository<CartEntity, Long> {

}
