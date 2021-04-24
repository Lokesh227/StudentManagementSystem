package com.loki.model;

public class Admin {
   private String name;
   private String password;
	
   public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [name=" + name + ", password=" + password + "]";
	}
	   
}
