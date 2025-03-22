package cond;

public class Switch2 {

	public static void main(String[] args) {

//		switch 문 (break 문과 세트로 사용하는 게 좋음)
		
//		int grade 변수 선언 후 값 할당
//		int grade 1이면 coupon 1000	
//		int grade 2이면 coupon 2000	
//		int grade 3이면 coupon 3000	
//		그 밖의 경우 coupon 500
		
		int grade = 2;
		int coupon = 0;
		
		switch (grade) {
		case 1: 
			coupon = 1000;
			break;
		case 2: 
			coupon = 2000;
			break;
		case 3: 
			coupon = 3000;
			break;
		default:
			coupon = 500;
		}
		
		System.out.println("발급받은 쿠폰 : " + coupon);
	}	
	
}

	
	
