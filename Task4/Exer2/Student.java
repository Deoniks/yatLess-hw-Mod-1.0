package Task4.Exer2;

public class Student extends Person{
    private String programm;
    private int year;
    private double fee;

    public Student(String name, String address, String programm, int year, double fee){
        super(name, address);
        this.programm = programm;
        this.year = year;
        this.fee = fee;
    }
    public String getProgramm(){return programm;}
    public void setProgramm(String programm){this.programm = programm;}
    public int getYear(){return year;}
    public void setYear(int year){this.year = year;}
    public double getFee(){return fee;}
    public void setFee(double fee){this.fee = fee;}

    @Override
    public String toString() {
        return "Student {" + super.toString() +
                " programm='" + programm + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                '}';
    }
}
