package ex01;

public class MethodInitMain1 {

	public static void main(String[] args) {
		MemberInit init1 = new MemberInit();
		init1.name = "user";
		init1.age = 15;
		init1.grade = 90;
		
		MemberInit init2 = new MemberInit();
		init2.name = "user2";
		init2.age = 16;
		init2.grade = 80;
		
//		MemberInit 타입의 배열을 선언
		MemberInit[] members = {init1, init2};
		
		for(MemberInit m : members) {
			System.out.println(" 이름 : " + m.name + " 나이 : " + m.age +  " 성적 : " + m.grade);
			
		}

	}
	
//	static 메서드는 클래스의 인스턴스가 아닌 클래스 자체에서 호출할 수 있는 메서드
//	객체를 생성하지 않고 클래스 이름을 통해 호출 가능
//  initMember 메서드는 MemberInit 객체의 name, age, grade 속성을 매개변수로 받은 값들로 설정	
	static void initMember(MemberInit init, String name, int age, int grade) {
		init.name = name;
		init.age = age;
		init.grade = grade;
	}

}
