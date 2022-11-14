package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Try - With - Resource
 * 
 * Try로 Open한 Resource를 자동으로 close 해줌
 *
 */
public class Ex08_TryWithResource {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("Ex01_NullPointer.java")) {
			fis.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

// try/catch 사용했더니 너무 만사 다 붙어서 다시 작성함
//	public static void main(String[] args) {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("Ex01_NullPointer.java");
//			// 뒤에 줄이 생기면 surround with Try/catch block 기능 추가
//				fis.read();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
