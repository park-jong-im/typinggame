package game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import test.Main;

public class NomalGame {
	int answerNum;    // 정답 개수
	int worngNum;     // 오답 개수
	String user;      // 유저 이름
	int total;
	private int allNum = 5;      // 문제수
//	ArrayList<NomalGame> nomalList = new ArrayList<NomalGame>();    
	
	Main main = new Main();
	NomalWordList wordList = new NomalWordList();   // 노말단어 불러옴
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	
	public NomalGame() {}
	
	public NomalGame(String user, int total) {
		this.user = user;
		this.total = total;
	}

	public int getTotal() {
		return total;
	}

	public void nomalGame() {
		answerNum = 0;
		worngNum = 0;
		double startTime = System.currentTimeMillis(); // 시작 시간
		
		System.out.println("\n\n\n\n\n<<<게임을 시작합니다!!!>>>");
		for (int i = 0; i < allNum; i++) {
			System.out.println("현재 문제 : (" + (i + 1) + " / " + allNum + ")");
			int randomIndex = random.nextInt(wordList.nomalWord.size());
			System.out.println(">> " + wordList.nomalWord.get(randomIndex));
			String name = scanner.next();
			if (wordList.nomalWord.get(randomIndex).equals(name) == true) { // 랜덤 뽑은걸로 입력값 비교
				answerNum++;
				System.out.println("\n\n\n\n\n┎──────────정답입니다!──────────┒\n정답 개수 : " + answerNum + 
						"      틀린 개수 : " + worngNum +
						"\n┖───────────────────────────────┚" );
			} else {
				worngNum++;
				System.out.println("\n\n\n\n\n┎─────────오답입니다...─────────┒\n정답 개수 : " + answerNum + 
						"      오답 개수 : " + worngNum +
						"\n┖───────────────────────────────┚" );
			}
			
			
		}
		
		double endTime = System.currentTimeMillis();
		double persent = ((double)answerNum / (double)allNum) * 100.0;
		
		double durationTimeSec = (endTime - startTime) / 1000;  // 걸리는 시간 계산
		
		total = answerNum * (int)(100000 / (float)durationTimeSec);	// 플레이어 점수 계산
		
		System.out.println("\n\n\n\n\n┎──────────최종결과!!!──────────┒");
		System.out.println("       정답 횟수 : " + answerNum + " / " + allNum);
		System.out.println("        정답률 : " + String.format("%.2f", persent) + "%");
		System.out.println("       걸린시간 : " + String.format("%.2f", durationTimeSec) + "초");
		System.out.println("┖───────────────────────────────┚");
		
		boolean len = true;
		while(len) {
			System.out.println("\n당신의 이름을 작성해주세요!");
			user = scanner.next();
			if(user.length() > 3) {
				System.out.println("다시 입력해주세요.");
			} else {
				len = false;
			}
		}

		
		Main.nomalList.add(new NomalGame(user, total));  // 실행할때마다 쭉쭉 생성
		Main.point += (int)((total / 100)*100000); // 보너스 점수
	}
	
	public void descList() {
		Main.nomalList = Main.nomalList.stream().sorted(Comparator.comparingInt(NomalGame::getTotal)
				.reversed()).collect(Collectors.toCollection(ArrayList::new));  // 매우 미숙
		int i = 1;
		for(NomalGame s : Main.nomalList) {
			System.out.println("  " + i + "위 " + s);
			i++;
		}
	}
	
	@Override
	public String toString() {
		return "     " + user + "      " + total;
	}
	
}
