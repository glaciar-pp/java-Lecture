package mysql.baseballTeam;

import java.util.List;
import java.util.Scanner;

/**
 * 1. 좋아하는 프로야구 구단의 선수를 등록하려고 한다.
 * 2. 등록하려는 정보는 선수명, 백넘버, 포지션, 생년월일, 키(height)
 * 3. primary key는 백넘버로 한다.
 * 4. 각 포지션(투수, 포수, 내야수, 외야수) 별로 3명 이상의 선수를 등록한다.
 * 선수 목록, 선수 등록, 선수정보 수정, 선수 방출을 할 수 있도록 DTO, DAO, App을 만들어 보세요.
 * 
 **/

public class BaseballPlayerApp {
	private static Scanner scan = new Scanner(System.in);
	private static BaseballDAO bdao = new BaseballDAO();

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1. 선수목록 | 2. 선수등록 | 3. 선수정보 수정 | 4. 선수방출 | 5. 종료");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scan.nextLine());
			switch (selectNo) {
			case 1:
				listPlayers();
				break;
			case 2:
				registerPlayer();
				break;
			case 3:
				updatePlayer();
				break;
			case 4:
				releasePlayer();
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("Warning: 1에서 5가지의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}

	public static void listPlayers() {
		System.out.println("------------------------------------------------");
		System.out.println("선수목록");
		System.out.println("------------------------------------------------");
		List<PlayerDTO> list = bdao.getPlayers();
		for (PlayerDTO p : list)
			System.out.println(p);
	}

	public static void registerPlayer() {
		System.out.println("------------------------------------------------");
		System.out.println("선수등록");
		System.out.println("------------------------------------------------");
		int backNo;
		while (true) {
			System.out.print("선수 Back Number 입력> ");
			backNo = Integer.parseInt(scan.nextLine());
			PlayerDTO p = bdao.getPlayer(backNo);
			if (p.getName() == null)
				break;
			System.out.println("중복된 번호 입니다. 다시 입력해주세요.");
		}
		System.out.print("선수 성명> ");
		String name = scan.nextLine();
		
		System.out.print("포지션> ");
		String position = scan.nextLine();
		
		System.out.print("생년월일> ");
		String birthday = scan.nextLine();
		
		System.out.print("키> ");
		int height = Integer.parseInt(scan.nextLine());
		
		PlayerDTO np = new PlayerDTO(backNo, name, position, birthday, height, 0);
		bdao.insertPlayer(np);
		System.out.println("등록 되었습니다.");

	}

	public static void updatePlayer() {
		System.out.println("------------------------------------------------");
		System.out.println("선수정보 수정");
		System.out.println("------------------------------------------------");
		System.out.print("선수 Back Number 입력> ");
		int backNo = Integer.parseInt(scan.nextLine());
		PlayerDTO p = bdao.getPlayer(backNo);
		
		System.out.print("성명(" + p.getName() + ")> ");
		String name = scan.nextLine();
		
		System.out.print("포지션(" + p.getPosition() + ")> ");
		String position = scan.nextLine();
		
		System.out.print("생년월일(" + p.getBirthday() + ")>");
		String birthday = scan.nextLine();
		
		System.out.print("키(" + p.getHeight() + ")>");
		int height = Integer.parseInt(scan.nextLine());
		
		p = new PlayerDTO(backNo, name, position, birthday, height, 0);
		bdao.upatePlayer(p);
		System.out.println("고객정보 수정을 마쳤습니다.");

	}

	public static void releasePlayer() {
			System.out.println("------------------------------------------------");
			System.out.println("선수방출");
			System.out.println("------------------------------------------------");

		System.out.print("선수 Back Number 입력> ");
		int backNo = Integer.parseInt(scan.nextLine());
		bdao.releasePlayer(backNo);
		System.out.println("선수가 방출되었습니다.");
	}
}
