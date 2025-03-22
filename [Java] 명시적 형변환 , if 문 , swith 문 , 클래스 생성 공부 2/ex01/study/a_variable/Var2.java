package a_variable;

public class Var2 {

	public static void main(String[] args) {
//		변수
//		한번에 하나의 값만 저장 & 재할당 가능
//		"두 변수 a, b 값 서로 바꾸기"를 통해 변수의 특징 확인해보았습니다.
		
		int tmp = 0; // 임시로 저장하기 위한 변수 tmp 사용 예정 
		int a = 10; // a 변수에 10 대입 
		int b = 20; // b 변수에 20 대입 
		
//		printf 함수를 사용하면 % 기호로 각 변수이름에 해당하는 변수 값을 넣어서 문자열을 출력할 수 있습니다.
//		\n을 사용하면 한 줄 띄어쓰기가 가능합니다.
		System.out.printf("tmp : %d, a : %d, b %d\n",tmp,a,b);

//		tmp 변수에 a(10) 값을 저장 합니다. (a 변수 값이 왼쪽 tmp 변수에 대입)
		tmp = a; // tmp(0) < a(10)
		System.out.println("tmp : " + tmp);
		
//		a 변수에 b(20) 값이 대입이 됩니다.
		a = b; // a(10) < b(20)
		System.out.println("a : " + a);
		
//		b 변수에 앞에서 a(10) 값을 저장 시킨 tmp 값을 대입 시킵니다. 
		b = tmp; // b(20) < tmp(10)
		System.out.println("b : " + b);
		
//		결과적으로 tmp 변수를 사용하면서 a 변수에는 b의 값 , b 변수에는 원래 a 값으로 값 Switching 을 할 수 있었습니다.
		System.out.printf("tmp : %d, a : %d, b %d\n",tmp,a,b);
		
	}

}
