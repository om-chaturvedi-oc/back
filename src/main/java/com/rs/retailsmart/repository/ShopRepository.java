package com.rs.retailsmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rs.retailsmart.entity.Shop;
@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
