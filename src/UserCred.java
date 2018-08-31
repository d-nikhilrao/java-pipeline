package com.jenkins.user;

public class UserCred {
	public int uid;
	public int phone;
	public String name;
	public UserCred(int uid, int phone, String name) {
		super();
		this.uid = uid;
		this.phone = phone;
		this.name = name;
	}
	
	public void msg()
	{
		System.out.println("Hi Welcome! Here are your credentials");
		System.out.println("UID: "+ uid);
		System.out.println("Name: "+ name);
		System.out.println("Phone: "+ phone);
	}

}

