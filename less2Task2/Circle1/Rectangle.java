package less2Task2.Circle1;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){}
    public Rectangle(float l, float w)
    {
        this.length = l;
        width = w;
    }
    public float getLength(){
        return length;
    }
    public float getWidth(){
        return width;
    }
    public void setLength(float l){
        this.length = l;
    }
    public void setWidth(float w){
        width = w;
    }
    public double getArea(){
        double c = length*width;
        return c;
    }
    public double getPerimeter(){
        double per = (2*length) + (2*width);
        return per;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
