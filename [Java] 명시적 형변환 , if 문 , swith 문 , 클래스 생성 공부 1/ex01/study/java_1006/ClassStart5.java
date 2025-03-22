package java_1006;

public class ClassStart5 {

	public static void main(String[] args) {

//		Student 배열 타입으로 바꾸기
		
//		Student 객체 student1 , student2 인스턴스 생성
		Student student1 = new Student();
		Student student2 = new Student();
		
//		student1 , student2 인스턴스 참조 값을 직접 students 배열에 담는다.  
		Student[] students = {student1, student2} ;
		
//		students 0번 인덱스에 학생1 정보를 담는다.
		students[0].name = "학생1";
		students[0].age = 15;
		students[0].grade = 90;
		
//		students 1번 인덱스에 학생2 정보를 담는다.
		students[1].name = "학생2";
		students[1].age = 16; 
		students[1].grade = 80;
		
//		각각 값 할당
//		아래에서 for 문 써서 출력
		for(int i = 0; i < students.length; i++) {
			System.out.println("이름 : " + students[i].name + "나이 : " + students[i].age + "점수 : " + students[i].grade);
		}
		System.out.println("--------------");
		
		for(Student s : students) {
			System.out.println(s.age);
			System.out.println(s.grade);
			System.out.println(s.name);

		}
		
	}

}
