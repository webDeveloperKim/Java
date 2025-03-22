package exception.ex;
// 클라이언트는 요청하는 사람
// 요청을 받는 사람 및 응답하는 사람은 서버
public class NetworkClientVO {
	private final String address;
	
	public NetworkClientVO(String address) {
		this.address = address;
	}
	
	public void connect() {
		System.out.println(address + "서버 연결 서공");
	}
	
	public String send(String data) {
		System.out.println(address + "서버에 데이터 전송" + data);
		return "success";
	}
	public void disconnect() {
		System.out.println(address + "서버 연결 해제");
	}
}
