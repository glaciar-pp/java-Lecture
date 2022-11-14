package ch11.sec05_System;

import java.util.Properties;
import java.util.Set;

public class Ex02_Property {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userhome = System.getProperty("user.home");
		System.out.println(osName + "," + userName + "," + userhome);
		System.out.println();
		
		Properties props = System.getProperties();
		Set keys = props.keySet(); //세트...중복이 없음이 특징
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println(key + ": " + value);
		}

	}

}
