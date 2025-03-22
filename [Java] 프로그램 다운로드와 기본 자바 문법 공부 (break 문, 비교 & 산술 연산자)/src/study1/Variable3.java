package study1;

public class Variable3 {

	public static void main(String[] args) {

		char ch = 'd';
		//문자 하나만
		String name = "홍길동";
		//문자열
		int a = 128;
		byte b = (byte)a;
		System.out.println(b);
		// 원래 값 보존이 안됨
		double aa = 3.14;
		System.out.println(aa);
		
		int c = (int)aa;
		System.out.println(c);
		// 데이터 손실이 발생할수있다.
		
	}

}
