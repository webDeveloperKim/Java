package java_1006;

public class Overloading {

	public static void main(String[] args) {
		// 두 정수값 받아서 더하는 add 메서드
		// 두 정수값 받아서 곱하는 multi 메서드
		// 더한 합 값과 곱한 값을 한 문장에 출력하는 메서드
		// void 타입
		
		printOut(3,5);
		
		}
		static int add(int a, int b) {
			return a + b;
		}
		static int multi(int a , int b) {
			return a * b;
		}
		static void printOut(int a, int b) {
			int sum = add(a,b);
			int sum2 = multi(a,b);
			
			System.out.println("sum : " + sum + " , sum2 : " + sum2);
			
		}
}


