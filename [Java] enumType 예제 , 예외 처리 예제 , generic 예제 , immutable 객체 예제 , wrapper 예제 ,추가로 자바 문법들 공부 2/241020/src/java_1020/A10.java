package java_1020;

import java.util.Optional;

public class A10{
	public static void main(String[] args) {
		Optional<String> isThisNull = getSomeString();

		isThisNull.ifPresent(str -> System.out.println(str.toUpperCase()));
		
		//of는 null 값 허용 안함
		Optional<String> nonNullOption = Optional.of("HELLO");
		
//		value가 null인 경우, Optional은 빈 값을 나타내는 Optional.empty() 객체를 생성
//		value가 null이 아닌 경우, 주어진 값을 포함한 Optional 객체를 생성
		Optional<String> nullableOptional = Optional.ofNullable(null);
		Optional<String> emptyOptional = Optional.empty();
		
		System.out.println(nonNullOption);
		System.out.println(nullableOptional);
		System.out.println(emptyOptional);
		
	}
	
	//Optional 클래스 : null 처리할때 발생할 수 있는 오류(=NULL POINTER 익셉션)를
//	방지 하고 처리
	private static Optional<String> getSomeString(){
		return Optional.empty();
	}
	
}
	





