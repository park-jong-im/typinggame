package test;

import java.util.ArrayList;
import java.util.Scanner;

import game.GameStart;
import game.HardGame;
import game.NomalGame;
import game.Ranking;
import storemenu.StoreMenu;


public class Main {
	public static int point = 0;
	public static ArrayList<NomalGame> nomalList = new ArrayList<NomalGame>();
	public static ArrayList<HardGame> hardList = new ArrayList<HardGame>();

	
	public static void main(String[] args) {

		boolean game = true;
		Scanner scanner = new Scanner(System.in);
		GameStart run = new GameStart();
		Ranking rank = new Ranking();
		StoreMenu store = new StoreMenu();
		
		while (game) {
			System.out.println( "\n\n\n\n\n。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *");
			System.out.println("     * 코린이 타자연습 *");
			System.out.println(":+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜\n");
			System.out.println("1. 게임시작");
			System.out.println("2. 랭킹");
			System.out.println("3. 포인트 상점");
			System.out.println("4. 종료");
			System.out.println("현재 모은 포인트 : " + point);
			String start = scanner.next();
			switch (start) {
			case "1":
				run.showRankings();
				break;
			case "2":
				rank.showRankings();
				break;
			case "3":
				store.storeMenu();
				break;
			case "4":
				game = false;
				System.out.println("게임 종료합니다!");
				break;
			default:
				System.out.println("키를 잘못 입력하셨습니다. \n다시 입력해 주세요!\n\n\n\n\n");
				break;
			}
		}
	}
}
