package com.rs.retailsmart.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "sales")
@Component

public class Sales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String purchase_name;
	private long number;
	private double quantity;
	private double total_price;
	@CreationTimestamp
	private Date date;
	@OneToOne
	private Items item;
	
	
	

}
