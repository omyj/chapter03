package chapter03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();

		list.add("둘리");
		list.add("마이콜");
		list.add("고길동");

		list.remove("고길동");

		int count = list.size();
		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
	}

}
