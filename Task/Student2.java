package Task;

public class Student2 {
    private String fullName;
    private double averageMark;
    private double scholarship;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public Student2(){}
    public Student2(String fullName, double averageMark, double scholarship){
        this.fullName = fullName;
        this.averageMark = averageMark;
        this.scholarship = scholarship;
    }
    public void printScholarship(){
        if(averageMark <= 2.0){
            return;
        }else  if (averageMark > 4.5){
            double up = 0.3 * scholarship + scholarship;
            System.out.println(up);
        }else {
            double up = 0.1*scholarship + scholarship;
            System.out.println(up);
        }
    }
}
