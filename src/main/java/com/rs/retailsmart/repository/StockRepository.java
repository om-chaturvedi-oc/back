package com.rs.retailsmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rs.retailsmart.entity.Stock;


public interface StockRepository extends JpaRepository<Stock, Integer>{

}
