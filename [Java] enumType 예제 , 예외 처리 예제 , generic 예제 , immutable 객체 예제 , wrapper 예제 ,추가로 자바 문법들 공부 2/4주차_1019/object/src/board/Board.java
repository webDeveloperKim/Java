package board;

import java.util.ArrayList;

// 게시판 관리하는 클래스( = 여러 개의 게시글을 관리 = 게시글 추가 & 삭제 기능 담당 )
public class Board {
	// ArrayList 타입
	// private:
	// 접근 제어자(Access Modifier)로, 해당 필드가 현재 클래스 내부에서만 접근 가능하도록 설정합니다.
	// 외부 클래스나 같은 패키지의 다른 클래스에서는 접근할 수 없습니다.
	// ArrayList<Post>:
	// Java의 **ArrayList**는 동적 배열로, 크기를 고정하지 않고 동적으로 변경 가능한 리스트를 의미합니다.
	// <Post>는 **제네릭(Generic)**으로, 이 ArrayList가 Post 타입의 객체만 저장할 수 있음을 나타냅니다.
	// 즉, Post 클래스의 객체만 리스트에 추가될 수 있습니다.
	// list:
	// list 는 필드의 이름입니다.
	// Post 객체를 담는 ArrayList의 변수명으로 사용됩니다.
	private ArrayList<Post> list;
	
	// 생성자 1 ( 둘 중 아무거나 편한걸로)
//	public Board(ArrayList<Post> list) {
//		this.list = list;
//	}
	//생성자 2 ( 둘 중 아무거나 편한걸로)
//	이 생성자는 Board 클래스의 객체가 생성될 때 list 필드를 빈 ArrayList로 초기화 합니다.
//	이렇게 하면 list는 초기값이 null인 상태를 방지하고, 바로 사용할 수 있게 됩니다.
	public Board() {
		list = new ArrayList<>();
	}
	
	// 게시글 추가하는 add() 메서드
	// title, content 값 받아서 Post 객체 생성
	// 생성한 객체를 ArrayList에 add()하여 추가
	public void addPost(String title, String content) {
		Post post = new Post(title, content);
		list.add(post);
		
		System.out.println("게시글 등록 성공");
	}
	
	
	// 게시글 보여주는 viewPosts() 메서드
	// list 객체가 null이 아닐때만 객체출력	
	public void viewPosts() {
		if(list.isEmpty()) {
			System.out.println("게시글 없음");
			return;
		}
		for (Post post : list) {
			System.out.println(post);
		}
	}
	
	//	list 객체가 null이 아닐때만 출력
	
	// 게시글 삭제하는 deletePost() 메서드
	// 특정 게시글 id 값으로 특정 게시글 삭제	
	public void deletePost(int id) {
		Post target = null;
		
		//list 순회하면서 id 값이 같은지 확인하고
//		id값 같은 글만 삭제
		for (Post post : list) {
			if(post.getId()==id) {
				target = post;
				break;
			}
		}
		
		if(target != null) {
			list.remove(target); 
			System.out.println("글 삭제 완료");
		}else {
			System.out.println("없는 게시글 입니다");
		}
	}
	
	
}
