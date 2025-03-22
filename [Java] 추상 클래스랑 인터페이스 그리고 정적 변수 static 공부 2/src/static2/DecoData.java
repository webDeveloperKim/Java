package static2;

public class DecoData {
//  인스턴스 변수(instance variable)**란, 
//	클래스의 각 객체(instance)가 개별적으로 가지는 데이터를 저장하는 변수
	private int instanceValue;
	
	//정적 변수 (static variable) 이며, 더 구체적으로 클래스 변수라고 함
	//정적 변수는 static 키워드가 붙어 있어서 클래스의 모든 인스턴스가 공유하는 변수
	private static int staticValue;
	
	public static void staticCall(DecoData data) {
		staticValue++;
	}
	
}
