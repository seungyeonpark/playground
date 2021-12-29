package mc.ys.lesson3;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		// 점수를 입력하면 학점 출력하기
		int score = 0;
		char grade = ' ';
		char opt = '0';
		
		System.out.print("당신의 점수를 입력하세요 > ");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		scanner.close();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
			System.out.printf("당신의 점수는 %d입니다.%n", score);
			System.out.println("당신의 학점은 F입니다.");
			return;
		}
		
		if (score % 10 >= 8) {
			opt = '+';
		} else if (score % 10 <= 4) {
			opt = '-';
		}
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);
	}
}
