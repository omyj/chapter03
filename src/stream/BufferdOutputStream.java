package stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdOutputStream {
	public static void main(String[] args) {
		try {
			// FileOutputStream fis = new FileOutputStream( "123.txt" ); //주 스트림
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("123.txt"));

			for (int i = 49; i < 57; i++) {
				bos.write(i); // 1~8 까지 작성
			}
			// bos.flush(); //내부 버퍼의 내용을 파일에 적용
			bos.close(); // 닫을때 자동으로 flush()를 함
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
