package com.rms.pack.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rms.pack.dao.entity.User;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {

	User findByEmailAndPassword(String email, String pwd);
	User findByEmail(String email);
}
