package com.rs.retailsmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rs.retailsmart.dto.ResponseStructure;
import com.rs.retailsmart.entity.User;
import com.rs.retailsmart.service.UserService;

@RestController
@RequestMapping("/retailsmart")
public class UserController {
	@Autowired
	UserService userService;
 
	@PostMapping("/user")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	@GetMapping("/login")
	public ResponseEntity<ResponseStructure<User>> login(@RequestParam String email,@RequestParam String password) {
		return userService.login(email,password);
	}
}
