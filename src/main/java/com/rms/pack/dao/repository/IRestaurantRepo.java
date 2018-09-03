package com.rms.pack.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rms.pack.dao.entity.Restaurant;

public interface IRestaurantRepo extends JpaRepository<Restaurant, Integer> {

	Restaurant findByRestaurantName(String name);
}
