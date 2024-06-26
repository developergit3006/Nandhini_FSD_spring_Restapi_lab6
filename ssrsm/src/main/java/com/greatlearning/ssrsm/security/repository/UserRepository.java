package com.greatlearning.ssrsm.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatlearning.ssrsm.security.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

	@Query("SELECT u FROM Users u WHERE u.username = ?1")
	public Users getUserByUsername(String username);

}
