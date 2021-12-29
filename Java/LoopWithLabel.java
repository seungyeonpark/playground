package mc.ys.lesson3;

import java.util.Scanner;

public class LoopWithLabel {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while (true) {
			System.out.println("(1) square (2) square root (3) log");
			System.out.print("원하는 메뉴를 입력하세요(0을 입력하면 종료됩니다) >");
			menu = scanner.nextInt();
			
			while (true) {
				System.out.print("계산할 숫자를 입력하세요(계산 종료: 0, 전체 종료: 99) > ");
				num = scanner.nextInt();
				
				if (num == 0) {
					break;
				}
				
				if (num == 99) {
					break outer;
				}
				
				switch(menu) {
				case 1:
					System.out.println("result = " + num * num);
					break;
				case 2:
					System.out.println("result = " + Math.sqrt(num));
					break;
				case 3:
					System.out.println("result = " + Math.log(num));
				}
			}
		}
		
		scanner.close();
	}
}
