package mc.ys.lesson2;

import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		// 암시적 형변환
		float num1 = 1234; // float f = (float)1234;
		// 명시적 형변환
		byte num2 = (byte)1000;
		
		System.out.println(5 / 2);
		System.out.println(5 / (float)2);
		
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		
		// 산술 연산자
		int number = 123456;
		
		while (number > 0) {
			System.out.println(number % 10);
			number /= 10;
		}
		
		// 논리 연산자
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.print("문자를 하나 입력하세요 > ");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if ('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
	}
}
