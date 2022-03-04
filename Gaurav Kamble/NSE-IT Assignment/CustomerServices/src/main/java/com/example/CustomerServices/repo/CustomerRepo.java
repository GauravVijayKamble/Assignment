package com.example.CustomerServices.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.CustomerServices.model.Customer;

@Repository
@Transactional
public interface CustomerRepo extends JpaRepository<Customer,Integer>{
	

	@Query("select c from Customer c where c.cid=?1")
	public List<Customer> searchPostsBycid(int cid);
	
	
	
	@Query("select c from Customer c where c.cname=?1")
	public List<Customer> searchPostsBycname(String cname);
	
	@Query("select c from Customer c where c.caddress=?1")
	public List<Customer> searchPostsBycaddress(String cadress);




	public List<Customer> searchCustomerByName(String name);



	public List<Customer> searchCustomerByAddress(String caddress);

}
