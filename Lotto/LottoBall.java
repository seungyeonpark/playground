package mc.ys.lesson10;

public class LottoBall {
    private int number;
    private boolean isSelected;
    
    public LottoBall(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return this.number;
    }

    public boolean getSelected() {
        return this.isSelected;
    }
    
    public void setSelected(boolean select) {
        this.isSelected = select;
    }
}
