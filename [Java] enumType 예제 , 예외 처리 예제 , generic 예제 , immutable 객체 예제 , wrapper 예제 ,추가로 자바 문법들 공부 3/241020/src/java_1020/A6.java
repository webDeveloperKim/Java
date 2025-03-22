package java_1020;

import java.util.ArrayList;
import java.util.List;

public class A6{
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		
		System.out.println(list);
		
//		list.indexOf("void")를 호출하여 "void"라는 요소가 
//		list 에서 첫 번째로 나타나는 위치(인덱스)를 반환합니다.
		int voidIndx = list.indexOf("void");
		System.out.println(voidIndx);
		
	}
}




