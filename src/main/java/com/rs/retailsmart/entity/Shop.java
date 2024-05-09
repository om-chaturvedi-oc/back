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
@Table(name = "shop")
@Component
public class Shop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shop_id;
	private String shop_name;
	private String address;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "shop")
	
	private User user;
	
}
