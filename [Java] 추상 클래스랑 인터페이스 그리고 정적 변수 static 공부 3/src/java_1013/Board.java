package java_1013;

public class Board {

	// 게시글 번호 blogNo
	// 글작성자 writer
	// 글 내용 content
	
	// 매개변수 있는 생성자
	private int blogNo;
	private String writer;
	private String content;
	//Board 타입의 정적(private static) 인스턴스 변수를 정의하는 선언
	private static Board instance; 
	
	
//	싱글 턴 방식 
//	싱글턴 패턴은 클래스가 단 하나의 인스턴스만 생성 되도록 보장하고, 그 인스턴스를 전역적으로 접근할 수 있도록 함
//	주로 전역 상태를 관리하거나 리소스를 효율적으로 공유할 필요가 있을 때 사용
	public static Board getInstance() {
		// null 아닐떄만 객체 반환하는 유효성 검증
		if(instance == null) {
//			instance가 null일 때만 새 Board 객체가 생성되어 instance에 할당
//			이 코드는 클래스의 인스턴스가 한 번만 생성되도록 보장 
//			이후 getInstance() 메서드 호출 시에는 이미 생성된 인스턴스를 반환
			instance = new Board();
		}
		return instance;
	}
	
	public Board() {}
	
	public Board(int blogNo,String writer,String content) {
		this.blogNo = blogNo;
		this.writer = writer;
		this.content = content;
	}
	
	public void setBlogNo(int blogNo) {
		this.blogNo = blogNo;
	}
	public int getBlogNo() {
		return blogNo;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	// 객체 생성 시점에 위에 필드 한번에 초기화 해주는거
	//	getter / setter 매서드
	
	
	public String toString(int blogNo, String writer, String content) {
		// TODO Auto-generated method stub
		return "글번호는" + blogNo + " 작성자 " + writer + "내용 " + content;
	}
}
