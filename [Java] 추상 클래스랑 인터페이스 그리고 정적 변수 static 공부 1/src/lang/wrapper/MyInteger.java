package lang.wrapper;

public class MyInteger {
	private final int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public int compareTo(int target) {
		if (value < target) {
			return -1;
		}else if (target < value) {
			return 1;
		}else {
			return 0;
		}
	}
	
	//toString() 메서드는 Object 클래스에 정의되어 있는 메서드로, 
	//객체를 문자열로 반환할 때 사용
	//String.valueOf(value)는 value 를 문자열로 변환하는 메서드
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}