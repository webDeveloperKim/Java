package java_1006;

public class ClassStart2 {

	public static void main(String[] args) {
		
//		배열 복습 문제
//		배열은 특정 타입을 연속한 데이터 구조로 만들어
//		하나의 변수로 관리할 수 있음

//		size 3 크기의 aa 배열 생성 예시 
//		int[] aa = new int[3];
//		변수 aa2에 생성자를 이용해서 {11,22,33} 값을 대입  
//		int[] aa2 = new int[]{11,22,33};
		
//		배열 값들을 변수에 직접 저장 
		String[] studentNames = {"학생1", "학생2"};
		int[] studentAges = {15, 16};
		int[] StudentGrades = {90, 80};
			
//		변수 별 배열 정보를 index 로 접근해서 학생1 , 학생2 의 정보 출력 
		System.out.println("이름 : " + studentNames[0] + "나이 : " + studentAges[0] + "성적 : " + StudentGrades[0]);
		System.out.println("이름 : " + studentNames[1] + "나이 : " + studentAges[1] + "성적 : " + StudentGrades[1]);

//		for 문 조건식 구성
//		초기식 : 반복을 시작할 횟수 i ( = 카운트 변수 )
//		조건식 : 반복문을 종료 시키는 조건 ( 총 반복 횟수의 limit 값 )
//		증감식 : 카운트 변수 i 가 종료 조건을 타기 위한 코드
		
//		학생 이름 변수 사이즈 확인
		System.out.println(studentNames.length);
		
//		for 문을 이용해서 학생1 , 학생2 정보를 출력
		for(int i = 0; i < studentNames.length; i++) {
			System.out.println("이름 : " + studentNames[i] + "나이 : " + studentAges[i] + "성적 : " + StudentGrades[i]);
		}
		
	}

}