package object;

import java.util.Objects;


//Objects.hash()는 Java 의 java.util.Objects 클래스에 포함된 유틸리티 메서드로, 
//주어진 인자들을 기반으로 해시 코드를 계산합니다.
//이 코드에서는 name 필드를 이용해 해시 코드를 계산합니다. 
//name 이 String 타입이라면, Objects.hash(name)은 name 의 값을 기반으로 해시 값을 생성합니다.


public class ObjectEx {
	private String name;

	public ObjectEx(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "ObjectEx [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null && getClass() != obj.getClass()) return false;
		
		ObjectEx other = (ObjectEx) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
