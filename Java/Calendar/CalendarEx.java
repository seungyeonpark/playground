package mc.ys.lesson5;

import java.util.Scanner;

public class CalendarEx {

    public static void main(String[] args) {
        CalendarEx cm = new CalendarEx();
        cm.start();
    }
    
    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        
        while(!flag) {
            System.out.print("Input month >>> ");
            int cmd = sc.nextInt();
            
            makeCalendar(cmd);
            
            System.out.print("be continue> [Yes: 1, No: 0] >>> ");
            cmd = sc.nextInt();
            if (cmd == 0) {
                System.out.println("Calendar Service is stop!");
                flag = true;
            }
        }
        sc.close();
    }
    
    public void makeCalendar(int mon) {
        // 2021년 달력
        int year = 2021;
        int month = mon;
        
        int[] spaces = new int[12];
        int[] lastDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        //윤년판단 로직
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            lastDays[1] = 29;
        }
        
        spaces[0] = (2 + 31) % 7; // 2020년 12월 빈칸정보 2
        for (int i = 1; i < 12; i++) {
            spaces[i] = (lastDays[i - 1] + spaces[i - 1]) % 7;
        }
        
        int space = spaces[month - 1];
        int lastDay = lastDays[month - 1];
        
        System.out.printf("%d년 %d월%n", year, month);
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        for(int i = 0; i < space; i++) {
            System.out.print("\t");
        }
        
        int day = 1;
        for(int i = 0; i < lastDay; i++) { 
            System.out.print(day + "\t");
            if((space + day) % 7 == 0) {
                System.out.println();
            }
            day++;
        }
        System.out.println();
    }
}
