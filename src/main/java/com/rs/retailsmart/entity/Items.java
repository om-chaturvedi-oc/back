package com.rs.retailsmart.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "items")
@Component

public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	private String product_name;
	private double price;
	private String category;

}
