package ch11.sec18_dataTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

//import java.time.* 으로 표시를 해도 사용가능하지만 교육의미와 사용기능 확인을 위해 두는걸로.

public class Ex02_Creation {

	public static void main(String[] args) throws InterruptedException {
		// 날짜
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate examDay = LocalDate.of(2022, 11, 17);
		System.out.println(examDay);
		
		// 시간
		LocalTime curTime = LocalTime.now();
		System.out.println(curTime);
		LocalTime lunchTime = LocalTime.of(11, 50); 
		// 뒤에 0, 0 으로 초, 밀리초 넣어도 출력됨->오버로딩 되어있다는 얘기
		System.out.println(lunchTime);
		
		// 날짜+시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		LocalDateTime christmas = LocalDateTime.of(2022, 12, 25, 0, 0);
		System.out.println(christmas);
		
		// Timezone
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC")); //UTC-국제표준시
		System.out.println(utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDateTime); // 나노초까지 나오고 시차가 9시간인것도 알려줌
		
		// Timestamp
		Instant is1 = Instant.now();
		Thread.sleep(10);
		Instant is2 = Instant.now();
		System.out.println(is1.until(is2, ChronoUnit.NANOS));
		System.out.println(is1.isBefore(is2));
		System.out.println(is1.isAfter(is2));
	}

}
