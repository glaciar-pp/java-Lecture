package ch15_Collection.sec05_properties;

import java.io.IOException;
import java.util.Properties;

public class Ex01_Properties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		
		// database.properties 파일 로드
		//파일을 읽을때 자바는 예외처리가 반드시 필요함
		prop.load(Ex01_Properties.class.getResourceAsStream("database.properties"));
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("admin"));

	}

}
