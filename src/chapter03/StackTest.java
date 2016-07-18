package chapter03;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("둘리"); // 둘리
		stack.push("도우넛"); // 둘리 도우넛
		System.out.println(stack.peek()); // 둘리 도우넛	; peek:도우넛
		stack.push("마이콜"); // 둘리 도우넛 마이콜
		System.out.println(stack.pop()); // 둘리 도우넛 ; pop:마이콜
		stack.push("고길동"); /// 둘리 도우넛 고길동

		
		while( stack.isEmpty() == false ){
			System.out.println(stack.pop());

		}
	}
}
