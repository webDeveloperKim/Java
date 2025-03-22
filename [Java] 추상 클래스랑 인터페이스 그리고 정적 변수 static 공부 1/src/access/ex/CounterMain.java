package access.ex;

public class CounterMain {

	public static void main(String[] args) {
		MaxCounter counter = new MaxCounter(5);
		
		counter.increament();
		counter.increament();
		counter.increament();
		counter.increament();
		counter.increament();
		counter.increament();
		
//		5가 최대까지 count 변수에 저장되고 if 문을 빠져나와서 최종 출력되는 count 변수 값은 5
		System.out.println(counter.getCount());

	}

}
