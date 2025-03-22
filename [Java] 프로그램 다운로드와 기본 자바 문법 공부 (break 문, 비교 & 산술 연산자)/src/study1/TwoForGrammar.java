package study1;

public class TwoForGrammar {

	public static void main(String[] args) {
	
// array 변수에 리스트 형식으로 값 저장
		int[] array = {10,20,30,40,50};
		
//	기본 for문 사용 예시 
		System.out.println("------기본 for문 사용 예시------");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
//	향상 for문 사용 예시 
		System.out.println("------향상 for문 사용 예시------");
		for(int tmp : array) {
			System.out.println(tmp);
		}
		
	}

}
