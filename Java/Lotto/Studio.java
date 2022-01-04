package mc.ys.lesson6;

public class Studio {
    
    public static void main(String[] args) {
        Studio studio = new Studio();
        studio.onAir();
    }
    
    public void onAir() {
        LottoMachine machine = this.readyLottoMachine();
        System.out.println("추첨 시작");
        machine.startMachine();
        System.out.println("추첨 끝");
    }
    
    public LottoMachine readyLottoMachine() {
        LottoMachine machine = null;
        System.out.println("공 생성");
        System.out.println("공을 머신에 주입");
        machine = new LottoMachine(null);
        return machine;
    }
}
