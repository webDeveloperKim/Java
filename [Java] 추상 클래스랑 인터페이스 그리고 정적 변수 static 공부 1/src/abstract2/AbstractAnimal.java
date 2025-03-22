package abstract2;

// 추상 클래스는 abstract 가 붙는다
public abstract class AbstractAnimal {
	
//	추상 메서드가 하나라도 있으면 그 클래스는 추상 클래스가 되야함
//  구현부가 없는 메서드가 추상 메서드
	public abstract void name();
	
//	기본 메서드도 들어갈수있음
	public void move() {
		
	}
}
