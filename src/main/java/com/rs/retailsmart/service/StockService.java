package com.rs.retailsmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rs.retailsmart.dto.ResponseStructure;
import com.rs.retailsmart.entity.Stock;
import com.rs.retailsmart.repository.StockRepository;

@Service
public class StockService {
	@Autowired
	StockRepository stockRepository;
	 
	public ResponseEntity<ResponseStructure<Stock>> saveStock(Stock stock) {
		try {
		Stock saveStock=stockRepository.save(stock);
		ResponseStructure<Stock> responseStructure=new ResponseStructure<Stock>();
		responseStructure.setStatus_code(HttpStatus.CREATED.value());
		responseStructure.setMessage("stock register sucessfully");
		responseStructure.setData(saveStock);
		return new ResponseEntity<ResponseStructure<Stock>>(responseStructure,HttpStatus.CREATED);
		}
		catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
