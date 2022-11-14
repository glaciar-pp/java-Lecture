package ch06;

import java.time.LocalDate;
//이 표시는 자바 디렉토리 하위에 time...그 하위에 LocalDate 가 있음을 보여줌
import ch04.Ex24_Diamond;
//diamond 부르니까 추가되었음!
// 번호 옆에 +기호는 내용에 대해 접고펴고 할수 있음! 작업 다하고 볼 필요 없을때 접어두면 깔끔해져서 보기 편함..

public class Ex21_Package {

	public static void main(String[] args) {
		LocalDate a = LocalDate.now();
//		Exercise ex05 = new Exercise();  
		// ch06 package(강사님 기준..난 없는 파일)
//		ch05.Exercise ex05 = new ch05.Exercise(); 
		// 이런식으로 같은 이름이 있을땐 패키지까지 구분해주면 됨 그럼 다른 클래스인것을 인식.
		Ex24_Diamond diamond = new Ex24_Diamond();
		// import 해주면 패키지명 생략 가능!

	}

}
