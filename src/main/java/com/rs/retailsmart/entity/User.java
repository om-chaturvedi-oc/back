package com.rs.retailsmart.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user_table")
@Component
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private long number;
	private String userPassword;
	@OneToMany
	private List<Vendor> list;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Shop shop;

}
