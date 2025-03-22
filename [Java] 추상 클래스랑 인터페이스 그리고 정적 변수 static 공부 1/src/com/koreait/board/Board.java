package com.koreait.board;

public class Board {
	String title;
	int page;


	public Board(String title , int page) {
		this.title = title;
		this.page = page;
	}
	
	public void titleName() {
		System.out.println(title);
	}
	public void pageNumber() {
		System.out.println(page);
	}
	
}
