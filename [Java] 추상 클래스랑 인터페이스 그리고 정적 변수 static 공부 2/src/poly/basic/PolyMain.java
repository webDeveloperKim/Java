package poly.basic;

public class PolyMain {

	public static void main(String[] args) {
		
		System.out.println("---1---");
		
		Parent parent = new Parent();
		parent.parentMethod();
		System.out.println("---2---");
		
		Child child = new Child();
		child.parentMethod();
		
		System.out.println("---3---");
		// 자바에서 부모 클래스 타입의 참조 변수는 부모 클래스와 
		// 그 모든 하위 클래스(자식 클래스)의 객체 참조 가능
		Parent poly = new Child();
		poly.parentMethod();
		
	}

}