package nested;

public class AnoymousClass {
	public static void main(String[] args) {
		Greeting greeting = new Greeting() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello, world");
			}
		};
		greeting.sayHello();
	}
}
