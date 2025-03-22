package lang.wrapper;

public class MyIntegerMethod {

	public static void main(String[] args) {
		int value = 10;
		int i1 = compareTo(value, 5);
		int i2 = compareTo(value, 10);
		int i3 = compareTo(value, 20);
		
		System.out.println("i1 : " + i1);
		System.out.println("i2 : " + i2);
		System.out.println("i3 : " + i3);

	}
	// CompareTo 메서드
	public static int compareTo(int value, int target) {
		if (value < target) {
			return -1;
		}else if (target < value) {
			return 1;
		}else {
			return 0;
		}
	}
}
