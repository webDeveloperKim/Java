package java_1020;

import java.util.ArrayList;
import java.util.List;

public class A11{
	public static void main(String[] args) {
		List<String> es = new ArrayList<>();
		
		es.add("public");
		es.add("public2");
		es.add("public3");
//		람다형식으로 표현
//		메서드를 계속 체이닝해서 씀 값을 담아서 쓰는게 아니라
//		stream 은 컬렉션이 가지고 있는 메서드
		es.stream().forEach(str -> System.out.println(str));
	}
}
	





