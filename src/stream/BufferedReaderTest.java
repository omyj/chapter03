package stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("./src/stream/BufferedReaderTest.java");
			BufferedReader br = new BufferedReader(fr);

			String s = null;
			int index = 0;
			
			while ((s = br.readLine()) != null) {
				String line = String.format("%3d:%s", ++index, s);
				System.out.println(line);
			}
			
			br.close(); // 보조스트림을 사용할땐 한개만 닫아주면 fr까지 닫아줌
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
