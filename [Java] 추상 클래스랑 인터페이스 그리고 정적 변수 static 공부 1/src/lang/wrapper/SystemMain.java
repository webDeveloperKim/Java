package lang.wrapper;

public class SystemMain {

	public static void main(String[] args) {
		// 현재 시간(밀리초)를 가져온다
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		
		// Java 프로그램의 실행 환경에 대한 시스템 속성 정보를 출력
		// 이 코드는 System.getProperties() 메서드를 호출하여 
		// 시스템 속성들을 Properties 객체로 반환하고, 
		// 이를 System.out.println()을 통해 콘솔에 출력
		System.out.println(System.getProperties());
		
	}

}