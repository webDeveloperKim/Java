package poly.ex3;

public class AbstractMain {

    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        Cat1 cat = new Cat1();
        Cow1 cow = new Cow1();

        System.out.println("-0-");
        soundAnimal(dog);
        System.out.println("-1-");
        soundAnimal(cat);
        System.out.println("-2-");
        soundAnimal(cow);
        System.out.println("-3-");
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}