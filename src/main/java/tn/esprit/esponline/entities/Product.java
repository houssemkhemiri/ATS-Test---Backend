package tn.esprit.esponline.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Product implements Serializable {
	

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id_product;
	
	private String name ;
	private int price ;
	
	
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
