package exception.basic.checked;

//클라이언트 역할을 하는 클래스 생성
public class Client {
//	MyCheckedException에 error 즉 예외를 던진다 
//	call() 메서드는 MyCheckedException 예외를 명시적으로 던지는 메서드
	public void call() throws MyCheckedException{
		throw new MyCheckedException("errrrro");
	}

}
