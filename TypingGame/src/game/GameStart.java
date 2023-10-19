package game;

import java.util.Scanner;

public class GameStart {

	NomalGame a = new NomalGame();
	HardGame b = new HardGame();

	private static Scanner scanner = new Scanner(System.in);

	public void showRankings() {
		System.out.println("----- 게임시작 -----");
		System.out.println("1. Nomal");
		System.out.println("2. Hard");
		System.out.println("3. 뒤로 가기");
		System.out.println("버전을 선택하세요.");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			a.nomalGame();
			break;

		case 2:
			b.hardGame();
			break;

		case 3:
			break;

		default:
			System.out.println("잘못된 선택입니다.");
			System.out.println("다시 선택해 주세요.");
		}
	}
	
	
}