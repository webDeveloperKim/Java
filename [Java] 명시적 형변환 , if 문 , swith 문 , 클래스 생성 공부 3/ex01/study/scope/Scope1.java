package scope;

public class Scope1 {

	public static void main(String[] args) {
//		지역 변수 : 본인의 지역 ( 코드 블럭{} 안에서만 쓸 수 있는 변수 )
//		지역 변수는 변수를 선언한 시점부터 코드 블럭이 끝날 때까지 사용 가능한 변수
//		스코프 : 변수의 접근 가능 범위

// 		m 스코프 시작
		int m = 10; 
		
		if(true) {
//			x 스코프 시작 
			int x = 20;
			System.out.println("m = " + m);
			System.out.println("x = " + x);
		}
		
//		m 변수는 main 메서드 코드 블럭 안에서 사용 가능 하므로 if 문 밖에서도 사용 가능 
//		x 변수는 if 문 코드 블럭 안에서 선언된 변수로 해당 if 문 코드 블럭 안에서만 사용 가능   
		System.out.println("m = " + m);
//		System.out.println("x = " + x); // x 변수 오류 발생 
		
	}

}
