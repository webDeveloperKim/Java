package operator;

public class Operator5 {

	public static void main(String[] args) {
//		전위 증감 연산자 ( 증감 연산을 수행하고 다른 연산을 수행 )
		
		int a = 1;
		int b = 0;
		
		b = ++a; // a 의 값을 먼저 1 증가 시키고, 그 결과를 b 에 대입한다. 
		
		System.out.println(b);
		
		a = 1; 
		b = 0;
		
		b = a++; //a 의 현재 값을 b 에 먼저 대입 연산 하고 그 이후에 연산할 때 값을 1 증가시킨다.
		System.out.println(b);
		
		b = b + 1;
		System.out.println(b);
	}

}
