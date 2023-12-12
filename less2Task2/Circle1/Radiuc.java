package less2Task2.Circle1;

public class Radiuc {
    private double radius = 1.0;
    private String color = "red";
    private final double Pi = 3.14;

    Radiuc(double r, String col)
    {
        this.radius = r;
        this.color = col;
    }
    Radiuc()
    {
        getArea();
        getArea();
    }

    public double getRadiuc(){
        return radius;
    }

    public double getArea(){
        double s = Pi * radius;
        return s;
    }

}
