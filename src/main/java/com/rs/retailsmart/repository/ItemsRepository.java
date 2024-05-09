package com.rs.retailsmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rs.retailsmart.entity.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer>{


}