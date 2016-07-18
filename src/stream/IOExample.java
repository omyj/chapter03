package stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.Socket;
import java.util.Arrays;

public class IOExample {
	public static void main(String[] args) {
		
		byte[] src = { 'a', 1, 2, 3, 4, 5 };
		ByteArrayInputStream bais = new ByteArrayInputStream( src );
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int data = -1;
		while ( (data = bais.read() ) != -1) {
			baos.write( data );
		}
		
		byte[] dest = baos.toByteArray();
		System.out.println(Arrays.toString(dest));
		
	}
}
