package ex01;

public class BookMain {

	public static void main(String[] args) {
//		String 매개 변수는 값이 없으면 null 로 표시 , int 는 0 표시
		Book book1 = new Book();
		book1.displayInfo();
		
		Book book2 = new Book("Hello java1", "seo1");
		book2.displayInfo();
		
		Book book3 = new Book("Hello java2", "seo2", 700);
		book3.displayInfo();
		
		// 출력예시
		// 제목 : Hello java1, 저자 : seo1, 페이지: 0
		// 제목 : Hello java2, 저자 : seo2, 페이지: 70 0	
	}
}