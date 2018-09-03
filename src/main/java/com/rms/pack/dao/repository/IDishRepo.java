package com.rms.pack.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rms.pack.dao.entity.Dish;

public interface IDishRepo extends JpaRepository<Dish, Integer> {

	Dish findByDishName(String name);
}
