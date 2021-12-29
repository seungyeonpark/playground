package mc.ys.lesson3;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		// 계절 출력하기
		int season = 0;
		
		System.out.print("현재 월을 입력하세요 > ");
		
		Scanner scanner = new Scanner(System.in);
		season = scanner.nextInt();
		
		switch (season) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재 계절은 가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("현재 계절은 겨울입니다.");
			break;
		default:
			System.out.println("유효하지 않은 값입니다!");
			break;
		}
		
		scanner.close();
		
		// 랜덤 수 출력
		int num = 0;
		
		for (int i = 0; i < 5; i++) {
			num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
		}
	}
}
