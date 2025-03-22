package java_1006;

// 	Member 클래스 생성
public class Member {

// 	Member 클래스 각 필드 값 생성 ( 이름 , 나이 , 성적 ) 
	String name;
	int age;
	int grade;
	
//	반환 타입 없이 (void) 매개 변수 있는 initMember 메서드 생성 
	void initMember(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
}