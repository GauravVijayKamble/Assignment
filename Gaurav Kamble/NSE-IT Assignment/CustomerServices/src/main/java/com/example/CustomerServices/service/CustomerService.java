package com.example.CustomerServices.service;


import java.util.List;

import javax.xml.stream.events.Comment;

import com.example.CustomerServices.model.Customer;

public interface CustomerService {
	
	 public String insertCustomer(Customer customer);
	 public List<Customer> displayAllPosts();
	 public String deletePost(int postId);
	 public List<Customer> searchPostsBycname(String cname);
	public List<Customer> searchPostsBycaddress(String caddress);
	
	public List<Comment> searchCommentsBycid(int cid);
	String deleteCustomer(int CustomerId);
	List<Customer> displayAllCustomer();
	List<Customer> searchPostsByName(String name);
	List<Customer> searchCustomerBycaddress(String caddress);
	List<Customer> searchCustomerByAddress(String caddress);
	List<Customer> searchCustomerByName(String name);
	public List<Customer> findByName(Object cname);
	public List<Customer> findByID(Object cid);
	public List<Customer> findByAddress(Object caddress);
	

}
