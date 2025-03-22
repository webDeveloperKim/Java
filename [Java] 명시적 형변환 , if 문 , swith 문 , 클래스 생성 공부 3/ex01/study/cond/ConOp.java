package cond;

public class ConOp {

	public static void main(String[] args) {
//		삼항연산자 (조건식) ? 참표현식 : 거짓표현식;
		
//		18세 이상이면 status에 "성인" 담고 , 아니면 "미성년"
//		if 문과 삼항 연산자 두 방법 모두 사용
		
		int age = 18;
		String status = "";
		
//		if 문 사용
		if(age <= 18) {
			status = "미성년";
		}else {
			status = "성인";
		}
		System.out.println("status = " + status);
		
//		삼항연산자 사용
		status = (age<=18) ? "미성년" : "성인";
		System.out.println("age = " + age + " " + "status = " + status);
	}
}

