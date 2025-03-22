package operator.ex;

public class OperatorEx2 {

	public static void main(String[] args) {
//		문제2
//		다음의 double 변수를 선언하고 그 합과 평균을 출력 하세요.
//		이때 합의 결과는 소수점 이하를 버림하고 , 평균 결과는 소수점 있는 상태로 출력 하세요.
		
		double val1 = 1.5;
		double val2 = 2.5;
		double val3 = 3.5;
		
		int sum = 0;
		double average = 0;
		
//		sum = 7
		sum = (int)(val1 + val2 + val3);
		
//		average = 7/3
		average = (double)sum / 3;
		
		System.out.println("sum = " + sum);
		System.out.println("average = " + average);
		
	}

}
