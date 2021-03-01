package com.hcl.MusicStore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.hcl.MusicStore.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
}
