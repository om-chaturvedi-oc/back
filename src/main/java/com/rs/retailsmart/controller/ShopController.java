package com.rs.retailsmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rs.retailsmart.dto.ResponseStructure;
import com.rs.retailsmart.entity.Items;
import com.rs.retailsmart.entity.Shop;
import com.rs.retailsmart.entity.Stock;
import com.rs.retailsmart.entity.Vendor;
import com.rs.retailsmart.service.ItemsService;
import com.rs.retailsmart.service.ShopService;
import com.rs.retailsmart.service.StockService;
@RestController
@RequestMapping("/retailsmart")
public class ShopController {
	
	
		@Autowired
		ShopService shopService;
		@Autowired
		StockService stockService;
		@Autowired
		ItemsService itemsService;
	 
		@PostMapping("/shop")
		public ResponseEntity<ResponseStructure<Shop>> saveShop(@RequestBody Shop shop) {
			return shopService.saveShop(shop);
		}
		
		@PostMapping("/stock")
		public ResponseEntity<ResponseStructure<Stock>> addStock(@RequestBody Stock stock) {
			return stockService.saveStock(stock);
		}
		
		@PostMapping("/items")
		public ResponseEntity<ResponseStructure<Items>> createVendor(@RequestBody Items items) {
			return itemsService.saveItem(items);
		}
}

