package final1;

public class FinalLocalMain {

	public static void main(String[] args) {
		final int data1;
		data1 = 10;
		final int data2;
	}
//	final 매개변수는 메서드 호출 시 전달 받은 값을 변경할 수 없음 
//	parameter 에 final 키워드가 붙었으므로, 해당 매개변수는 상수처럼 동작하며, 메서드 내에서 재할당이 금지
	static void method(final int parameter) {
//		parameter = 20; // 오류 발생 
	}
}
