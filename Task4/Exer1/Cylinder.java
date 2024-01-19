package Task4.Exer1;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
    }
    public Cylinder(double radius){
        super(radius);
        this.height = 1.0;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius,String color, double height){
        super(radius,color);
        this.height = height;
    }
    public double getHeight(double height){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        double v = getArea()*height;
        String volume = String.format("%.2f",v);
        String vo = volume.replace(',','.');
        double vol = Double.valueOf(vo);
        return vol;
    }
}
