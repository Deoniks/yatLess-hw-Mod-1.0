package Task6.interGeometricObj5;

public class ResizableCircle extends CircleInter implements Resizable{

    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public void resize(int percent){
        System.out.println(radius *= percent/100.0);
    }
    @Override
    public String toString(){
        return "ResizableCircle [Circle [ radius: " + radius + "]]";
    }
}
