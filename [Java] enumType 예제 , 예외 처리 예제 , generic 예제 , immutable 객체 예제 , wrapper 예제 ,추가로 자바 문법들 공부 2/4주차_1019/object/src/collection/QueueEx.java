package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

//	메서드	설명
//	add(E e)	큐의 맨 뒤에 요소 추가. 큐가 가득 차면 예외 발생.
//	offer(E e)	큐의 맨 뒤에 요소 추가. 큐가 가득 찬 경우 예외 대신 false 반환.
//	remove()	큐의 맨 앞 요소 제거. 큐가 비어 있으면 예외 발생.
//	poll()		큐의 맨 앞 요소 제거. 큐가 비어 있으면 null 반환.
//	element()	큐의 맨 앞 요소 반환. 큐가 비어 있으면 예외 발생.
//	peek()		큐의 맨 앞 요소 반환. 큐가 비어 있으면 null 반환.
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		
		queue.add("First");
		queue.add("Second");
		queue.add("Third");
		queue.add("Fourth");
		
		System.out.println(queue);
		
		while (!queue.isEmpty()) {
			String item = queue.poll();//큐 첫번째 요소 제거 후 반환			
			System.out.println("--");
			System.out.println(item);
		}
		System.out.println(queue);
		
		
	}

}
