package study1;

public class Temp1 {

	public static void main(String[] args) {
		//변수 a,b 를 선언해서 값을 할당(=초기화)
		//두 변수값에 할당된 리터럴값의 위치를 변경 
		
		int a = 12;
		int b = 50;
		int tmp = 0;
		
		tmp = a;
		System.out.println("tmp : " + tmp);
		a = b;
		b = tmp;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
	}

}
