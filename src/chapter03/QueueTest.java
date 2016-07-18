package chapter03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("둘리"); // 둘리
		queue.offer("마이콜");  // 둘리 마이콜

		System.out.println(queue.size()); // 2
		System.out.println(queue.peek()); // 둘리 마이콜  ; peek: 둘리

		queue.offer("도우넛"); // 둘리 마이콜 도우넛

		System.out.println(queue.poll()); // 마이콜 도우넛 ; poll: 둘리
		System.out.println(queue.size()); //2 

		while (queue.isEmpty() == false) {
			System.out.println(queue.poll());  // poll: 마이콜 도우넛
		}

	}
}
