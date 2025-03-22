package static1.ex;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car("k3");
		Car car2 = new Car("g80");
		Car car3 = new Car("genesis");

		Car.showTotalCars(); // 구매한 차량 수를 출력하는 static 메서드
		
		//위의 코드 실행에 오류가 없도록 Car 클래스 생성
		//private static int totalCar;
		//private String name;
		
		//메인 클래스 실해했을 때 출력예시
		// 차량 구입 , 이름 : k3
		// 차량 구입 , 이름 : g80
		// 차량 구입 , 이름 : genesis
		// 구매한 차량 수 : 3
		
	}

}