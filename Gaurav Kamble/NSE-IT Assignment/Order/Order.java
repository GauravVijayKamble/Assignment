package com.examples.orderservice.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {
	
	@Id
	int cid;
	
	int oid;
	
	String productname;
	
	int price;
	
	public Order() {
		
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getoid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getproductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getprice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Order(int cid, int oid, String productname, int price) {
		super();
		this.cid = cid;
		this.oid = oid;
		this.productname = productname;
		this.price = price;
	}
	

}
