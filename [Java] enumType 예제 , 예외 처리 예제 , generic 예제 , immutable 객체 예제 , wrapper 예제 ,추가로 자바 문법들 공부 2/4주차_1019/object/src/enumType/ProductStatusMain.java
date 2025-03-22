package enumType;

public class ProductStatusMain {
	public static void main(String[] args) {
		Product product1 = new Product("컴퓨터",ProductStatus.IN_STOCK);
		Product product2 = new Product("모니터",ProductStatus.OUT_OF_STOCK);
		Product product3 = new Product("마우스",ProductStatus.DISCOUNTED);
		
		product1.printStatus();
		product2.printStatus();
		product3.printStatus();
		
		// 객체 내부에 tostring 이 있으면 자동으로 호출 
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);		
		
	}
}

