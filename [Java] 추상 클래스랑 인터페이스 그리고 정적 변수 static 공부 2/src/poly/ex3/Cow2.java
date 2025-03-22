package poly.ex3;

public class Cow2 implements InterfaceAnimal {
	
	@Override
	public void sound() {
		System.out.println("음메");
	}
	
	@Override
	public void move() {
		System.out.println("음메 이동");
	}
}
