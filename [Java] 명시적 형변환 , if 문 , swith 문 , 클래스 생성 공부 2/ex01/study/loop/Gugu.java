package loop;

public class Gugu {

	public static void main(String[] args) {
//		중첩 for 문 사용해서 구구단 출력 ( 1단부터 9단까지 )		
		for(int i = 1; i <=9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n",i, j, i*j);
			}
			System.out.println();
		}

	}

}
