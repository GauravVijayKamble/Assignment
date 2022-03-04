package com.examples.orderservice.controller;


import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.orderservice.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	 OrderService service;
	
	@GetMapping("/all")
	public List< Order> showAll(){
		return service.displayAllOder();
	}
	
	@PostMapping("/add")
	public String addComment(@RequestBody  Order  order) {
		return service.insertOrder(order);
	}
	

	@GetMapping("/Order/{oid}")
	public List<Order> searchByOrderId(@PathVariable("Id") int Order) {
			Object oid = null;
			return service.searchOrderByOrderId(oid);
	}
	
	@GetMapping("/Customer/{cid}")
	public List<Order> searchBycid(@PathVariable("cid") int cid) {
			return service.searchOrderByCustomerId(cid);
	}


	@GetMapping("/productname/{productname}")
	public List<Order> searchByproductname(@PathVariable("productname") String productname) {
			return service.searchOrderByPostId(productname);
	}

	@GetMapping("/Price/{price}")
	public List<Order> searchByprice(@PathVariable("price") int price) {
			return service.searchOrderByPrice(price);
	}


}
