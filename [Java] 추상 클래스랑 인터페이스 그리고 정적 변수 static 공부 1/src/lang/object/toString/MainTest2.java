package lang.object.toString;

import lang.object.poly.Dog;

public class MainTest2 {

	public static void main(String[] args) {
		Dog dog = new Dog("말티즈",5);
		
		ObjectPrinter.print(dog);
		
		//ObjectPrinter 에서 가장 먼저 부모에 정의된 메서드 대신
		//자식 오버라이딩 우선적으로 실행
		System.out.println(dog.toString());
	}

}