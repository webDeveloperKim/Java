package exceptionHandling;

public class ExceptionHandlingMain {
	public static void main(String[] args) {
		ExceptionHandlingEx2 ex2 = new ExceptionHandlingEx2();
		
		try {
//			오류가 나올수 있는 코드는 try 안에
			int result = ex2.divide(10, 0);
			System.out.println(result);
//			그 오류가 뭔지를 확인
		// try 블록에서 실행된 코드 중에서 예외가 발생할 경우, 
		// 해당 예외 객체가 **e**라는 변수로 전달됩니다.
		} catch (Exception e) {
//			발생한 예외의 **스택 트레이스(stack trace)**를 출력
//			스택 트레이스는 예외가 발생한 위치와 호출된 메서드의 순서를 보여줌
			e.printStackTrace();
			//e.getMessage();
		}finally {
			System.out.println("무조건 실행");
		}
		
	}
	
}
