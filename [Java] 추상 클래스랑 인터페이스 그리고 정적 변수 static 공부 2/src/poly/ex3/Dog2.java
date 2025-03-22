package poly.ex3;

//인터페이스는 임플리먼트 키워드로 바뀜 도그에서
//인터페이스를 임플리먼트한다
//인터페이스를 모두 오버라이딩 해야한다
public class Dog2 implements InterfaceAnimal {
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	@Override
	public void move() {
		System.out.println("멍멍 이동");
	}
	
}
