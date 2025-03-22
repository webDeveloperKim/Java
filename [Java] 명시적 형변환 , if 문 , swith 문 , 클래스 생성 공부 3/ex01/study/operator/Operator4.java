package operator;

public class Operator4 {

	public static void main(String[] args) {
//		증감연산자	화면 출력 예시 
		int a = 0;
		
		// 원래 가지고 있던 a = 0 을 화면 출력 후 1을 증가 시킨다.
		System.out.println(a++);
		
		// a = 1 + 1; / a = 2; 
		a = a + 1; 
		System.out.println(a);
		
		// 전에 저장된 a = 2 값에서 1을 증가 시킨 값을 화면 출력한다.
		System.out.println(++a); 
		
	}

}
