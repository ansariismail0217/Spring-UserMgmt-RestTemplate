package com.usertemplate.model;

public class User {
	
	private Integer id;
	private String name;
	private Long mobNum;
	private String email;	
	private String address;
	
	public User() {
		super();
	}

	public User(String name, Long mobNum, String email, String address) {
		super();
		this.name = name;
		this.mobNum = mobNum;
		this.email = email;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobNum() {
		return mobNum;
	}

	public void setMobNum(Long mobNum) {
		this.mobNum = mobNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobNum=" + mobNum + ", email=" + email + ", address=" + address
				+ "]";
	}

}
