package java_1006;

public class ClassStart1 {

	public static void main(String[] args) {
		
//		클래스가 필요한 이유
//		문제 - 학생 정보 출력 프로그램 만들기

//		요구사항
//		첫번째 학생 이름은 "학생1" 나이 : 15 성적 90
//		두번째 학생 이름은 "학생2" 나이 : 16 성적 80
//		각 학생의 정보를 아래와 같은 문자열 형식으로 출력
//		"이름 : [이름] 나이 : [나이] 성적 : [성적]"
//		변수 사용해서 학생정보 저장해주시고,
//		그 변수를 써서 학생 정보를 출력
		
//		학생1 이름 , 나이 , 성적 / 변수 선언 및 값 저장  
		String student1Name = "학생1";
		int student1Age = 15;
		int Student1Grade = 90;
		
//		학생2 이름 , 나이 , 성적 / 변수 선언 및 값 저장  
		String student2Name = "학생2";
		int student2Age = 16;
		int Student2Grade = 80;
		
//		학생1 , 학생2 의 이름 , 나이 , 성적 정보 출력
		System.out.println("이름 : " + student1Name + "나이 : " + student1Age + "성적 : " + Student1Grade);
		System.out.println("이름 : " + student2Name + "나이 : " + student2Age + "성적 : " + Student2Grade);
				
	}

}
