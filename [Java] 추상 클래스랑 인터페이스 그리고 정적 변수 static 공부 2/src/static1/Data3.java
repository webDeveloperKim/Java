package static1;

public class Data3 {
	public String name;
	//static 변수는 클래스 로딩 시 한 번 생성되며, 클래스 내 모든 객체가 공유
	//동일한 클래스에서 생성된 객체들이 모두 count 라는 하나의 변수를 사용
	//static 변수는 객체를 생성하지 않아도 클래스명.변수명을 통해 접근 가능
	//ex) Data3.count;
	public static int count;
	
	public Data3(String name) {
		this.name = name;
		count++;
	}
	
}
