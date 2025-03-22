package exceptionHandling;

import java.util.Scanner;

// 예제 : 사용자 입력에서 발생할 수 있는 예외 처리 프로그램 작성
// 입력 받아서 예외 발생시 처리 예문
public class UserInputEx {
	public static void main(String[] args) {
//		scanner 로 입력받고
//		입력한 값이 숫자가 아닐때 예외 try catch 문 처리
		
		Scanner scanner = new Scanner(System.in);
	
		try {
			System.out.println("숫자 입력>");
			int num = scanner.nextInt();
			System.out.println("입력 값 확인 : " + num);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			scanner.close();
		}
		
	}
}
