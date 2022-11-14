package ch11.sec18_dataTime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Ex04_Operation {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime target = now		
		// 마침표로 메소드를 연속으로 이어 나가는걸 method chaining 이라고함
				.plusYears(3)
				.minusMonths(8)
				.minusDays(0)
				.minusHours(2)
				.plusMinutes(10);
		System.out.println(target);
		
		// 상대 변경
		target = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(target);
		target = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY)); //돌아오는 요일
		System.out.println(target);
		target = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		System.out.println(target);

	}

}
