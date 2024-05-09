package com.rs.retailsmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rs.retailsmart.dto.ResponseStructure;
import com.rs.retailsmart.entity.Vendor;
import com.rs.retailsmart.service.VendorServices;

	@RestController
	@RequestMapping("/retailsmart")
	
	public class VendorController {
		@Autowired
		VendorServices vendorService;
	 
		
		@PostMapping("/vendor")
		public ResponseEntity<ResponseStructure<Vendor>> saveVendor(@RequestBody Vendor vendor) {
			return vendorService.saveVendor(vendor);
		}
		
	}
//		@GetMapping("/login")
//		public ResponseEntity<ResponseStructure<Vendor>> login(@RequestParam String email,@RequestParam String password) {
//			return vendorService.login(email,password);
//		}
//	
	
	