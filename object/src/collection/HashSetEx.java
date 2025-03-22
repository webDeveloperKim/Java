package collection;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("Python");
		set.add("Java");
		
		// 중복 값은 제거
		System.out.println(set);
		
		// set 에 저장된 값 순차적으로 꺼내오기
		for (String str : set) {
			System.out.println(str);
		}
		
		System.out.println();
		
		// set 값들 중에서 Python 이랑 같은 값이 있는 지 확인 
		System.out.println(set.contains("Python"));		
	}

}
