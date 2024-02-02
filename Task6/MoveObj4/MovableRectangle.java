package Task6.MoveObj4;

public class MovableRectangle implements MoveObj{
    private MovablePointObj topLeft;
    private MovablePointObj bottomRight;

    public  MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed ){
        topLeft = new MovablePointObj(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePointObj(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
    }

    @Override
    public void moveDown() {
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
    }

    @Override
    public void moveRight() {
        bottomRight.moveRight();
    }

}
