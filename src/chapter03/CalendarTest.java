package chapter03;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();  // calendar 정보 추출 (추상클래스)
//		System.out.println(calendar);
		printDate(calendar);
		
		//calendar set()으로 오버로드
//		calendar.set(2017, 0, 1);
//		printDate( calendar );
		
//		calendar.set( Calendar.YEAR, 2017 ); //년도 바뀌면서 요일도 바뀜
//		printDate( calendar );
	
		// 우리가 만날지 100일 째 되는 날 
		calendar.set( 2016, 07, 14 );
		calendar.add( Calendar.DATE, 100);
		
		printDate( calendar );
	}

	public static void printDate(Calendar calendar) {
		final String [] DAYS = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.print(calendar.get(Calendar.YEAR) + "년 ");
		System.out.print((calendar.get(Calendar.MONTH) + 1 ) + "월 ");
		System.out.print(calendar.get(Calendar.DATE) + "일 ");
		
		System.out.print(DAYS[calendar.get(Calendar.DAY_OF_WEEK) - 1 ]+ "요일 ");
		System.out.print((calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM") + " ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println("\n");
	}
}
