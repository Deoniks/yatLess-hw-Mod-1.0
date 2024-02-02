package Task6.MoveObj4;

public class MovableCircle implements MoveObj{
    private int radius;
    private MovablePointObj center;

    public MovableCircle(int x,int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePointObj(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
        //center.y -= center.ySpeed;// разницы не заметил
    }

    @Override
    public void moveDown() {
        center.moveDown();

    }

    @Override
    public void moveLeft() {
        center.moveLeft();

    }

    @Override
    public void moveRight() {
        center.moveRight();

    }

    @Override
    public String toString(){
        return "(x,y): (" + center.x + ',' + center.y + ')'
                + ", Speed: (" + center.xSpeed + ", " + center.ySpeed + ')'
                + ", radius: " + radius;
    }
}
