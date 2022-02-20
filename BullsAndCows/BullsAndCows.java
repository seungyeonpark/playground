package mc.ys.assignment;

import java.util.Random;

public class BullsAndCows {
    private static final int NUM_COUNT = 4;
    
    private int[] computerNums = new int[NUM_COUNT];
    private int[] playerNums = new int[NUM_COUNT];
    
    private int strike;
    private int ball;
    private boolean finish;
    
    public BullsAndCows() {
        printMessage();
        pickNumsWithoutDuplication();
    }
    
    public void tryGame(int inputNum) {
        setPlayerNums(inputNum);
        compareNums();
    }
    
    public boolean isFinish() {
        return finish;
    }
    
    private void printMessage() {
        System.out.println("GAME START!");
        System.out.println("- 4자리 수를 입력하세요");
        System.out.println("- 0를 입력하면 종료됩니다");     
    }

    private void pickNumsWithoutDuplication() {
        Random random = new Random();
        
        int index = 0;
        outer:
        while (index < NUM_COUNT) {
            int num = random.nextInt(9) + 1;
            
            for (int i = 0; i < index; i++) {
                if (computerNums[i] == num) {
                    continue outer;
                }
            }
            
            computerNums[index++] = num;
        }
    }
    
    private void setPlayerNums(int inputNum) {
        for (int i = NUM_COUNT - 1; i >= 0; i--) {
            playerNums[i] = inputNum % 10;
            inputNum /= 10;
        }
    }
    
    private void compareNums() {
        for (int i = 0; i < NUM_COUNT; i++) {
            for (int j = 0; j < NUM_COUNT; j++) {
                if (playerNums[i] == computerNums[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        System.out.printf("Strike: %d, Ball: %d%n", strike, ball);
        
        if (strike == NUM_COUNT) {
            finish = true;
        }
        
        strike = 0;
        ball = 0;
    }
}
