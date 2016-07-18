package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		try {
			
			// Character(문자열) 기반 스트림
			FileReader fr = new FileReader( "test.txt" );
			
			int data = -1;
			while( (data = fr.read()) != -1 ){
				System.out.print((char)data);
			}
			fr.close();
			
			System.out.println("");
			
			// Byte 기반 스트림
			FileInputStream fis = new FileInputStream( "test.txt" );
			while( (data = fis.read()) != -1 ){
				
				System.out.print( (char)data );
			}
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
