package Task6.interGeometricObj5;

public class CircleInter implements iGeometricObj {
    protected double radius;

    public CircleInter(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle: radius = " + radius;
    }

}
