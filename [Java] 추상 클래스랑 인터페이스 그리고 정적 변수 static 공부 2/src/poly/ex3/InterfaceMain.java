package poly.ex3;

public class InterfaceMain {

	public static void main(String[] args) {
	//	InterfaceAnimal animal = new InterfaceAnimal() {
			
			
			//모두 정의 해야된다 구현부
		//	@Override
		//	public void sound() {
		//		// TODO Auto-generated method stub
				
		//	}
			
		//	@Override
		//	public void move() {
				// TODO Auto-generated method stub
				
	//		}
	//	};
			Cat2 cat = new Cat2();
			Dog2 dog = new Dog2();
			Cow2 cow = new Cow2();
			
			soundAnimal(cat);
			soundAnimal(dog);
			soundAnimal(cow);
			
	}
		private static void soundAnimal(InterfaceAnimal animal) {
		System.out.println("동물소리 테스트 시작");
		animal.sound();
		System.out.println("동물소리 테스트 종료");
	
	}

}