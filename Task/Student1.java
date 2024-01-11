package Task;

public class Student1 {
    private String fullName;
    private int math;
    private int english;
    private int programming;

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setMath(int math){
        this.math = math;
    }
    public void setEnglish(int english){
        this.english = english;
    }
    public void setProgramming(int programming){
        this.programming = programming;
    }

    public String getFullName(){
        return this.fullName;
    }
    public int getMath(){
        return math;
    }
    public int getEnglish(){
        return english;
    }

    public int getProgramming() {
        return programming;
    }

    @Override
    public String toString() {
        return "Student1 " +
                "fullName = " + fullName + '\n' +
                " math=" + math +
                ", english=" + english +
                ", programming=" + programming ;
    }
}
