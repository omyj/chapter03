package chapter03;

public class StringTest {
	public static void main(String[] args) {
		// 이스케이프 문자 사용
		char c = '\'';
		String s = "He\"llo\" World";  // "을 문자열로 넣을때는 \" 를 사용
		
		System.out.println( s );
	
		// +연산
		System.out.println( "Hello" + "World" + 2 ); // "Hello","World" 객체 생성
		
		StringBuffer sb = new StringBuffer( "Hello" );
		sb.append( "World" );
		sb.append( 2 );
		System.out.println(sb);
	}
}
