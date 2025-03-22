package study1;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
//Switch 문
		/*
		 * switch 문의 조건식 결과는 정수 또는 문자열 이어야 한다
		 * case 문의 값은 정수 혹은 상수만 가능하며, 중복 불허한다
		 * 
		 */
		/*
		 * 사용자에게 현재 월을 입력받기
		 * 해당월이 6~8월 이면 여름
		 * 해당월이 9~11월 이면 가을
		 * 해당월이 12~2월이면 겨울
		 * 나머지 봄
		 */
		System.out.println("현재 월을 입력하세요>.");
		
//		break가 있어야 아래 숫자의 출력 문자열이 나오지 않고 해당되는 숫자의 출력 문자열만 나옴 
		Scanner scanner = new Scanner(System.in);
		int month = Integer.parseInt(scanner.nextLine());
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("현재 계절은 봄");
			break;
		case 6: case 7: case 8:
			System.out.println("현재 계절은 여름");
			//위에 break 없으면 3 입력시 여름까지 출력됨
		case 9: case 10: case 11:	
			System.out.println("현재 계절은 가을");
		case 12: case 1: case 2:	
			System.out.println("현재 계절은 겨울");
			
		}
		
	}

}
