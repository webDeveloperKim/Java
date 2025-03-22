package operator;

public class Compare2 {

	public static void main(String[] args) {
//		문자열 비교 equals()
		
		String str1 = "hello";
		String str2 = "hello";
		
		boolean result = "hello".equals(str2);
		System.out.println(result);
		
//		변수에 담아서 비교 하거나 직접 값을 담아서 비교해도 결과는 같다.
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("hello"));
		
	}

}
