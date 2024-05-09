package com.rs.retailsmart.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "vendor")
@Component

public class Vendor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private long number;
	@OneToMany
	private List<Items> items;
	

}
