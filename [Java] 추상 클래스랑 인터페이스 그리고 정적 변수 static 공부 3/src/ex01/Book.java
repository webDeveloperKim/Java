package ex01;

public class Book {
	String title;
	String author;
	int page;
	
//	기본 생성자
	public Book() {};
//	매개 변수가 있는 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
//	매개 변수 추가하면 같은 이름으로 메서드 오버로딩 가능  
	public Book(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	public void displayInfo() {
		System.out.println(" 제목 : " + this.title + " 작가 : " + this.author + " 페이지 : " + this.page);
	}
}