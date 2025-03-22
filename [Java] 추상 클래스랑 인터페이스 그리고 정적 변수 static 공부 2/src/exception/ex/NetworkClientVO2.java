package exception.ex;
// 클라이언트는 요청하는 사람
// 요청을 받는 사람 및 응답하는 사람은 서버
public class NetworkClientVO2 {
	private final String address;
	public boolean connectError;
	public boolean sendError;
	
	public NetworkClientVO2(String address) {
		this.address = address;
	}
	
//	서버 연결하는 메서드 ( + 데이터 값이 유효한지 initError()로 확인)
	public String connect(String data) {
		initError(data);
		if(connectError) {
			System.out.println(address + "서버연결 실패");
			return "connectError";
		}
		
		System.out.println(address + "서버 연결 성공");
		return "success";
	}
	
	public String send(String data) {
//		initError(data);
		if(sendError) {
			System.out.println(address + "서버 데이터 전송 실패" + data);
			return "sendError";
		}
		System.out.println(address + "서버에 데이터 전송" + data);
		return "success";
	}
	
//	연결해제
	public void disconnect() {
		System.out.println(address + "서버연결해제");
	}
	//초기화 실패 메서드
//	초기화 에러 (이상한 데이터값 받았을 때 오류 발생)
	public void initError(String data) {
		//contains 는 String이 갖고 있는 메서드
		if(data.contains("error1")) {
			connectError = true;// 연결 에러 상태
		}
		if(data.contains("error2")) {
			sendError = true; // 데이터 전송에러
	}

  }

}
