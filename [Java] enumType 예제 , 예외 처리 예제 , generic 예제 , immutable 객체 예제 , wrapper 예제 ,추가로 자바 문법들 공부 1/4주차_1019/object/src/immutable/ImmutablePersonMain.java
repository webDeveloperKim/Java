package immutable;

public class ImmutablePersonMain {
	public static void main(String[] args) {
//		아예 새로운 객체를 만드는 것
		ImmutablePerson immutablePerson = new ImmutablePerson("홍길동",18);
		
		 // getAge() , getName() 메서드로 immutablePerson의 age , name 값을 확인
        System.out.println("immutablePerson의 age 값: " + immutablePerson.getAge());
        System.out.println("immutablePerson의 name 값: " + immutablePerson.getName());

        int age = 15; // immutablePerson과는 무관한 지역 변수 변경

        // immutablePerson 객체의 age 값이 여전히 18 인지 확인하고 name 값이 홍길동인지 확인 
        System.out.println("immutablePerson의 age 값: " + immutablePerson.getAge());
        System.out.println("immutablePerson의 name 값: " + immutablePerson.getName());
		
//		개발자들끼리 의미를 알수있다
//		바꾸면 안되는 객체인데 메서드를 통해서 새로 값으로 새 객체를 만들어서 필드를 다른 값으로 만드는 것이다.
		ImmutablePerson immutablePersonChange = immutablePerson.withName("홍길동222", 123);
		
		 System.out.println("immutablePerson의 age 값: " + immutablePersonChange.getAge());
	     System.out.println("immutablePerson의 name 값: " + immutablePersonChange.getName());
		
		
	}
}
