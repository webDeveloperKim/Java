package cond;

public class If1 {

	public static void main(String[] args) {

//		if문 사용 예시
		int age = 20; // 사용자 나이 설정
		
// 		if문의 초기 조건이 거짓인 경우 다음 else 문 아래 코드 수행  
		if(age <= 18) { 
			System.out.println("미성년 입니다");
		}else {
			System.out.println("성인 입니다");
		}	
		
//		if문은 특정조건이 참인지 확인하고
//		조건이 참인 경우에만 코드 블럭을 실행한다
//		코드블럭 : {  }
		
		if(true) {
			System.out.println("조건문 탔음");
		}
		
	}

}
