package abstract2;

public class Dog extends AbstractAnimal {
	
//	추상 메서드 뿐 아니라 기본 메서드도 구현한 Dog 클래스  
    @Override
    public void name() {
        System.out.println("I am a dog");
    }
    
    @Override
    public void move() {
    	System.out.println("Dog 이동");
    }
}
