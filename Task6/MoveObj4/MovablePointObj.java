package Task6.MoveObj4;

public class MovablePointObj implements MoveObj {
     int x;
     int y;
     int xSpeed;
     int ySpeed;

    public MovablePointObj(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }
    @Override
    public void moveDown(){
        y += ySpeed;
    }
    @Override
    public void moveLeft(){
        x -= xSpeed;
    }
    @Override
    public void moveRight(){
        x += xSpeed;
    }
    @Override
    public String toString(){
        return "(x,y): (" + x + ',' + y + ')'
                + ", Speed: (" + xSpeed + ',' + ySpeed + ')';
    }
}
