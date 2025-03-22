package access;

public class Speaker {
	// private int volume : 캡슐화
	// default 는 앞에 없으면 기본으로
	// 같은 패키지 안에서만 사용 
	// protected 는 class 랑 메서드 두가지에만 적용
	// 상속을 받으면 패키지가 달라도 호출 할 수 있는 제어자
	int volume;
	
	public Speaker(int volume) {
		this.volume = volume;	
	}
	// 볼륨 높이기
	// 아무것도 없음 default
	void volumeUp() {
		if(volume >= 100) {
			System.out.println("최대음량으로 증가할 수 없음");
		}else {
			volume += 10;
			System.out.println("음량 10 증가");
		}
	}
	// 볼륨 낮추기
	void volumeDown() {
		volume -= 10;
		System.out.println("음량 10 감소");
	}
	// 현재 음량 보여주기
	// private 는 같은 클래스에서만 , 변수에 주로 씀
	// 캡슐화 굳이 밖에 노출 필요 없으면 메서드에도 프라이빗
	void showVolume() {
		System.out.println("현재음량 : " + volume);
	}
}
