package chapter03;

public class WrapperClassTest2 {
	public static void main(String[] args) {
		//Boxing
		Integer i = new Integer( 10 );
		System.out.println("Boxing : "+ i );
	
		//UnBoxing
		int j = i.intValue();
		System.out.println("UnBoxing : "+ j );
	
		//Auto Boxing
		Integer i2 = 10;
		System.out.println("AutoBoxing : "+ i2 );
		
		//Auto UnBoxing
		int j2 = i + 10; // i를 UnBoxing 한 후 10을 더함
		System.out.println("AutoUnBoxing : "+ j2 );
	
	}
}
