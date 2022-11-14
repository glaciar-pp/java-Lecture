package ch11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Ex16_SimpleDateFormat {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분ss초");
		System.out.println(sdf.format(now));
	}

}

// 시 구분할땐 H는 24시 기준, h는 12시 기준
// 시 앞 a를 붙이면 오전 오후 구분
