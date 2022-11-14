package ch11.sec07_string;

/**
 * 
 *  00:00~23:59 까지 표시되는 디지털 시계가 있다.
 *  디지털 시계에서 3이 표시되는 시간은 몇초인가?
 *  
 *  반복문+ 인덱스 확용
 *  시간:0~23
 *  분:0~59 
 * 문자열에서 3이 있으면 60초 증가
 */
public class Q01_DgitalClock {

	public static void main(String[] args) {

		int seconds = 0;
		for (int hour = 0; hour <= 23; hour++) {
			for (int minute = 0; minute <= 59; minute++) {
				String timeStr = hour + ":" + minute;
				if (timeStr.indexOf("3") >= 0)
					seconds += 60;
			}
		}
		System.out.println("디지털 시계에 3이 표시되는 시간" + seconds + " 초");
	}
}
