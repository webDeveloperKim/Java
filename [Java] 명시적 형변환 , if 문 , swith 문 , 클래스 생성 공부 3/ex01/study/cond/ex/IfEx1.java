package cond.ex;

public class IfEx1 {

	public static void main(String[] args) {
//	문제1
//		연령에 따라 다른 메세지 출력 프로그램 작성 (if 문 사용)
//		int age 라는 변수를 사용해서 연령에 따라 다음의 출력을 하세요
		
//		7세 이하인 경우 : "미취학"
//		8세 이상 13세 이하인 경우 : "초등학생"
//		14세 이상 16세 이하인 경우 : "중학생"
//		17세 이상 19세 이하인 경우 : "고등학생"
//		20세 이상인 경우 : "성인"
		
		int age = 10;
		
		if (age <= 7) {
			System.out.println("미취학");
		}else if(8 <= age && 13 >= age ){
			System.out.println("초등학생");
		}else if (14 <= age && 16 >= age ) {
			System.out.println("중학생");
		}else if (17 <= age && 19 >= age ) {
			System.out.println("고등학생");
		}else if (20 <= age) {
			System.out.println("성인");
		}
	}

}
