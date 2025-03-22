package generic;

// 객체 생성 시점에 나의 타입이 정해짐
public class GenericBoxMain {
	public static void main(String[] args) {
		//만드는 시점에 타입 선언
		GenericBox<Integer> box1 = new GenericBox<>(123);
		box1.printItem();
		
		GenericBox<String> box2 = new GenericBox<>("가가");
		box2.printItem();
		
		GenericBox2<Integer> box3 = new GenericBox2<>(123);
		box3.setItem(1234);
		System.out.println(box3.getItem());
		
		GenericBox2<String> box4 = new GenericBox2<>("가가가");
		box4.setItem("나나나");
		
		System.out.println(box4.getItem());
	}
}
