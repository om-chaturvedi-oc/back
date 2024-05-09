package com.rs.retailsmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rs.retailsmart.dto.ResponseStructure;
import com.rs.retailsmart.entity.User;
import com.rs.retailsmart.exception.UserException;
import com.rs.retailsmart.repository.UserRepostory;

@Service
public class UserService {

	@Autowired
	UserRepostory userRepostory;
	 
	public ResponseEntity<ResponseStructure<User>> saveUser(User user) {
		try {
		User saveUser=userRepostory.save(user);
		ResponseStructure<User> responseStructure=new ResponseStructure<User>();
		responseStructure.setStatus_code(HttpStatus.CREATED.value());
		responseStructure.setMessage("user register sucessfully");
		responseStructure.setData(saveUser);
		return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.CREATED);
		}
		catch (Exception e) {
			throw new UserException(e.getMessage());
		}
	}
	public ResponseEntity<ResponseStructure<User>> login(String email,String password) {
		try {
			User saveUser=userRepostory.findByEmailAndUserPassword(email, password);
			if(saveUser!=null) {
			ResponseStructure<User> responseStructure=new ResponseStructure<User>();
			responseStructure.setStatus_code(HttpStatus.OK.value());
			responseStructure.setMessage("user found");
			responseStructure.setData(saveUser);
			return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.OK);
		}
			else
				throw new UserException("invalid credentials");
			}
		catch (Exception e) {
			throw new UserException(e.getMessage());
		}
	}
}
