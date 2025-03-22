package a_variable;

public class Var3 {

	public static void main(String[] args) {

//		데이터 타입 ( = 자료형 )
		
//		정수 (int , long)
		int a = 100; //거의 모든 숫자 데이터에 사용함 ( 표현범위 20억 넘어가지 않는 이상 int 사용)
		long b = 1111111111111111111l; //20억이 넘어가면 long 타입을 사용 (단 숫자 끝에 l을 넣어줘야함)
		
//		실수 (double)
		double c = 10.5; //대부분의 소숫점 데이터 다룰때 사용 (정밀도 높음) / 정수를 담으면 밑에 숫자에 .0 이 찍힘
		
//		논리형 (boolean)
		boolean d = true; // 불린 , 불리언 
//		( 조건문에서 자주 쓰임 )
		
//		문자열 (String , char)
		String e = "hello"; // 문자열을 담을 때 사용하는 String 타입 
		String f = "h";  // 문자 한개를 담을 때도 String 타입 사용 가
		char g = 'd'; // 문자 한개를 담을 때 사용하는 char 타입 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}

}
