package enumType;

// Enum 으로 사용자 권한 정의하고 사용
// UserRole enum type을 정의하고 ADMIN , USER , GUEST 역할 정의
// User 클래스 정의하고 사용자 이름과 역할을 저장
// 역할 출력하는 프로그램 작성

// 하나의 파일 안에서 두개의 Public 은 있을 수 없음
public enum UserRole {
	ADMIN, USER, GUEST //권한 등급 느낌의 데이터를 많이 저장한다.
}
class User{
	private String name; // 사용자 이름 저장하는 필드
	private UserRole role; // role 이라는 UserRole 타입의 필드 선언
//	(=사용자 역할을 저장할 예정)
	public User(String name, UserRole role) {
		this.name = name;
		this.role = role;
	}
	public void printRole() {
		System.out.println(name + " role : " + role);
	}
	
	
}