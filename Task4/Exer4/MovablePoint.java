package Task4.Exer4;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(){
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x,float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed(){
        return xSpeed;
    }
    public  void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float [] {xSpeed, ySpeed};
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint move(){
        super.setX(getX() + xSpeed);
        super.setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString(){
        return super.toString()+
                ", speed( " + xSpeed +
                 "," + ySpeed + ")";
    }
}
