package ch11.sec07_string;

import java.io.UnsupportedEncodingException;

public class Ex03_GetBytes {  //잘 쓰는 기능은 아님!

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "안녕하세요?";
		
		// 기본 확인
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);		//16(UTF-8 encoding되어있음), str의 바이트 수
		String strFromByteArray = new String(bytes1);
		System.out.println(strFromByteArray);		//안녕하세요? 가 돌아옴
		System.out.println();
		
		//EUC-KR 변형 확인, EUC-KR는 한글자에 2바이트씩 잡음!
		byte[]bytes2 = str.getBytes("EUC-KR");
		System.out.println(bytes2.length);
		strFromByteArray = new String(bytes2, "EUC-KR");
		System.out.println(strFromByteArray);	
		System.out.println();
	}

}
