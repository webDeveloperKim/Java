package java_1020;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A12{
	public static void main(String[] args) {
		Integer[] interArr = new Integer[] {1,2,3,4,5,6,7};
		
//		Arrays.asList()는 배열을 List 로 변환하는 메서드입니다.
		List<Integer> list = Arrays.asList(interArr);
		
		List<Integer> eventList = list.stream()
				.filter(value -> value % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(eventList);
	}	
}





