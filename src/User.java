package com.jenkins.user;

public class User {

	public static void main(String[] args) {
		int uid = 101;
		int phone = 123456;
		String name ="Nikhil";
		UserCred cred= new UserCred(uid, phone, name);
		cred.msg();

	}

}

