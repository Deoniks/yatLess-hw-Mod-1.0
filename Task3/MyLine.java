package Task3;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2){
        this.begin = new MyPoint(x1,y1);
        this.end = new MyPoint(x2,y2);
    }
    public MyLine (MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX() {
        MyPoint m = new MyPoint();
        return m.getX();
    }

    public void setBeginX(int x) {
        MyPoint m = new MyPoint();
        m.setX(x);
    }

    public int getEndY() {
        MyPoint m = new MyPoint();
        return m.getY();
    }

    public void setEndY(int y) {
        MyPoint m = new MyPoint();
        m.setY(y);
    }

    public int[] getBeginXY() {
        MyPoint m = new MyPoint();
        return m.getXY();
    }

    public void setBeginXY(int x, int y) {
        MyPoint m = new MyPoint();
        m.setXY(x,y);
    }

    public int[] getEndXY() {
        MyPoint m = new MyPoint();
        return m.getXY();
    }

    public void setEndXY(int x, int y) {
        MyPoint m = new MyPoint();
        m.setXY(x,y);
    }

    public double getLength() {
        MyPoint m = new MyPoint();
        return m.distance();
    }

    public double getGradien() {
        return Math.atan2(getEndY(),getBeginX());
    }

    @Override
    public String toString() {
        return "MyLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
