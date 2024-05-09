package com.rs.retailsmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rs.retailsmart.dto.ResponseStructure;
import com.rs.retailsmart.entity.Vendor;
import com.rs.retailsmart.exception.UserException;
import com.rs.retailsmart.repository.VendorRepository;

@Service
public class VendorServices {
	@Autowired
	VendorRepository vendorRepository;
	
	public ResponseEntity<ResponseStructure<Vendor>> saveVendor(Vendor vendor) {
		try {
		Vendor saveVendor=vendorRepository.save(vendor);
		ResponseStructure<Vendor> responseStructure=new ResponseStructure<Vendor>();
		responseStructure.setStatus_code(HttpStatus.CREATED.value());
		responseStructure.setMessage("Vendor register sucessfully");
		responseStructure.setData(saveVendor);
		return new ResponseEntity<ResponseStructure<Vendor>>(responseStructure,HttpStatus.CREATED);
		}
		catch (Exception e) {
			throw new UserException(e.getMessage());
		}
	}
	

	

}
