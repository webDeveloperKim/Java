package extends1.ex1;

public class CarMain {

	public static void main(String[] args) {
		ElectricalCar electricCar = new ElectricalCar();
		electricCar.move();
		System.out.println("--");
		electricCar.charge();
		System.out.println("--");
		
		GasCar gasCar = new GasCar();
		gasCar.move();
		System.out.println("--");
		gasCar.fillUp();
		System.out.println("--");
		
		electricCar.opneDoor();
	}

}
