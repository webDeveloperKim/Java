package casting;

public class Casting {

	public static void main(String[] args) {
//	명시적 형변환(=캐스팅)
		
		double doubleValue = 1.5;
		int intValue = 0;
		
		intValue = (int)doubleValue;

		System.out.println("intValue = " + intValue);
		
//		묵시적 형변환 더 작은 값은 큰 값에 담기는 건 개발자가 
//		해줄 필요 없이 자동으로 해준다.
		doubleValue = intValue;
		
		System.out.println("doubleValue = " + doubleValue);
	}
}
