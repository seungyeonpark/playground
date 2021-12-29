package mc.ys.lesson3;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
        int year = 0;
        
        System.out.print("연도를 입력하세요 > ");
        
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        scanner.close();
        
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
	}
}
