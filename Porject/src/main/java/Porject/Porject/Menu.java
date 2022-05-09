package Porject.Porject;

import java.util.Scanner;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	
	
	private void  mainTitle() {
		System.out.println("==============");
		System.out.println("=0. 인벤토리창=");
		System.out.println("=1. 낚시하기=");
		System.out.println("=2. 상점가기=");
		System.out.println("=3. 시장가기=");
		System.out.println("==============");
	}
	private void inventoryTitle() {
		System.out.println(" 인벤토리창");
		System.out.println("1.소지금액 : ");
		System.out.println("2.어망 : ");
		System.out.println("3.미끼수량 : ");
		System.out.println("돌아가기 ===>");
		
	}
	private void fishTitle() {
		System.out.println(" 낚시하기");
		System.out.println("1.낚시대 던지기");
		System.out.println("2.어망확인");
		System.out.println("3.돌아가기");
		
	}
	private void storeTitle() {
		System.out.println(" 상점가기");
		System.out.println("1.물건사기");
		System.out.println("2.돌아가기");
		System.out.println("돌아가기 ===>");
		
	}
	private void marketTitle() {
		System.out.println(" 시장가기");
		System.out.println("1.물건사기");
		System.out.println("2.돌아가기");
		System.out.println("돌아가기 ===>");
		
	}
	private void mainMenu() {
		boolean b = false;
		do {
			 mainTitle();
	         System.out.println("하고싶은 일을 골라주세요 ====>");
	         int job = sc.nextInt();
	         switch (job) {
	         case 1:
	            Menu();
	            break;
	         case 2:
	            Menu();
	            break;
	         case 3:
	            b = true;
	            System.out.println("시스템 종료");
	            break;
		}
		
		
			
		
	}
	
}
