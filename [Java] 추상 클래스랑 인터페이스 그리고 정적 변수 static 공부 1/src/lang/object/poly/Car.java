package lang.object.poly;
 
public class Car {

	private String carName;
	
	public void move() {
		System.out.println("자동차 이동");
	}
	public Car() {};

	public Car(String name) {
		carName = name;
	}
}