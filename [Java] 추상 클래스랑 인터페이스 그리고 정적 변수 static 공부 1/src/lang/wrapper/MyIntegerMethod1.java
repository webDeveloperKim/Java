package lang.wrapper;

public class MyIntegerMethod1 {

	public static void main(String[] args) {
		// { -1, 0, 1, 2, 3 }는 배열의 초기값을 지정하는 리터럴입니다. 
		// 이 배열에는 5개의 정수 값이 포함되어 있으며, 인덱스는 0부터 시작
		// intArr[0]은 -1
		int[] intArr = {-1,0,1,2,3};
		
		System.out.println(findValue(intArr, -1));
		System.out.println(findValue(intArr, 0));
		System.out.println(findValue(intArr, 1));
		System.out.println(findValue(intArr, 100));
		
	}
	
	private static int findValue(int[] intArr, int target) {
		
		for(int value : intArr) {
			if(value == target) {
				return value;
			}
		}
		return -1;
	}
}