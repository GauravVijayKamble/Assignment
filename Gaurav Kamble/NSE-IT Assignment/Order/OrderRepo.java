package com.examples.orderservice.repo;


import java.util.List;

import javax.persistence.criteria.Order;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
@Transactional

public interface OrderRepo extends JpaRepository<Order,Integer>{
	
	
	@Query("select o from  Order where o.oid=?1")
	public List<Order> searchCommentsByOrder(int oid);
	
	@Query("select c from Customer c where c.cid=?1")
	public List<Order> searchCommentsByCustomerId(int cid);

	public List<Order> searchCommentsByproductname(String productname);

	public List<Order> searchCommentsByprice(int price);

	public List<Order> searchCommentsByOderId(int oid);

	public List<Order> searchOrderByproductname(String productname);

	public List<Order> searchOrderByCustomerId(int cid);


	

	public List<Order> searchOrderByprice(int price);

	public List<Order> searchOrderByOderId(int oid);

}
