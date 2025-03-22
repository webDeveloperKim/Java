package array;

public class Array2 {

	public static void main(String[] args) {

//		int형 변수 5개를 담을 수 있는 배열 생성
//		int[] 배열 타입의 students 변수에 int[] 배열 타입 size 5인 빈 객체를 생성 합니다. 
		int[] students = new int[5];
		
//		int[] 배열 타입의 students 변수에 index 로 접근하여 값을 대입 시켜 줍니다. 
		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 50;
		
//		출력하여 결과를 확인 해봅니다. 
		System.out.println("학생1 점수 : " + students[0]); 
		System.out.println("학생2 점수 : " + students[1]); 
		System.out.println("학생3 점수 : " + students[2]); 
		System.out.println("학생4 점수 : " + students[3]); 
		System.out.println("학생5 점수 : " + students[4]); 
		
//		배열 사이즈 5인 것을 확인 및 출력
		System.out.println(students.length);
		
//		for 문을 사용하여 인덱스 0부터 4까지 차례대로 학생 num에 맞게 출력해줍니다.
		for(int i = 0; i< students.length; i++) {
			System.out.println("학생" + (i+1) + "점수 = " + students[i]);
		}
		
	}

}
