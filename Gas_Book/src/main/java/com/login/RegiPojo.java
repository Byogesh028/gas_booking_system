package com.login;

public class RegiPojo {
	
	private String name;
	private String email;
	private String phone;
	private String pwd;
	
	public RegiPojo()
	{
		
	}

	public RegiPojo(String name, String email, String phone, String pwd) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
}
