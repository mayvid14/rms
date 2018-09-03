package com.rms.pack.dao.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "rms_restaurant")
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rest_id")
	private int id;
	
	@Column(name = "rest_name")
	@NotNull
	private String restaurantName;
	
	@OneToMany
	private Set<User> employees = new HashSet<>();
	
	@OneToMany
	private Set<User> managers = new HashSet<>();
	
	@ManyToMany
	private Set<Dish> dishes = new HashSet<>();

	public Set<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(Set<Dish> dishes) {
		this.dishes = dishes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public Set<User> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<User> employees) {
		this.employees = employees;
	}

	public Set<User> getManagers() {
		return managers;
	}

	public void setManagers(Set<User> managers) {
		this.managers = managers;
	}
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	
}
