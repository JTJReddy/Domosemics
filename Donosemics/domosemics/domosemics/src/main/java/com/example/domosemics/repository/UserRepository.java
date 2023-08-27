package com.example.domosemics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domosemics.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
