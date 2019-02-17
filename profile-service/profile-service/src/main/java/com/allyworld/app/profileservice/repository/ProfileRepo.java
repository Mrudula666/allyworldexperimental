package com.allyworld.app.profileservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.allyworld.app.profileservice.entity.Profile;

@Repository
public interface ProfileRepo extends MongoRepository<Profile, Object>{
	
	//Profile findProfileBylogin(String email);
	@Query("{'email': ?0, 'password': ?1}")
	Profile findProfileBylogin(String email,String password);
	
	/* List<Profile> findProfileByFullName(String name); */

}
