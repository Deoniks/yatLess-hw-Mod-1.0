package Task4.Exer5;

public class Circle extends Shape{
    private double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){return radius;}
    public void setRadius(double radius){this.radius = radius;}
    public double getArea(){
        double s = Math.PI * Math.pow(radius,2); //S- area circle
        String area = String.format("%.2f",s); // create String var to format doible num
        String a = area.replace(',','.');
        double sA = Double.valueOf(a);
        return sA;
    }

}
