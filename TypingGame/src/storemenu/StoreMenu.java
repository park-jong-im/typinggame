package storemenu;

import java.util.Scanner;

import test.Main;

public class StoreMenu {
	public void storeMenu() {
		StoreMenuTest pointPackage = new StoreMenuTest(); // 초기 포인트를 설정하여 PointTestPackage 객체 생성
		// 상점 메인 화면 출력
		System.out.println("----------------------------------------");
		System.out.println("            코린이 상점");
		System.out.println("----------------------------------------");
		System.out.println(" 구매를 원하시는 상품을 선택해주세요.\n (현재 보유 포인트 : " + Main.point +"점)\n");
		System.out.println(" 1. 새콤달콤\t\t   500점");
		System.out.println(" 2. 크런키더블클런치\t  1000점");
		System.out.println(" 3. 하리보\t\t  2000점");
		System.out.println(" 4. 비타500\t\t  2500점");
		System.out.println(" 5. 문화상품권\t\t  3000점");
		System.out.println(" 6. 편의점상품권\t  4000점");
		System.out.println(" 7. 던킨 먼치킨10개팩\t  5000점");
		System.out.println(" 8. 편의점상품권\t  7000점");
		System.out.println(" 9. 신세계상품권\t10,000점");
		System.out.println("10. 후라이드치킨+콜라\t20,000점");

		Scanner scanner = new Scanner(System.in);
		// 구매할 상품 번호 선택
		while (true) {
			System.out.print("\n#위 메뉴 중 하나를 선택하시겠습니까? (Y: 예, N: 아니오): ");
			String choice = scanner.nextLine();
			if (choice.equalsIgnoreCase("Y")) {
				System.out.print(" 구매할 상품의 번호를 입력하세요 : ");
				String itemNumberString = scanner.nextLine();
				int itemNumber;

				try {
					itemNumber = Integer.parseInt(itemNumberString);
				} catch (NumberFormatException e) {
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					continue;
				}

				int itemPrice = 0;
				String itemName = "";
				// 상품 번호에 따라 가격과 상품명 설정
				switch (itemNumber) {
				case 1:
					itemPrice = 500;
					itemName = "새콤달콤";
					break;
				case 2:
					itemPrice = 1000;
					itemName = "크런키더블클런치";
					break;
				case 3:
					itemPrice = 2000;
					itemName = "하리보";
					break;
				case 4:
					itemPrice = 2500;
					itemName = "비타500";
					break;
				case 5:
					itemPrice = 3000;
					itemName = "문화상품권";
					break;
				case 6:
					itemPrice = 4000;
					itemName = "편의점상품권";
					break;
				case 7:
					itemPrice = 5000;
					itemName = "던킨 먼치킨10개팩";
					break;
				case 8:
					itemPrice = 7000;
					itemName = "편의점상품권";
					break;
				case 9:
					itemPrice = 10000;
					itemName = "신세계상품권";
					break;
				case 10:
					itemPrice = 20000;
					itemName = "후라이드치킨+콜라";
					break;

				default:
					System.out.println("#잘못된 상품 번호입니다. 다시 입력해주세요.");
					continue;
				}
				// 선택한 상품 구매처리
				pointPackage.purchaseItem(itemPrice, itemName);

				while (true) {
					System.out.print(" 입력: ");
					String backToShop = scanner.nextLine();

					if (backToShop.equalsIgnoreCase("R")) {
						break;
					} else if (backToShop.equalsIgnoreCase("M")) {
						System.out.println(" 상점을 나갑니다.\n\n\n\n\n");
						return;
					} else {
						System.out.println("#잘못된 입력입니다. 다시 입력해주세요.");
					}
				}
			} else if (choice.equalsIgnoreCase("N")) {
				System.out.println(" 상점으로 돌아가시려면 'R'을 입력하시고 상점을 나가시려면 'M'을 입력해주세요.");
				String backToShop = scanner.nextLine();

				if (backToShop.equalsIgnoreCase("R")) {
					continue;
				} else if (backToShop.equalsIgnoreCase("M")) {
					System.out.println(" 상점을 나갑니다.\n\n\n\n\n");
					return;
				} else {
					System.out.println("#잘못된 입력입니다. 상점 메인 화면으로 돌아갑니다.");
					continue;
				}
			} else {
				System.out.println("#잘못된 입력입니다. 다시 입력해주세요.");

			}

		}

	}

}
