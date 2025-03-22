package lang.wrapper;

public class WrapperUtillMain {

	public static void main(String[] args) {
		// 숫자, 래퍼 객체 반환
		Integer i1 = Integer.valueOf(10); 
		// 문자열 "10"을 Integer 객체로 변환하여 i2 변수에 할당하는 코드
		Integer i2 = Integer.valueOf("10"); 
		
		System.out.println("i1 + i2 = " + (i1 + i2));
		System.out.println(i1.getClass());
		System.out.println(i2.getClass());	
		// 문자열 전용, 기본형 반환
		int intValue = Integer.parseInt("10"); 
		 
//		기본형 타입이 클래스가 된게 래퍼 클래스
//		null 값을 허용해서 개발자가 의도적으로 사용하고 싶을 때 사용
//		제너릭 클래스 / 자료 구조 리스트 같은 자료형 안에 기본형 타입을 넣기위해
//		래퍼 클래스를 사용 
		
		// int -> Integer
		// double -> Double
		
		// 두 정수 합을 계산하고, 그 결과를 System.out.println()을 통해 출력하는 코드
		System.out.println("sum : " + Integer.sum(10, 20));
		System.out.println("min : " + Integer.min(10, 20));
		System.out.println("max : " + Integer.max(10, 20));	
	}
}