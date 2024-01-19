package Task3;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle(){
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }
    public MyCircle(int radius, int x, int y){
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        MyPoint m = new MyPoint();
       return m.getX();
    }

    public void setCenterX(int x) {
        MyPoint m = new MyPoint();
        m.setX(x);
    }

    public int getCenterY() {
        MyPoint m = new MyPoint();
        return m.getY();
    }

    public void setCenterY(int y) {
        MyPoint m = new MyPoint();
        m.setY(y);
    }

    public int [] getCenterXY() {
        MyPoint m = new MyPoint();
        return m.getXY();
    }

    public void setCenterXY(int x, int y) {
        MyPoint m = new MyPoint();
        m.setXY(x,y);
    }

    public double getArea() {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
