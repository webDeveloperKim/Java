package java_1006;

public class MusicPlayerData {

	int volume;
	boolean isOn = false; 
	String st = "";
	int aa = 0;
	
	//void 반환 타입 없음 ( 즉 기능만 동작 ) 
	static String on(int aa) {
		return "아아아";
	}
	static void off(MusicPlayerData data) {
		data.isOn = false;
	}
	static void volumeUp(MusicPlayerData data) {
		data.volume++;
	}
		
}


