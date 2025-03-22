package lang.object.poly;

public class MainTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Car car = new Car();
		//Object dog = new Dog();
		//Object car = new Car();
		
		//Car car2 = (Car)new Object();**는 Object 객체를 Car 타입으로 캐스팅하려는 코드
		//캐스팅은 반드시 클래스 간 상속 관계가 있을 때만 유효
		//Object 는 자바의 모든 클래스가 직접 또는 간접적으로 상속받는 최상위 클래스
		//Car car2 = (Car)new Object();
		
		action(dog);
		action(car);
	
	}
	
	private static void action(Object obj) {
		//obj가 Dog dog 객체를 참조하고 있는지 : instanceof
		if(obj instanceof Dog dog) {
			dog.sound();
		} else if (obj instanceof Car car) {
			car.move();
		}
	
	}
}