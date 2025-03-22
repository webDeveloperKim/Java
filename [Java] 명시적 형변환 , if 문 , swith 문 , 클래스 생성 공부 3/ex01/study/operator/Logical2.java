package operator;

public class Logical2 {

	public static void main(String[] args) {
//		논리연산자2
		
		int a = 15;
		
//		boolean 타입에 결과값 담기
		
//		a 는 10보다 크고 20보다 작다
		boolean result1 = (a > 10) && (a < 20);
		System.out.println(result1);
		
		// a 는 30보다 크고 45보다 작다
		boolean result2 = (a > 30) && (a < 45);
		System.out.println(result2);
		
	}

}
