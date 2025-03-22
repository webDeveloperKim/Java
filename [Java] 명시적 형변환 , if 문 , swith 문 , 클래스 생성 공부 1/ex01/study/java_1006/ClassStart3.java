package java_1006;

public class ClassStart3 {

	public static void main(String[] args) {
//		객체 생성 왜하는지
//		자의적인 해석으로는 객체는 만들어 놓은 클래스에 접근할 수 있는 변수 
//		그 클래스에 접근하면 해당 클래스의 필드 값을 조작 생성할 수 있음 
		
//		클래스가 가진 필드 값들을 조작하기 위해서 입니다. 
//		조작 : 변수에 데이터 값을 넣을 수도 있고 뺄 수도 있는 것이 조작이라 함
	
//		Student 클래스의 필드 값을 접근 및 조작할 수 있는 student1 이름의 Student 객체 생성
		Student student1 = new Student(); 

// 		학생1 이름의 객체의 참조 값 출력
		System.out.println(student1); 

//		student1 필드 값 지정
		student1.age = 15;
		student1.grade = 90;
		student1.name = "학생1";
		
//		Student 클래스의 필드 값을 접근 및 조작할 수 있는 student2 이름의 Student 객체 생성
		Student student2 = new Student(); 
		System.out.println(student2); 
		
//		student2 필드 값 지정
		student2.age = 16;
		student2.grade = 80;
		student2.name = "학생2";
		
//		student1 , student2 각 객체의 지정한 필드 값 출력 
		System.out.println("이름 : " + student1.name + "나이 : " + student1.age + "성적 : " + student1.grade);
		System.out.println("이름 : " + student2.name + "나이 : " + student2.age + "성적 : " + student2.grade);
		
//		클래스 = 설계도 이고 이 클래스를 기반으로
//		실제 메모리 어딘가에 만들어진 실체를 객체 또는 인스터스
		
//		클래스 자체는 실체가 따로 없어서 이름을 지정해서 객체를 만드는 것

//		결론
//		Student student1 = new Student(); Student 객체 생성
//		student1 = x001; // new Student()의 결과로 참조 주소값 반환
				
	}

}
