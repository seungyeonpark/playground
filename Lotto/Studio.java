package mc.ys.lesson10;

public class Studio {
    
    public void onAir() {
        System.out.println("추첨 시작");
        readyLottoMachine();
    }
    
    public void offAir() {
        System.out.println("추첨 끝");
    }
    
    private void readyLottoMachine() {
        LottoMachine machine = new LottoMachine();
        machine.startMachine();
    }
}
