package Task4.Exer1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private final double Pi = 3.1415;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        double s = Pi * Math.pow(radius,2); //S- area circle
        String area = String.format("%.2f",s);
        String a = area.replace(',','.');
        double sA = Double.valueOf(a);
        return sA;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
