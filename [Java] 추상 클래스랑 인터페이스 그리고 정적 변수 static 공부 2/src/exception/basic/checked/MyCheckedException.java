package exception.basic.checked;

public class MyCheckedException extends Exception {
	public MyCheckedException(String message) {
		//super는 객체 생성 안하고도 부모의 값을 접근할수 있는 특별한 키워드
//		super는 exception 을 말하는것 
		super(message);
//	super() 내 부모객체의 생성자를 호출하는것
	}
}
