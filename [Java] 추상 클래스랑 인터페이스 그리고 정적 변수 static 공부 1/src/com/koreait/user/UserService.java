package com.koreait.user;

public class UserService {
	
	public static void main(String[] args) {
		User user = new User("유저1" , 20);
		
		user.FindUserName();
		user.FindUserAge();
		
	}
}
