package Task2;

import java.util.Scanner;

public class SetupMain {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //date();
        //time();
        //ball();
        ApartAndColony();
        //MagickSchool();
    }
    public static void date(){
        Date d1 = new Date(2,11,2012);
        System.out.println(d1);

        d1.setDay(15);
        d1.setMonth(10);
        d1.setYear(2015);
        System.out.println(d1);

        System.out.println("Day: " + d1.getDay());
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Year: " + d1.getYear());

        d1.setDate(5,7,2021);
        System.out.println(d1);
    }
    public static void time(){
        Time t = new Time(15,15,8);
        System.out.println(t);
        t.nextSecond().nextSecond();
        System.out.println(t);
        t.prevSecond();
        System.out.println(t);
    }
    public static void ball(){
        Ball ball = new Ball(1.1f, 2.2f,10, 3.3f, 4.4f);
        System.out.println(ball);

        //(Ниже для проверки взял тестовый пример проверки из notion)
        // Test Setters and Getters
        ball.setX(80.0f);
        ball.setY(35.0f);
        ball.setRadius(5);
        ball.setxDelta(4.0f);
        ball.setyDelta(6.0f);
        System.out.println("________________________________");
        System.out.println(ball);  // toString()
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());
        System.out.println("xDelta is: " + ball.getxDelta());
        System.out.println("yDelta is: " + ball.getyDelta());

        // Bounce the ball within the boundary
        System.out.println("________________________________");
        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;
        for (int i = 0; i < 15; i++) {
            ball.move();
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            int radius = ball.getRadius();
            // Check boundary value to bounce back
            if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
                ball.reflectHorizontal();
            }
            if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                ball.reflectVertical();
            }
        }
    }
    public static void ApartAndColony(){
        Apartmen apar = new Apartmen("MarsLite",30,"Nanolite");
        Colony colony = new Colony("Mikey",3500,5,apar);
        System.out.println(colony.price(apar.getSmet()));

        Apartmen ap = new Apartmen();
        Colony co = new Colony();
        ap.setSmet(35);
        ap.setType("Carbonpanel");
        co.setSmetPrice(13500);
        co.setApart(ap);
        System.out.println(co.price(ap.getSmet()));

    }
    public static void MagickSchool(){

        Esper [] esp = new Esper[12];
        esp[0] = new Esper("Eliot",12,"Crio");
        esp[1] = new Esper("Smash",9998,"Piro");
        esp[2] = new Esper("Saitama",10000,"Gidro");
        esp[3] = new Esper("Potter",500,"Piro");
        esp[4] = new Esper("Grotter",500,"Crio");
        esp[5] = new Esper("Deus",1120,"FourElem");
        esp[6] = new Esper("Mouse",2,"FourElem");
        esp[7] = new Esper("Leo",5,"Piro");
        esp[8] = new Esper("Main",21,"Geo");
        esp[9] = new Esper("Will",158,"Geo");
        esp[10] = new Esper("Brook",580,"Girdro");
        esp[11] = new Esper("Brut",38,"Crio");

        School schPiro  = new School("Tibidoh","Piro",esp);
        School schCrio = new School("Umbrella","Crio",esp);
        School schGidro = new School("Sharmbaton","Gidro",esp);
        School schGeo = new School("AcademYou","Geo",esp);
        School schFourEl = new School("Hogwarts","FourElem",esp);

        schPiro.checkType();
        schCrio.checkType();
        schGidro.checkType();
        schGeo.checkType();
        schFourEl.checkType();

        System.out.println(schPiro.print());
        System.out.println(schCrio.print());
        System.out.println(schGidro.print());
        System.out.println(schGeo.print());
        System.out.println(schFourEl.print());


    }

}
