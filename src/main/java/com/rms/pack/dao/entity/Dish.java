package com.rms.pack.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "rms_dish")
public class Dish {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dish_id")
	private int id;
	
	@Column(name = "dish_name")
	@NotNull
	private String dishName;
	
	@Column(name = "dish_type")
	private boolean isVeg = true;
	
	@Column(name = "prep_time")
	private double prepTime = 0;
	
	@Column(name = "desc")
	private String description = "";
	
	@Column(name = "price")
	private double price = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public boolean isVeg() {
		return isVeg;
	}

	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	public double getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(double prepTime) {
		this.prepTime = prepTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Dish() {
		// TODO Auto-generated constructor stub
	}

}
