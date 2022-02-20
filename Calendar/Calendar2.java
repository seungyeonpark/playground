package mini.project;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("년도를 입력하세요 :");
            int year = sc.nextInt();
            System.out.println("월을 입력하세요(0을 입력하면 전체 월이 출력됩니다) :");
            int month = sc.nextInt();

            if (1 <= month && month <= 12) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);

                System.out.printf("========= %d년 %d월 =======\n", year, month);
                System.out.println("일   월   화   수   목   금   토");

                calendar.set(year, month - 1, 1);

                int end = calendar.getActualMaximum(Calendar.DATE);
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                for (int i = 1; i <= end; i++) {
                    if (i == 1) {
                        for (int j = 1; j < dayOfWeek; j++) {
                            System.out.print("    ");
                        }
                    }

                    if (i < 10) {
                        System.out.print(" ");
                    }

                    System.out.printf(" %d ", i);

                    if (dayOfWeek % 7 == 0 || i == end) {
                        System.out.println();
                    }
                    dayOfWeek++;
                }
                System.out.println("============================");
            } else if (month == 0) {
                calendar.set(Calendar.YEAR, year);

                for (month = 1; month <= 12; month++) {
                    calendar.set(Calendar.MONTH, month);

                    System.out.printf("========= %d년 %d월 =======\n", year, month);
                    System.out.println("일   월   화   수   목   금   토");

                    calendar.set(year, month - 1, 1);

                    int end = calendar.getActualMaximum(Calendar.DATE);
                    int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                    for (int i = 1; i <= end; i++) {
                        if (i == 1) {
                            for (int j = 1; j < dayOfWeek; j++) {
                                System.out.print("    ");
                            }
                        }

                        if (i < 10) {
                            System.out.print(" ");
                        }

                        System.out.printf(" %d ", i);

                        if (dayOfWeek % 7 == 0 || i == end) {
                            System.out.println();
                        }
                        dayOfWeek++;
                    }
                    System.out.println("============================");
                }

            } else {
                System.out.println("유효하지 않은 값입니다!");
                break;
            }
        }
        sc.close();
    }
}