package Task4.Exer5;

public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return super.getArea();
    } // И тут я понял...
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }


}
