package chapter03;

public class LangCalssTest {
	public static void main(String[] args) {
		Point p1 = new Point(10 , 20);
		Point p2 = new Point(50 , 100);
		Point p3 = p1;
		
		//Object <- Point 
		System.out.println( p1.getClass().getName()); //getClass(); 클래스 정보를 가져옴
		System.out.println( p1.hashCode() ); //정형화된 String을 int로 변환
		System.out.println( p1.toString() ); //chapter03.Point@1db9742

		System.out.println( p1 );
		
		System.out.println( p1 == p2 );
		System.out.println( p1 == p3 );
		
		Point p4 = new Point(10, 20);
		System.out.println( p1 == p4 );      // false
		System.out.println( p1.equals(p4) ); // false

		System.out.println(p1.hashCode());
		System.out.println(System.identityHashCode(p1));
		
		String s1 = new String( "Hello" );
		String s2 = new String( "Hello" );
		
		System.out.println( s1 == s2 );		 // false
		System.out.println( s1.equals(s2) ); // true; 오버라이딩 된 eqluals()를 사용함
		System.out.println( s1.toString() ); // Hello; String에서 toString()가 오버라이딩이 됨 
		
	}
}
