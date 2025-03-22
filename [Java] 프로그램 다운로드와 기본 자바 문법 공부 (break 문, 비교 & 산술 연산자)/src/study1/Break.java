package study1;

public class Break{
	
	public static void main(String[] args) {
//		변수에 값을 저장
		
		int sum = 0;
		int i = 0;
		
//	while 문에 true 지정하여 계속 while 문이 동작하도록 설정
//  sum : 100이 넘으면 if 문 조건 만족 후 break 문으로 빠져 나갑니	다.
		
		while (true) {
			if(sum > 100)
				break;
			++i;
			sum +=i;
		}
		
//	 i & sum 각각 출력 합니다.
		
		System.out.println("i="+i);
		System.out.println("sum=" + sum);
	}
}
