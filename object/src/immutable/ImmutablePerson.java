package immutable;

//불변 객체 : final 로 선언하고 setter 메서드가 없습니다.(= 객체 불변하게 함)

public class ImmutablePerson {
	private final String name;
	private final int age;

	// 새로운 이름값이 들어오면서 새로운 객체가 만들어졌다
	// 불변 객체인데 바꿀때 의미로써 사용한다
	public ImmutablePerson withName(String name, int age) {
		return new ImmutablePerson(name,age);
	}
	
	public ImmutablePerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
