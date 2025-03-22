package poly.basic;

public class AnimalSoundMain2 {
//	다형성을 사용하는 이유 : 다양한 타입(형)의 참조 + 메서드 오버라이딩
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		Animal[] animals = {dog, cat, cow};
		
		for (Animal animal : animals) {
			System.out.println("동물 소리 테스트 시작");
			animal.sound();
			System.out.println("동물 소리 테스트 종료");
		}
		
	}
}
