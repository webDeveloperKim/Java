package study1;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		//학생 점수 입력 받기	
		//입력받은 학생 점수가 90점 이상이면 A
		//입력받은 학생 점수가 80점 이상아면 B
		//입력받은 학생 점수가 70점 이상이면 C
		//나머지는 D
		//마지막에 학생에게 입력받은 점수의 등급 알려주는 프로그램
		
//		score = 0으로 초기화 
//		grade = ''으로 초기화 
		int score = 0;
		char grade = ' ';
		
//		Scanner 사용하여 사용자 점수 입력 받고 입력 받은 점수를 정수 변환 
		System.out.println("점수를 입력하세요 >.");
		Scanner scanner = new Scanner(System.in);
		score = Integer.parseInt(scanner.nextLine());
		
//		if 문 사용해서 각 점수 별로 해당되는 등급 부여 
		if(score >= 90) {
			grade = 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'c';
		}else {
			grade = 'D';
		}
		
		System.out.printf("당신의 학점은 %c 입니다.", grade);
		
	}
}