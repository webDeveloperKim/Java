package study1;

public class ComparisonAndArithmeticOperators {

	public static void main(String[] args) {

// 변수 a, b 선언 및 값 할당
		
		int a = 10;
		int b = 5;
		
// 비교 연산자 사용하여  출력
		
		System.out.println(a==b);
		System.out.println(!(a==b));
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		
// 변수 x~e 까지 정수 값 할당 후 산술 연산자를 사용하여 값 출력 
		int x = 10;
		int y = 10;
		int c = 10;
		int d = 10;
		int e = 10;
		
		System.out.println(x += 3);
		System.out.println(y -= 3);
		System.out.println(c *= 3);
		System.out.println(d /= 3);
		System.out.println(e %= 3);
		
	}

}
