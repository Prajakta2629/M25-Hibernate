package org.tnsindia.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

//child class

@Entity
@Table(name="Car")
public class Car extends Vehicle{
	
	
	private double price;

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}