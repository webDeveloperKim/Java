package java_1006;

public class MusicPlayerDataMain {

	public static void main(String[] args) {
		
//		MusicPlayerData 클래스를 사용하기 위해 객체 data 생성 
		MusicPlayerData data = new MusicPlayerData();
		
//		data 변수 값 지정
		data.isOn = false;
		data.volume = 0;
		String result = "";
		
//		data 인스턴스의 on 메서드 호출해서 반환 값을 result 에 담기
		result = data.on(10);
		
//		result 값 출력 
		System.out.println(result);
		
	}
			
}