package Porject.Porject.fish;

import java.util.Scanner;

public class Season {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력해 주세요. : ");
			int month = sc.nextInt();
			
			System.out.print("현재 계절은 ");
			if(month >= 3 && month <= 5) System.out.println("봄입니다.");
			else if(month >= 6 && month <= 8) System.out.println("여름입니다.");
			else if(month >= 9 && month <= 11) System.out.println("가을입니다.");
			else if(month == 1 || month == 2 || month == 12) System.out.println("겨울입니다.");
			else System.out.println("출력할 수 없습니다.");	
		}
		
		}
	

