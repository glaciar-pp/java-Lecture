package mysql.bbs;

import org.mindrot.jbcrypt.BCrypt;

/**
 * BCrypt = One Way 방식
 * $2a: BCrypt version 정보
 * $10: 라운드 정보(관련 정보)
 * 그 다음 $ 이후가 salt 기능에 의해 생긴 랜덤 문자
 *
 */
public class BCryptExample {

	public static void main(String[] args) {
		String pwd = "1234asdf";
		
		String cryptedPwd = BCrypt.hashpw(pwd,BCrypt.gensalt()); 
		//hashpw가 해쉬코드를 바탕으로 암호문을 만들게 함
		System.out.println(cryptedPwd.length()); //60글자 나옴, 테이블에서 PWD 설정시 길이 60으로 설정한 이유
		System.out.println(cryptedPwd);
		
		String cryptedPwd2 = BCrypt.hashpw(pwd,BCrypt.gensalt()); 
		//같은 비밀번호여도 달라지는데, 그 이유는 gensalt가 사이사이에 쓸모없는 글자를 섞어넣어주기 때문!
		System.out.println(cryptedPwd2);
		String salt = BCrypt.gensalt();
		System.out.println();

		System.out.println(salt);
		System.out.println(salt.length());
		System.out.println();
		
		//동일한 salt로 비문화 -> 만들어진 비문이 동일한 결과가 나옴
		System.out.println(BCrypt.hashpw(pwd, salt));
		System.out.println(BCrypt.hashpw(pwd, salt));
		System.out.println();
		
		//패스워드가 동일한지 확인
		boolean result = BCrypt.checkpw(pwd, cryptedPwd);
		System.out.println(result);
	}

}
