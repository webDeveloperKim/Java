package ex01;

public class MemberConstruct {
	String name;
	int age;
	int grade;
	
	public MemberConstruct() {
		System.out.println("객체 생성 되었음");
	}

	// 	첫 번째 생성자
	public MemberConstruct(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	
// 	두 번째 생성자
	public MemberConstruct(String name, int age, int grade) {
//		생성자 체이닝은 클래스의 다른 생성자에서 공통 코드를 중복하지 않도록 도와 줍니다.
		this(name,age); // 첫 번째 생성자 호출
		this.grade = grade;	// grade 초기화	
	}
}