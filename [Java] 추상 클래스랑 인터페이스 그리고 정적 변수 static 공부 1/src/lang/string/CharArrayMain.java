package lang.string;

import java.util.Arrays;

public class CharArrayMain {

	public static void main(String[] args) {
		char[] charArr = new char[] {'h','e','l','l','o'};
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = "        hello          ";
	//	char[] charArr = {'h','e','l','l','o'};
	//	char[] charArr = new char[5];
	//  charArr = {'h','e','l','l','o'};
		
		System.out.println(charArr.length);
		
		//문자열에서 특정 위치의 문자를 반환
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		System.out.println(str1.charAt(4));		
	
		//특정 부분을 추출(substring)**하고, 그 결과를 콘솔에 출력
		System.out.println(str2.substring(0));
		System.out.println(str2.substring(1));
		System.out.println(str2.substring(2));
		System.out.println(str2.substring(3));
		
		//문자열 str2에서 지정된 범위의 부분 문자열을 추출하여 출력 
		//substring(int beginIndex, int endIndex) 메서드는 
		//문자열의 beginIndex부터 endIndex - 1까지의 부분 문자열을 반환
		System.out.println(str2.substring(2,4));
		
		//문자열 str2에서 문자 "e"의 **첫 번째 등장 위치(인덱스)**를 찾아 출력
		System.out.println(str2.indexOf("e"));
		
		//문자열 str1과 str2를 이어붙인 결과를 콘솔에 출력
		System.out.println(str1.concat(str2));
		System.out.println(str3);
	
		//문자열 str3의 앞뒤 공백을 제거하고 그 결과를 콘솔에 출력
		System.out.println(str3.trim());
	
		//문자열 str1과 str2를 포함하는 문자열 배열을 생성하고, 그 배열을 strs 변수에 할당
		String[] strs = {str1,str2};
		
		String s1 = "";
		for(int i = 0; i <= strs.length -1; i++) {	
			s1 += strs[i];
		}
		System.out.println(s1);
		
	
		//strs 배열의 요소들을 문자열로 변환하여 s1 변수에 저장
		System.out.println(strs);
		s1 = Arrays.toString(strs);
		System.out.println(s1);
		}
	}