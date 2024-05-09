package com.rs.retailsmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rs.retailsmart.entity.Vendor;

@Repository

public interface VendorRepository extends JpaRepository<Vendor, Integer>{

}