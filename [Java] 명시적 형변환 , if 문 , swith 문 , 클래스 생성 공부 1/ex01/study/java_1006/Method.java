package java_1006;

public class Method {
//	메서드 생성 예시  
	int a = 0;
	int b = 0;
	
	
	public int add(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
}
	// 매서드 오버로딩 ( 코드 재사용 가능 )
	public int add(int a, String b) {
		int sum = 0;
		return sum;
}
}