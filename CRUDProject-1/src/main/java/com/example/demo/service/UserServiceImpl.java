package com.example.demo.service;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.dto.UserDTO;
import com.example.demo.repository.UserRepository;
import com.example.demo.users.Users;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDTO getuser() {
		
		
		String userid="A";
		Users users = userRepository.findById(userid).get();
		
		UserDTO userDTO = new UserDTO(userid, userid, 0, userid);
		BeanUtils.copyProperties(users, userDTO);
		
		return userDTO;
	}

	@Override
	public UserDTO getuser(String id) {
        Users users = userRepository.findById(id).get();
		
		UserDTO userDTO = new UserDTO(id, id, 0, id);
		BeanUtils.copyProperties(users, userDTO);
		
		return userDTO;
	}

	@Override
	public void save(UserDTO userDTO) {
		 Users user = new Users();
		 BeanUtils.copyProperties(userDTO, user);
		Users saveuserdata = userRepository.save(user);
		
		System.out.println("data saved "+saveuserdata);
		
		
	}

	@Override
	public String deleteUser() {
		String id = "venky";
		System.out.println("deleted sucssesfully..... "+id);
		
		userRepository.deleteById(id);
		
		return"Deletd sucssesfully";
		
	}

}
