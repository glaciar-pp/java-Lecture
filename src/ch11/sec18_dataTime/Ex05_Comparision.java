package ch11.sec18_dataTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex05_Comparision {
//날짜 및 시간 비교
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2022, 10, 24, 9, 0);
		System.out.println(startDateTime);
		LocalDateTime endDateTime = LocalDateTime.of(2023, 3, 8, 18, 0);
		System.out.println(endDateTime);

		System.out.println(startDateTime.isBefore(endDateTime));
		System.out.println(startDateTime.isAfter(endDateTime));

		// 크로노 타임 기준으로 시작일에서 끝날까지 일수로 몇일 남았는지?
		System.out.println(startDateTime.until(endDateTime, ChronoUnit.DAYS));
		// 시작일부터 종료일까지 얼마나 남았는지?
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());

		Duration duration = Duration.between(startDateTime, endDateTime);
		System.out.println(duration.getSeconds());

	}

}
