package Task6.GeometricObj2;

public class CircleObj implements GeometricObj {
    private double radius;

    public CircleObj(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle[ radius: " + radius + ']';
    }
}
