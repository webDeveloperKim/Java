package lang;

public class UserV1 {
	public String id;
	public UserV1(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		//내 클래스의 참조값이랑 매개변수로 받은 객체 인스턴스랑 같으면
//		return true 
//		같지 않으면 return false
//		super.equals(obj)는 **참조가 같으면 true, 다르면 false**를 반환
//		이미 if (this == obj) 조건에서 참조가 같은 경우를 처리 했으므로,
//		super.equals(obj)가 호출되는 시점에서는 참조가 항상 다름 
//		따라서 super.equals(obj)는 항상 false를 반환
		
		if(this == obj) {
			return true;
		}
		//run 타임에 돌아가는 클래스 타입 알려줌
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		return super.equals(obj);
		//return Object.equals(obj); //실행이 안됨
	}
	
}
