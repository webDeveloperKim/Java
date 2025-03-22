package poly.ex3;


// Interface 는 추상 메서드만 들어가야함
public interface InterfaceAnimal {
	
//	public static final double MY_PI = 3.14;
	double MY_PI = 3.14; // 멤버변수 public static final 생략 가능
	
	// public abstract 생략 가능 어짜피 인터페이스에는 무조건
	// 추상메서드가 있어야되므로
	// 추상 메서드는 구현부가 없음
	void sound();
	void move();
	
}
