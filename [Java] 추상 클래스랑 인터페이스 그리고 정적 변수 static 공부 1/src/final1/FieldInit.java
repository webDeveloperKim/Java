package final1;

public class FieldInit {
	
//	static과 final이 함께 사용되면 클래스 상수가 됩니다.
//	클래스 로드 시 초기화되며, 모든 인스턴스가 공유 하는 변하지 않는 값을 나타냅니다.
//	클래스 레벨에서 선언되며, 클래스의 모든 인스턴스에서 공유
//	값이 변경되지 않으며 클래스에 종속되기 때문에 클래스 이름을 통해 접근
	
//	final만 사용되면 인스턴스 레벨 상수를 나타냅니다.
//	각 인스턴스마다 별도로 존재하며, 한 번 초기화되면 값이 변경될 수 없습니다.
//	인스턴스(객체) 레벨에서 선언되며, 각 객체마다 별개의 값을 가질 수 있다.
//	객체 생성 시 초기화되어야 하며, 초기화 후에는 값을 변경할 수 없음 
	
	static final int CONST_VALUE = 10; // final 은 올 대문자 언더바로 구분
	final int value = 10; // 인스턴스 레벨 상수 
}


// 인스턴스 레벨 상수 객체 별로 다른 상수 값을 가질 수 있는 예제 코드 
//public class InstanceConstantExample {
//    public final String instanceConstant;
//
//    public InstanceConstantExample(String value) {
//        this.instanceConstant = value; // 생성자에서 초기화
//    }
//
//    public static void main(String[] args) {
//        // 인스턴스 레벨 상수를 가지는 객체 생성
//        InstanceConstantExample example1 = new InstanceConstantExample("First instance constant");
//        InstanceConstantExample example2 = new InstanceConstantExample("Second instance constant");
//
//        // 각각의 객체는 서로 다른 상수 값을 가질 수 있습니다.
//        System.out.println("Example 1: " + example1.instanceConstant);
//        System.out.println("Example 2: " + example2.instanceConstant);
//    }
//}