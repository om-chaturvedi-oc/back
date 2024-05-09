package com.rs.retailsmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rs.retailsmart.dto.ResponseStructure;
import com.rs.retailsmart.entity.Sales;
import com.rs.retailsmart.repository.SalesRepository;
@Service
public class SalesService {
	
	@Autowired
	SalesRepository salesRepository;
	 
	public ResponseEntity<ResponseStructure<Sales>> saveSales(Sales sales) {
		try {
		Sales saveSales=salesRepository.save(sales);
		ResponseStructure<Sales> responseStructure=new ResponseStructure<Sales>();
		responseStructure.setStatus_code(HttpStatus.CREATED.value());
		responseStructure.setMessage("sales register sucessfully");
		responseStructure.setData(saveSales);
		return new ResponseEntity<ResponseStructure<Sales>>(responseStructure,HttpStatus.CREATED);
		}
		catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
