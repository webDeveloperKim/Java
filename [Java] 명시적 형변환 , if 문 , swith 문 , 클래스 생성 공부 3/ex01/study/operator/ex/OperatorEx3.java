package operator.ex;

public class OperatorEx3 {

	public static void main(String[] args) {
//		문제3
//		int 형 score 를 선언
//		score 80점 이상이고 100점 이하면 true 를 출력
//		아니면 false 를 출력
		
		int score = 80; 
		boolean result = (score >= 80) && (score <= 100);
		
		System.out.println(result);
		
		if(result) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
