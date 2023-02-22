package com.example.demo.controller.dto;

public class UserDTO {

	private String userName;

	private String password;

	private int id;

	private String dep;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	  public String getPassword() {
		  return password; 
	}
	  
	  
	  public void setPassword(String password) { 
		  this.password = password; 
	}
	 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public UserDTO(String userName, String password, int id, String dep) {
		super();
		this.userName = userName;
		this.password = password;
		this.id = id;
		this.dep = dep;
	}

}
