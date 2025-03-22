package java_1006;

public class MemberMain {

	public static void main(String[] args) {
		
//		Member 객체 member 생성 
		Member member = new Member();
//		member.name = "회원1";
//		member.age = 15;
//		member.grade = 5;

//		member 인스턴스 initMember 메서드 호출 및 매개 변수 생성 
		member.initMember("회원1", 15, 5);

//		위에서 생성한 member 인스턴스 필드 값 출력 
		System.out.println(" name : " + member.name + " age : " + member.age + " grade : " + member.grade);
	}

}
