package chapter03;

public class FormatterTest {
	public static void main(String[] args) {
		String name = "김대준";
		int score = 100;
		System.out.println(name + ", "+ score);
		System.out.println(String.format("학생 %s는자바시험을 %d점 받았습니다", name, score));
	}
}
