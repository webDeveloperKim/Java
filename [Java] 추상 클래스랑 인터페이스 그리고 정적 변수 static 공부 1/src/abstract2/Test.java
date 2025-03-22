package abstract2;

public class Test{
	public static void main(String[] args) {
	
	// 추상 클래스를 상속받아 모든 추상 메서드를 구현한 후에 추상 클래스 타입의 객체 생성이 가능하다 
	AbstractAnimal dog = new Dog();
	dog.name();	
	dog.move();
	}
}