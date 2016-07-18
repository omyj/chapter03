package chapter03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	
	set.add("둘리");
	set.add("마이콜");
	set.add("도우넛");

	System.out.println( set.size() );

	set.add("마이콜"); // 중복set값 들어가지 않음
	set.add("도우넛");  // 중복set값 들어가지 않음

	System.out.println( set.size() );
	
	 // set 존재유무 확인
	System.out.println( set.contains("마이콜")); // true
 	System.out.println( set.contains("고길동")); // false
 	
 	// 전체 가져오기
 	Iterator<String> it = set.iterator();
 	while ( it.hasNext() ) {
 		String s = it.next();
 		System.out.println( s );
 	}
 	
}
}
