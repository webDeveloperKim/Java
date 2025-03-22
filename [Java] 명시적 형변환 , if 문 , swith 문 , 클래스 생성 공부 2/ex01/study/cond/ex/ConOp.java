package cond.ex;

public class ConOp {

	public static void main(String[] args) {

//		문제1
//		더 큰 숫자 찾기 ( 삼항 연산자 사용 )
//		정수 a 값은 10이고, 정수 b 값은 20이다
//		삼항연산자를 사용해서 두 숫자 중에 더 큰 숫자를 출력하는 코드 작성
			
		int a = 10;
		int b = 20;
		int Max =(a>b)? a:b;
		System.out.printf("%d 와 %d 중 큰 수는 %d\n 입니다. ",a,b,Max);
		
	}
	
}
