package mc.ys.lesson7;

public class Point {
    private int x;
    private int y;
    
    public Point() {
        this(0, 0);
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public String getXY() {
        return "(" + x + "," + y + ")"; // x와 y의 값을 문자열로 반환 (Stringbuilder 사용 필요?)
    }
}
