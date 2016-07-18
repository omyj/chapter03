package stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboarTest {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "utf-8"));

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				if (line.equals("quit"))
					break;
			}
			br.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}

	}
}
