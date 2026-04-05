package com.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="prodtest_boot")
public class Product {
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Product(int pid, String pname, String quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.quantity = quantity;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer pid;
	
	@Column(name="pname")
	String pname;
	
	@Column(name="quantity")
	String quantity;

	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
}
