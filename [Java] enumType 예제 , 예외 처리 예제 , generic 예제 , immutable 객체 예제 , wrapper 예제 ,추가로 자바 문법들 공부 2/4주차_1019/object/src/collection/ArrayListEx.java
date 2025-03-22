package collection;

import java.util.ArrayList;

// 자주쓰는 컬렉션 프레임 워크 클래스
// ArrayList : 순서가 있는 데이터 관리 , 인덱스를 통한 빠른 접근 가능 (중복 ㅇ)
// HashMap : 키-값(key-value)쌍으로 데이터 저장하여 빠른 탐색 가능 (키중복 x, 값중복ㅇ)
// HashSet : 중복 허용하지 않고 유일한 데이터를 저장시 사용 (유일 데이터이므로 순서 상관 x)
// LinkedList : 추가/삭제가 빈번한 경우에 효율적,노드 기반 리스트
// Queue : 선입선출 (먼저 들어온 데이터 먼저 처리) 방식의 자료구조, 줄서기 (=대기열) 와 같은 작업처리시 유용


public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("가방1");
		arrayList.add("가방2");
		arrayList.add("가방3");
		arrayList.add("가방4");
		
		//System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.get(3));
		
		
	}
}
