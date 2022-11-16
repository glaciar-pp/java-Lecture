package ch18_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_OutputSrtream {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("/temp/test.db");

			byte a = 10, b = 20;
			int c = 30; 		//실제로는 1바이트씩만 써짐..!
			os.write(a);
			os.write(b);
			os.write(c);

			byte[] array = { 10, 20, 30, 40, 50 };
			os.write(array);

			os.write(array, 1, 13);
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
