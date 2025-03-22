package study1;

public class Input3 {

	public static void main(String[] args) {
	
//		x , y 에 각각 값을 할당 한다.
		int x = 5;
		int y = 3;
		
		//System.out.printf("x+y=%d+%d\n",x,y);
		//System.out.printf("x-y=%d-%d\n",x,y);
		//System.out.printf("x*y=%d*%d\n",x,y);
		//System.out.printf("x/y=%d/%d\n",x,y);
		
//		x , y 연산 값을 출력 
		System.out.println("x+y= " + x+y);
		System.out.println("x+y= " + (int)(x+y));
		System.out.println("x+y= " + (x+y));
		System.out.println("x+y= " + (int)(x+y));
		
//		문자열 결합 출력
		String str = 2 + "학년" + 10 + "반";
		System.out.println(str);
		String str2 = "학년" + 2 + 10;
		System.out.println(str2);
		
		
	}

}