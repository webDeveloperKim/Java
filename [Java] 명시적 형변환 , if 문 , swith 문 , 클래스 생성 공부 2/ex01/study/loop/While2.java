package loop;

public class While2 {

	public static void main(String[] args) {
		
//		while 반복문
		int sum = 0;
		int i = 0;
		int endNum = 3;
		
		while (i <= endNum) {
			sum += i; // sum = sum + 1
			i++; // i = 1 + 1
		}
		System.out.println("sum : "+ sum);
		
//		최소 한번은 수행 do while 문 ( 이전 코드에서 sum = 6, i = 4까지 저장 )
		do {
			sum += i;
			i ++;
		}while(i <= endNum);
		System.out.println("sum : "+ sum);
	}

}
