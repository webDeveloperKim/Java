package java_1006;

public class ClassStart4 {

	public static void main(String[] args) {

//		student1 이름의 Student 객체 생성
		Student student1 = new Student(); 

//		student1 필드 값 지정
		student1.age = 15;
		student1.grade = 90;
		student1.name = "학생1";
		
//		student2 이름의 Student 객체 생성
		Student student2 = new Student(); 
		
//		student2 필드 값 지정
		student2.age = 16;
		student2.grade = 80;
		student2.name = "학생2";
		
		
// 		Student 객체를 담을 수 있는 사이즈 2의 배열 생성
//		해당 배열에 student1 , student2 인스턴스 참조값을 담는다
		Student[] students = new Student[2];
		
// 		student1 의 참조 주소값을 읽고 > 복사해서 > 배열 변수에 대입
		students[0] = student1; 
	
// 		student2 의 참조 주소값을 읽고 > 복사해서 > 배열 변수에 대입
		students[1] = student2; // 
		
//		아래와 같이 자바에서 모든 변수의 대입은 항상 값을 복사해서 전달 하는 것  
		int a = 10;
		int b = 20;
		int tmp = 0;
		
//		a 변수의 값을 복사해서 tmp 변수에 값 전달 
//		a 변수의 값을 복사해서 b 변수에 값 전달 
		tmp = a;
		b = a;
				
	}

}