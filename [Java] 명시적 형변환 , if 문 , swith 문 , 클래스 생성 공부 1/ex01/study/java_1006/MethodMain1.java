package java_1006;

public class MethodMain1 {

	public static void main(String[] args) {
// 		Method 객체 method 생성
		Method method = new Method();
		
//		method 인스턴스의 add 메서드 호출 
		System.out.println(method.add(12,19));
		
//		method 인스턴스의 오버로딩한 add 메서드 호출
		System.out.println(method.add(12, "가"));

	}

}
