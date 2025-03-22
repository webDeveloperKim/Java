package exception.ex;
// 클라이언트는 요청하는 사람
// 요청을 받는 사람 및 응답하는 사람은 서버
public class NetworkServiceVO {
	public void sendMessage(String data) {
//		모든 클라이언트의 요청은 http 를 통해서 온다.
		String address = "http://example.com";
		NetworkClientVO clientVO = new NetworkClientVO(address);
		
		clientVO.connect();
		clientVO.send(data);
		clientVO.disconnect();
		
	}
}
 
