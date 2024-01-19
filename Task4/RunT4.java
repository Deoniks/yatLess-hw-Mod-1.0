package Task4;

import Task4.Exer1.Circle;
import Task4.Exer1.Cylinder;
import Task4.Exer2.Staff;
import Task4.Exer2.Student;

public class RunT4 {
    public static void main(String[] args) {
        Ex2();
    }

    public static void Ex1(){
        Circle c = new Circle(2.23);
        System.out.println(c.getArea());
        Cylinder cy = new Cylinder(c.getRadius(),2);
        System.out.println(cy.getVolume());
    }
    public static void Ex2(){
        Student stud = new Student("Alex", "Almaty", "Developer", 3, 1.5);
        System.out.println(stud.toString());
        Staff staff = new Staff("Name","addressWhich", "Premium School Midgard", 999666999.0);// Уточнить о выводе (pay: 9.99666999E8)
        System.out.println(staff.toString());
    }
}
