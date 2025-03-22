package operator.ex;

public class OperatorEx1 {

	public static void main(String[] args) {
//		문제1
//		num1, num2, num3 세 개의 int 타입 변수를 선언하고 , 각각 10, 21, 36 으로 초기화
//		세 변수의 합을 계산하고 그 결과를 sum 이라는 이름의 변수에 저장
//		세 변수의 평균을 계산하고 그 결과를 average 라는 이름의 변수에 저장
//		최종 sum 변수의 값과 average 변수의 값을 출력 하세요. 
//		이때 소수점 이하의 결과는 버림 하세요.  

		int num1 = 10;
		int num2 = 21;
		int num3 = 36;
		
		int sum = 0;
		
		double average = 0;
		
		sum = num1 + num2 + num3;
		System.out.println("sum = " + sum);
		
		average = (double)sum / 3;
		System.out.println((int)average);
		
		
		
	}

}
