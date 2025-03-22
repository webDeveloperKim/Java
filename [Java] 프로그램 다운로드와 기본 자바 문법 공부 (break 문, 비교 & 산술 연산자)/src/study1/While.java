package study1;

public class While {

	public static void main(String[] args) {
		
		int i = 11;
		System.out.println("카운트다운 시작");
		
		while (i-- != 0) {
			System.out.println(i);
			
			for(int j = 0; j<2_000_000_000; j++) {
				;
			}
		}
		System.out.println("GAME OVER");
	}

}
