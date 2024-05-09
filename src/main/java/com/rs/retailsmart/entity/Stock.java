package com.rs.retailsmart.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "stock")
@Component

public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stock_id;
	private double quantity;
	@OneToOne(cascade = CascadeType.ALL)	
	private Items items;
}
