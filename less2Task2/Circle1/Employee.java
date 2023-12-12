package less2Task2.Circle1;

public class Employee
{
    private int id;
    private String fName;
    private String lName;
    private int salary;

    public Employee(int id,String fName,String lName,int salary)
    {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public String getfName(){return fName;}
    public String getlName(){return lName;}

    public String getFullName()
    {
        return getfName() + " " + getlName();
    }
    public int getSalary(){return salary;}

    public void setId(int id){
        this.id = id;
    }
    public void setSalary(int salary){this.salary = salary;}
    public int getAnnSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent)
    {
        double per = percent/100;
        double sal = salary*per;
        double sall = salary+sal;
        int sa = (int) sall;
        return sa;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
