package mc.ys.assignment;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BullsAndCows game = new BullsAndCows();

        while (!game.isFinish()) {
            System.out.print(">> ");
            int num = sc.nextInt();
            
            if (num == 0) {
                System.out.println("게임이 종료됩니다");
                return;
            }
            
            game.tryGame(num);
        }
        System.out.println("YOU WIN!!");
    }
}
