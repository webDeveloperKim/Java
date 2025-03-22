package lang;

public class LangMain {

	public static void main(String[] args) {

		UserV1 userV1 = new UserV1("12");
		UserV1 userV2 = new UserV1("12");
		
		String str1 = userV1.id;
		String str2 = userV2.id;
		
		// 객체 참조 값이 동일한지 결과 출력
		System.out.println(userV1 == userV2);
		// 값 자체가 동일한지 결과 출력 
		System.out.println(str1.equals(str2));
		// 객체 참조 값이 동일한지 결과 출력
		System.out.println(userV1.equals(userV2));
		
//System.out.println("hello java");
		
// Object 클래스 : 모든 자바 객체의 부모 클래스
// String : 문자열
// Integer, Long, Double : 래퍼타입, 기본형 데이터 타입을 객체로 만든것
// Class : 클래스 메타 정보 / 어떠한 거에 대한 설명 내용이 담긴 클래스다
// System : 시스템 관련 기본 기능 제공
		
		
	}

}
