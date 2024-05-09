package com.rs.retailsmart.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rs.retailsmart.dto.ResponseStructure;
import com.rs.retailsmart.entity.Items;
import com.rs.retailsmart.entity.Vendor;
import com.rs.retailsmart.repository.ItemsRepository;
import com.rs.retailsmart.repository.VendorRepository;


@Service
public class ItemsService {

	@Autowired
	ItemsRepository itemsRepository;
	 
	public ResponseEntity<ResponseStructure<Items>> saveItem(Items items) {
		try {
		 items=itemsRepository.save(items);
		ResponseStructure<Items> responseStructure=new ResponseStructure<Items>();
		responseStructure.setStatus_code(HttpStatus.CREATED.value());
		responseStructure.setMessage("vendor register sucessfully");
		responseStructure.setData(items);
		return new ResponseEntity<ResponseStructure<Items>>(responseStructure,HttpStatus.CREATED);
		}
		catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	}