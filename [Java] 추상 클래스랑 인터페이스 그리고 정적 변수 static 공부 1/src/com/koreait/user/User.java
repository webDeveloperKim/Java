package com.koreait.user;

public class User {
	int age = 0;
	String username = "";
	
	public User(String username , int age) {
		this.username = username;
		this.age = age;
	}
	
	public void FindUserName() {
		System.out.println(" 사용자 이름은 " + username + " 입니다. ");
	}
	public void FindUserAge() {
		System.out.println(" 사용자 나이는 " + age + " 입니다. ");
	}
	
}
