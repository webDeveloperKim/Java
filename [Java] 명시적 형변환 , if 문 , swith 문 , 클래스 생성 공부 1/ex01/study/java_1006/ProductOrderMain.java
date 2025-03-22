package java_1006;

public class ProductOrderMain {

	public static void main(String[] args) {
//		여러 상품의 주문 정보를 담는 배열 생성
//		상품 주문 정보를 ProductOrder 타입의 변수로 받아 저장
//		상품 주문 정보와 최종 금액 출력
		ProductOrder[] products = new ProductOrder[2];
		
		ProductOrder product1 = new ProductOrder();
		product1.productName = "갤럭시";
		product1.price = 3000;
		product1.quantity = 3;
		products[0] = product1;
		
		ProductOrder product2 = new ProductOrder();
		product2.productName = "아이폰";
		product2.price = 5000;
		product2.quantity = 2;
		products[1] = product2;
		
		for(ProductOrder po : products) {
			System.out.println(" 상품명 : " + po.productName + " , 상품 가격 : " + po.price + " , 상품 수량 : " + po.quantity);	
		}	
	}
}