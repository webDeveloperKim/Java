package loop;

public class For {

	public static void main(String[] args) {
//	for( 초기식; 조건식; 증감식 )
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}

//		for 문은 반복 횟수에 직접적인 영향을 주는 변수 선언,
//		그 변수를 조건식에서 활용, 그 변수를 증감 조건을 통해서 반복 수행

//		for 문으로 1부터 3까지 반복하면서 sum 누적 합 최종 출력 수행 코드
		int sum = 0;
		int endNum = 3;

		for(int i = 0; i <= endNum; i++) {
			sum += sum + i;
		}
		System.out.println("sum : "+sum);
		
		
//		for 문을 활용한 구구단 2단 수행 코드
		for(int num = 2, count = 1; count <= 9; num += 2, count++) {
			System.out.println(num);
		}
	}
}