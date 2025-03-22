package wrapper;

import java.util.ArrayList;
public class WrapperEx1 {
//	객체 만들고 호출할때 main 메서드 필요
	public static void main(String[] args) {
			
		Integer integer = 10; // 오토박싱 : 기본 타입을 랩퍼 타입에 넣었을때 허용하는걸 
		//컬렉션 안에서 기본 타입을 못 넣어서 랩퍼 클래스를 사용하는거
		
		//오토언박싱 : 랩퍼타입을 기본형에 넣는것
		//랩퍼로 들어가는 것 자체가 박싱
		int a = Integer.valueOf(10);
		
		//앞에 이미 Integer 를 제너릭에 표현 해줬기 때문에 뒤에는 생략함
		ArrayList<Integer> numberList = new ArrayList<>();
		
	//	배열 리스트에 값을 하나씩 추가할때 add 메서드 호출해서 넣을수 있음
	//	20이라는 리터럴 값이나 integer 라는 랩퍼 타입 둘다 넣을 수 있음
		numberList.add(integer);
		numberList.add(20);
		
		System.out.println(numberList.get(0));
		System.out.println(numberList.get(1));
		
	//	숫자를 저장하는 방식이 똑같은데 객체처럼 쓰는것 뿐임
		int sum = numberList.get(0) + numberList.get(1);
		
		System.out.println("sum : " + sum);
		
	}
}
