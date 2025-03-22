package cond.ex;

public class SwitchEx {

	public static void main(String[] args) {

//		문제1
//		점수에 따라서 아래와 같이 등급을 출력 (switch 문 사용)
		
//		90점 : a
//		80점 : b
//		70점 : c
//		60점 : d
		
		int score = 60;
		String grade = ""; // String 타입의 grade 변수 값 초기화 
		
		switch (score) {
		case 90: 
			grade = "a";
			break;
		case 80: 
			grade = "b";
			break;
		case 70: 
			grade = "c";
			break;		
		case 60: 
			grade = "d";
			break;
		} 
		
		System.out.println("성적 등급은 " + grade + " 입니다. ");
	}
				
}


