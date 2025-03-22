package generic;
public class DataprocessorMain {
	public static void main(String[] args) {
		Dataprocessor<String> dataprocessor = new Dataprocessor<>();
	
		dataprocessor.processData("앱개발");
		
		Dataprocessor<Integer> dataprocessor2 = new Dataprocessor<Integer>();
		dataprocessor2.processData(123);
	}
}
