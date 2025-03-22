package cond.ex;

public class ConOp2 {

	public static void main(String[] args) {

//		문제2
//		홀수 짝수 찾기 ( 삼항연산자 사용 )
//		정수 x 가 짝수이면 "짝수" 를 홀수이면 "홀수" 를 출력하는 프로그램 작성
//		짝수 찾는 방법 ( 나머지연산자 사용 )
		
		int x = 0;
		String result = (x == 0) ? "0" : (x % 2 == 1) ? "홀수" : "짝수";
		
		System.out.println("결과는 : " + result);
		
	}

}

