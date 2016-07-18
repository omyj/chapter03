package chapter03;

public class StringTest4 {
	public static void main(String[] args) {

		String str = "aBcAbCabcABC";

		System.out.println( str.substring(3) ); // 3번째 문자열부터 출력
		System.out.println( str.substring(2, 5)); // 3번째 문자열부터  5번째 문자열까지 출력
		System.out.println( str.indexOf( 'A' )); // A문자의 인덱스
		System.out.println( str.indexOf( "abc" )); // abc문자열의 시작 인덱스
		System.out.println( str.length()); // 문자열 길이
		System.out.println( str.replace( 'a' , 'R' )); // a문자를 R로 모두 변경
		System.out.println( str.replaceAll( "a" , "R" )); // a문자를 R로 모두 변경
		System.out.println( str.toUpperCase() ); // 문자열의 소문자를 모두 대문자로 변경
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//문자열 결합
		a = a.concat( b ); // a객체의 문자열에 뒤에 b객체의 문자열을 붙임 
		System.out.println( a );
		
		a = a.trim(); // 문자열 앞뒤 공백제거
		System.out.println("----" + a + "----");

		 //문자열 분리
		String[] as = a.split( "," ); // " " 공백값일 경우에도 문자열 전체를 배열에 삽입해줌 (Null Check 안해도됨)
		for (String s : as) { 
			System.out.println(s);
		}
	}
}
