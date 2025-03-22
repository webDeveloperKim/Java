package cond.ex;

public class SwitchEx2 {

	public static void main(String[] args) {

//		문제1
//		점수에 따라서 아래와 같이 등급을 출력 ( switch 문 사용 )
		
//		90점 : a
//		80점 : b
//		70점 : c
//		60점 : d
		
		int score = 60;
		String grade = "";
		
		grade = switch (score) {
			case 90 -> "a";
			case 80 -> "b";
			case 70 -> "c";
			default -> "d";
		};
		
		System.out.println("성적 등급은 " + grade + " 입니다. ");
	
	
	}
				
}


