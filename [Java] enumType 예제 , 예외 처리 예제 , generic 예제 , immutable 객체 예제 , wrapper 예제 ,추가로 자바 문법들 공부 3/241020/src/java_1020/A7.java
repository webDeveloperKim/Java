package java_1020;

public class A7{
	
	public static void main(String[] args) {
		String str = new String("is same");
		String str2 = new String("is same");
	
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		
		//같은 문자열은 내부적으로 스트링툴 하나의 객체 & 참조 주소로 재사용해서 같다고 나옴
		String str3 = "is same";
		String str4 = "is same";
		
		System.out.println(str3 == str4);
		
	}
}




