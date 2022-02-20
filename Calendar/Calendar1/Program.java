package mini.project;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();
        
        while (true) {
            System.out.print("YEAR >> ");
            int year = scanner.nextInt();
            System.out.print("MONTH >> ");
            int month = scanner.nextInt();
            
            calendar.printCalendar(year, month);
            
            System.out.print("Continue? (yes: y) >> ");
            
            char exit = scanner.next().charAt(0);
            if (exit != 'y' && exit != 'Y') {
                break;
            }
        }
        
        scanner.close();
    }
    
}
