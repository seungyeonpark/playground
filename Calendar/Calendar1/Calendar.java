package mini.project;

public class Calendar {
    private int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int STANDARAD_YEAR = 1970;
    private final int STANDARD_MONTH = 1;
    private final int STANDARD_WEEKDAY = 4; // 1970-01-01 Thursday
    
    public void printCalendar(int year, int month) {
        if (isLeapYear(year)) {
            maxDays[1] = 29;
        }
        
        System.out.printf("=========%d년 %2d월==========%n", year, month);
        System.out.println("일   월   화   수   목   금   토");
        
        int space = countSpace(year, month);
        int end = maxDays[month - 1];
        for (int i = 1; i <= end; i++) {
            if (i == 1) {
                for (int j = 0; j < space; j++) {
                    System.out.print("    ");
                }
            }
            
            if (i < 10) {
                System.out.print(" ");
            }
            
            System.out.printf(" %d ", i);
            
            if ((i + space) % 7 == 0 || i == end) {
                System.out.println();
            }
        }
        
        System.out.printf("=============================%n%n");
    }
    
    private boolean isLeapYear(int year) {
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }
    
    private int countSpace(int year, int month) {
        int lastDays = 0;
        
        for (int i = STANDARAD_YEAR; i < year; i++) {
            lastDays += isLeapYear(i) ? 366 : 365;
        }
        
        for (int i = STANDARD_MONTH; i < month; i++) {
            lastDays += maxDays[i - 1];
        }
        
        return (lastDays + STANDARD_WEEKDAY) % 7;
    }
}
