package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.controller.dto.UserDTO;

@Service
public interface UserService {
	
	
	public UserDTO getuser();

	public UserDTO getuser(String id);

	public void save(UserDTO userDTO);

	public String deleteUser();
	
}
