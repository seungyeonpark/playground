package mc.ys.lesson7;

public class Circle extends Shape {
    private Point center;
    private int r;
    
    public Circle() {
        this(new Point(0, 0), 100);
    }
    
    public Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }
    
    public void draw() {
        System.out.printf("[center = (%d, %d), r = %d, color = %s]", center.getX(), center.getY(), r, super.color);
    }
}
