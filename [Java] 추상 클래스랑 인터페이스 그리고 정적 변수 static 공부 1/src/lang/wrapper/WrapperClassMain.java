package lang.wrapper;

public class WrapperClassMain {

	public static void main(String[] args) {
		
		// Integer newInteger = new Integer(10);는 
		// 같은 값(10)을 위해 매번 새로운 객체를 생성하므로, 메모리를 낭비하게 됩니다.
		Integer newInteger = new Integer(10);
		// int 값 10을 Integer 객체로 변환하여 integerObj 변수에 저장
		Integer integerObj = Integer.valueOf(10);
		// 랩퍼 값 할당 방법
		
		//int 값 100을 Long 객체로 변환하여 long1 변수에 할당하는 코드
		Long long1 = Long.valueOf(100);
		//double 값 10.5를 Double 객체로 변환하여 double1 변수에 할당하는 코드
		Double double1 = Double.valueOf(10.5);
		
		System.out.println("newInteger : " + newInteger);
		System.out.println("integerObj : " + integerObj);
		System.out.println("long1 : " + long1);
		System.out.println("double1 : " + double1);
		
		//랩퍼 값 꺼내오는 방법 
		System.out.println("내부 값 읽기");
		int intValue = integerObj.intValue();
		System.out.println(intValue);
		long longValue = long1.longValue();
		System.out.println(longValue);
		
		System.out.println("비교");
		// 객체가 동일한지 비교 및 출력 
		System.out.println("newInteger == integerObj : " + (newInteger == integerObj));
		// 값이 동일한지 비교 및 출력 
		System.out.println("newInteger.equals(integerObj) : " + (newInteger.equals(integerObj)));
		
	}

}
