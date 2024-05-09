package com.rs.retailsmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rs.retailsmart.entity.Sales;
@Repository
public interface SalesRepository extends JpaRepository<Sales, Integer>{

}
