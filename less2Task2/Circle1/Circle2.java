package less2Task2.Circle1;

public class Circle2
{
    private  double radius = 1.0;
    private final double PI = Math.PI;

    Circle2(){

    }
    Circle2(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public static void setRadius(double r)
    {
        //this.radius = r;
    }

    public double getArea(){
        return radius;
    }

    public double getCircumference(){
        double c = 2*PI*getRadius();
        return c;
    }

    @Override
    public String toString() {
        return "Circle2{" +
                "radius=" + radius +
                '}';
    }
}
