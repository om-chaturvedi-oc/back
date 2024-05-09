package com.rs.retailsmart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rs.retailsmart.dto.ResponseStructure;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(UserException.class)
	public ResponseEntity<ResponseStructure<String>> userException(UserException e) {
		ResponseStructure<String> responseStructure=new ResponseStructure<String>();
		responseStructure.setStatus_code(HttpStatus.INTERNAL_SERVER_ERROR.value());
		responseStructure.setMessage("error occured");
		responseStructure.setData(e.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseStructure<String>> exception(Exception e) {
		ResponseStructure<String> responseStructure=new ResponseStructure<String>();
		responseStructure.setStatus_code(HttpStatus.INTERNAL_SERVER_ERROR.value());
		responseStructure.setMessage("error occured");
		responseStructure.setData(e.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	

