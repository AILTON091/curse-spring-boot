package com.treinaWeb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinaWeb.curse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

		
}
