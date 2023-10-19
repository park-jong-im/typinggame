package storemenu;

import test.Main;

public class StoreMenuTest {

	public void purchaseItem(int itemPrice, String itemName) {
		if (Main.point >= itemPrice) { // 포인트가 상품 가격 이상인 경우
			Main.point -= itemPrice; // 포인트 차감
			System.out.println("\n\n\n\n\n " +itemName + " 구매가 완료되었습니다.");
            System.out.println("\n\t║█║▌║█║▌│║▌║▌█║");
            System.out.println("\t0  1233  4556 0");
            // 상품 구매 완료 메시지 출력
			System.out.println("\n *남은 포인트: " + Main.point + "점\n"); // 남은 포인트 출력
			System.out.println(" 상점으로 돌아가시려면 'R'을 입력하시고 상점을 나가시려면 'M'을 입력해주세요.");
		} else { // 포인트가 부족한 경우
			System.out.println("*포인트 잔액이 부족합니다."); // 포인트 부족 메시지 출력
			System.out.println(" 상점으로 돌아가시려면 'R'을 입력하시고 상점을 나가시려면 'M'을 입력해주세요."); // 다음 동작 메시지 출력
		}
	}

}
