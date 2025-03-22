package exception.basic.checked;

public class Service {
	Client client = new Client();
//	예외 catch 해서 처리하는 코드
	
//	exception 이 발생했을 때 catch 하는 코드임
	public void callCatch() {
//		try 블록에서 예외가 발생하면 catch 블록이 실행
		try {
			client.call(); // 일부러 예외발생 시킨 코드
//	exception 이 있으면 error 메세지를 가져와서 보여준다
		} catch (Exception e) {
			System.out.println("예외처리 메세지" + e.getMessage());
		}
//		catch 블록에서 예외가 처리된 후, try-catch 구문을 벗어나 이 코드가 실행
//		예외가 발생했든 발생하지 않았든 관계없이 이 줄은 항상 실행
		System.out.println("정상 동작");
	}
	
//	client.call() 메서드에서 MyCheckedException 예외가 발생하면, 

//	main() 메서드에서 호출: 만약 callThrow() 메서드가 main() 메서드에서 호출되었다면, 
//	main() 메서드가 호출자
	
//	다른 메서드에서 호출: callThrow()가 다른 메서드에서 호출될 수도 있습니다. 
//	이 경우, 그 메서드가 호출자
	
//	callThrow() 메서드는 이 예외를 호출한 곳으로 전달
	public void callThrow() throws MyCheckedException{
		client.call();
	}	
}