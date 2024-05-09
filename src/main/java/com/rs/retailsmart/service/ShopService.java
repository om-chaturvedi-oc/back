package com.rs.retailsmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rs.retailsmart.dto.ResponseStructure;
import com.rs.retailsmart.entity.Shop;
import com.rs.retailsmart.exception.UserException;
import com.rs.retailsmart.repository.ShopRepository;

@Service
public class ShopService {
	@Autowired
	ShopRepository shopRepository;
	
	public ResponseEntity<ResponseStructure<Shop>> saveShop(Shop shop) {
		try {
			Shop saveShop=shopRepository.save(shop);
			ResponseStructure<Shop> responseStructure=new ResponseStructure<Shop>();
			responseStructure.setStatus_code(HttpStatus.CREATED.value());
			responseStructure.setMessage("Shop register sucessfully");
			responseStructure.setData(saveShop);
			return new ResponseEntity<ResponseStructure<Shop>>(responseStructure,HttpStatus.CREATED);
			}
			catch (Exception e) {
				throw new UserException(e.getMessage());
			}
		
	}
	

}
