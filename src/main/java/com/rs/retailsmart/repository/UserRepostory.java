package com.rs.retailsmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rs.retailsmart.entity.User;

public interface UserRepostory extends JpaRepository<User, Integer>{

	@Query("Select u from User u where email=?1 and userPassword=?2")
	User findByEmailAndUserPassword(String email,String password);
}
