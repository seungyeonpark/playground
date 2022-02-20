package mc.ys.lesson10;

import java.util.Random;

public class LottoMachine {
    private final static int TOTAL_BALL_NUMS = 45;
    private final static int SELECT_BALL_NUMS = 6;
    private LottoBall[] balls;
    
    public LottoMachine() {
        this.balls = new LottoBall[TOTAL_BALL_NUMS];
    }

    public void startMachine() {
        setBalls();
        
        System.out.println("START!");
        
        for (int i = 0; i < SELECT_BALL_NUMS; i++) {
            LottoBall ball = selectBall();
            System.out.printf("로또볼 하나를 뽑았습니다: %d%n", ball.getNumber());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("FINISH!");
    }
    
    private void setBalls() {
        for (int i = 0; i < TOTAL_BALL_NUMS; i++) {
            balls[i] = new LottoBall(i + 1);
        }
    }
    
    private LottoBall selectBall() {
        Random rnd = new Random();

        while (true) {
            int index = rnd.nextInt(TOTAL_BALL_NUMS);
            
            if (!balls[index].getSelected()) {
                balls[index].setSelected(true);
                return balls[index];
            }
        }
    }
}
