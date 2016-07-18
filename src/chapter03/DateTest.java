package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date now = new Date(); // 현재 날짜 시간정보 얻기
		
		// SimpleDateFormat 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss"); //2016년 07월 14일 오전 09:20:59
		System.out.println(sdf.format(now));

		// 메소드 사용 (deprecated)
		printDate(now);

		Date d = new Date(1192311932L);
		printDate(d);
	}

	private static void printDate(Date date) {
		// TODO Auto-generated method stub

		System.out.print((date.getYear() + 1900) + "년 ");
		System.out.print((date.getMonth() + 1) + "월 ");
		System.out.print((date.getDate()) + "일 ");
		System.out.print((date.getHours()) + ":");
		System.out.print((date.getMinutes()) + ":");
		System.out.println((date.getSeconds()));
	}
}
