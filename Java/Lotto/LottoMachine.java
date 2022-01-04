package mc.ys.lesson6;

public class LottoMachine {
    LottoBall[] balls;
    
    LottoMachine (LottoBall[] balls) { // 접근 제어자?
        this.balls = balls;
    }
    
    void startMachine() {
        System.out.println("로또 번호 뽑기!");
        
        for (int i = 0; i < 6; i++) {
            LottoBall ball = this.getBall();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    LottoBall getBall() {
        LottoBall ball = null;
        System.out.println("로또볼을 하나 선택했습니다");
        return ball;
    }
}
