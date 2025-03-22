package static1.ex;

public class Car {
	
//	private 접근 제한자를 사용하는 경우, 
//	getter와 setter 메서드를 기본적으로 사용하는 것이 좋음
//	여기서는 다루지 않을 예정
	private static int totalCars;
	private String name;
// 인스턴스 변수에서는 static 사용 가능
	//넓은 범위는 static 사용 가능 반대는 불가능
	public Car(String name) {
		System.out.println("차량 구입, 이름 : " + name);
		this.name = name;
		totalCars++;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}

	static void showTotalCars() {
		System.out.println("구매차량수 :" + totalCars);
	}
	
}