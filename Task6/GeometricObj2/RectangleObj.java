package Task6.GeometricObj2;

public class RectangleObj implements GeometricObj{
    private double width;
    private double length;
    public RectangleObj(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (width+length) * 2;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString(){
        return "Rectangle[width: " + width
                +", length: " + length;
    }
}
