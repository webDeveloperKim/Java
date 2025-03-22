package a_variable;

public class Var1 {

	public static void main(String[] args) {

//		변수 사용 목적
//		값 저장 & 코드 중복 제거
		
		System.out.println("10");
		System.out.println("10");
		System.out.println("10");
		System.out.println("10");
		
		System.out.println("-----------");
		
//		지역변수는 반드시 초기값을 넣어주어야 합니다.
		
		int a = 12;
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		
		final String USER_ID = "user1";
		System.out.println(USER_ID);
		
//		USER_ID = "1234"; // 위에서 USER_ID를 final String 으로 선언해서 해당 변수는 다른 값 대입이 불가능 합니다.
		
	}

}
