package loop;

public class Break {

	public static void main(String[] args) {
		
//		break 문 & continue ( 반복문에서 사용할 수 있는 키워드 )
//		while 문, do while 문, for 문과 같은 모든 반복문에서 사용가능
		
//		break 문 : 반복문 즉시 종료 후 반복문 전체를 빠져나감
		
//		숫자 1부터 계속 누적해서 더하다가 ( while 문으로 )
//		처음으로 그 합 값이 10보다 커지는 값은 무엇인지 출력 하세요. 
//		( 1+2+3+....계속 더하다가 처음으로 10보다 큰 경우 그 값을 출력 )

		int sum = 0;
		int i = 1;
		
		while (true) {
			sum += sum + i;
			
			if(10 < sum) {
				System.out.println("i : "+ sum);
				break;
			}
		}
		
	}

}
