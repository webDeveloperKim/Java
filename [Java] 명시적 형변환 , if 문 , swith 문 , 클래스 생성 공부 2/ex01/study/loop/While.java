package loop;

public class While {

	public static void main(String[] args) {
		
//		while 반복문 ( 조건이 false 일때 까지 무한 루프 )
//		조건이 참이면 코드 블럭 {} 반복해서 실행
		
//		직접 변수 선언 후 수동으로 1씩 증가하는 코드를 5번 수행  
		int count = 0;
		
		count = count + 1;
		count = count + 1;
		count = count + 1;
		count = count + 1;
		count = count + 1;
		System.out.println(count);		

//		count 변수 0으로 값 초기화 후 , while 문을 이용해서 최종 5를 출력 하는 코드
		count = 0;
		
		while(count < 5) {
			count += 1;
	}	
		System.out.println(count);	

		
	}
}