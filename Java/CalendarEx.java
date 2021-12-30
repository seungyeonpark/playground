package mc.ys.lesson4;

public class Calendar {

    public static void main(String[] args) {

        // 2021년 달력
        int year = 2021;
        int month = 12; // TODO 월 입력 받아 수정 가능하도록
        
        int[] spaces = new int[12];
        int[] lastDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        //윤년판단 로직
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            lastDays[1] = 29;
        }
        
        int spaceValue = 2; // 2020년 12월 빈칸정보 2
        for (int i = 0; i < 12; i++) {
            spaces[i] = (lastDays[i] + spaceValue) % 7;
            spaceValue = spaces[i];
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
            day = day + 1;
        }
    }

}
