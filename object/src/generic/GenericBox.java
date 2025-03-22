package generic;

// 객체 생성 시점에 나의 타입이 정해짐
public class GenericBox <T> {
	private T item;
	
	public GenericBox(T item) {
		this.item = item;
	}
	
	public void printItem() {
		System.out.println("Item:" + item);
		
	}
	
	
	
	
}
