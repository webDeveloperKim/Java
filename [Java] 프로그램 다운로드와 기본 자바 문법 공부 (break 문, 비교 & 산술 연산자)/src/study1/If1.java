package study1;

// Scanner Import
import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		
		int input;
		
		System.out.println("숫자를 입력하세요.");
		
//		Scanner 를 이용해서 값을 입력받고 parseInt로 정수 변
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		input = Integer.parseInt(str);
		
//	 	if문 사용하여 0이 맞는 숫자와 아닌 숫자 구분 
		if(input == 0) {
			
			System.out.println("입력하신 숫자는 0 입니다.");
		}else if(input != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d 입니다.",input);
		}
	}
}