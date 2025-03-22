package exception.ex;
// 클라이언트는 요청하는 사람
// 요청을 받는 사람 및 응답하는 사람은 서버
public class NetworkServiceVO2 {
	public void sendMessage(String data) {
//		모든 클라이언트의 요청은 http 를 통해서 온다.
		String address = "http://example.com";
		NetworkClientVO2 clientVO2 = new NetworkClientVO2(address);
		
		clientVO2.connect(data);
		clientVO2.send(data);
		clientVO2.disconnect();
		
	}
}
 
