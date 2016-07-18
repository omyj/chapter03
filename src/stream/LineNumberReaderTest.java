package stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderTest {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("./src/chapter03/LineNumberReaderTest.java");
			LineNumberReader lnr = new LineNumberReader(fr);

			String s = null;
			while ((s = lnr.readLine()) != null) {
				String line = String.format("%3d:%s", lnr.getLineNumber(), s);
				System.out.println(line);
			}
			
			lnr.close(); // 보조스트림을 사용할땐 한개만 닫아주면 fr까지 닫아줌
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
