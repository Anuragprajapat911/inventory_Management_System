package InventroySystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Enventory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int productid;
	private String productname;
	private int productno;
	private int productQun;
	public int getProductQun() {
		return productQun;
	}
	public void setProductQun(int productQun) {
		this.productQun = productQun;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductno() {
		return productno;
	}
	public void setProductno(int productno) {
		this.productno = productno;
	}
	
	

}
