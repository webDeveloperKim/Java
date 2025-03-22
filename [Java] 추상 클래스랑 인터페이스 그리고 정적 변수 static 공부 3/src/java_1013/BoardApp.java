package java_1013;

public class BoardApp {

	public static void main(String[] args) {
	//	Board board = new Board(1,"작성자1","글내용1");
	//System.out.println(board.getBno());
	//System.out.println(board.getWriter());
	//System.out.println(board.getContent());
		
//	Board board2 = new Board();
	//System.out.println(board2.getBno());
	//System.out.println(board2.getContent());
	//System.out.println(board2.getWriter());
	
//	board2.setBno(1);
//	board2.setContent("d");
//	board2.setWriter("dd");
	
	
	
//	System.out.println(board2.getBno());
//	System.out.println(board2.getContent());
//	System.out.println(board2.getWriter());
	
	Board board = Board.getInstance();
	Board board2 = Board.getInstance();
	
	board.setBlogNo(1);
	board.setContent("d");
	board.setWriter("dd");
	
	System.out.println(board.getBlogNo());
	System.out.println(board.getContent());
	System.out.println(board.getWriter());
	
	//객체 동일성 비교 객체가 똑같은지 동일성
	//객체 동일성 비교
	System.out.println(board == board2);
	System.out.println(board);
	System.out.println(board2);
	
	//.equals 문자열 자체가 같은지는 동등성
	//문자열 동등성 비교 (.equals)
	//String 앞의 대문자 클래스타입
	//str1 , str2는 다른 객체 주소값 다름
	//str1 , str2 동등성은 같음
	//문자열 동등성 비교1
	String str1 = "123";
	String str2 = "123";
	
	System.out.println(board2.toString(12, "ddrrrd","dfafas"));
	
	}
}
