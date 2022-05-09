package Porject.Porject.fish;

import java.util.List;
import java.util.Scanner;

public interface Fish {
	Scanner scanner = new Scanner(System.in);
	
	int[] cnt= {0,0,0,0,0,0,0}; // 아이템 갯수 세기
	int get =0;
	
	int leg=0;
	int tail=0;
	int scales=0;
	
	int number = scanner.nextInt();
	
	System.out.println("- - - - - - - - - - - - - - - - - - 메뉴 창 - - - - - - - - - - - - - - - - - - - - - - - -\n");
	System.out.println("                 (1) 인벤토리           (2) 냥이 상점           (3) 사냥하기          (4) 생선가게 털러가기 ");
	System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		
	
}