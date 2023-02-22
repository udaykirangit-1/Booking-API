package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.users.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {

	Users findByUserName(String username);
	
}
