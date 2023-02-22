package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.dto.UserDTO;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

//	@RequestMapping(name="/creat-user", method=RequestMethod.POST)
	@PostMapping("/creat-user")
	public String creatuser(@RequestBody UserDTO userDTO) {
		userService.save(userDTO);
		return "user saved sucssesfully";
		
		

	}

	@GetMapping("/get-user")
	public UserDTO getuser() {
		System.out.println("service Invoked.....");

		return userService.getuser();

	}
	@GetMapping("/get-user/{id}")
	public UserDTO getuser(@PathVariable String id) {
		System.out.println("service Invoked a non dynamic data.....");

		return userService.getuser(id);

	}
	
	@GetMapping("/get-user/")
	public UserDTO getuserReqparam(@RequestParam (name="id", required=false) String id) {
		System.out.println("service Invoked a non dynamic data..... "+id);

		return userService.getuser(id);

	}

	@PutMapping("/update-user")
	public void updateuser() {

	}

	@DeleteMapping("/delete-user")
	public void deleteuser() {
		
		
		userService.deleteUser();

	}

}
