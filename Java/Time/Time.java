package mc.ys.lesson6;

public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public int getHour() {
        return this.hour;
    }
    
    public int getMinutes() {
        return this.minute;
    }
    
    public float getSecond() {
        return this.second;
    }
    
    public void setHour(int h) {
        this.hour = Math.min(Math.max(0, h), 23);
    }
    
    public void setMinute(int m) {
        this.minute = Math.min(Math.max(0, m), 23);
    }
    
    public void setSecond (int s) {
        this.second = Math.min(Math.max(0, s), 23);
    }
}
