
import Task.*;

import java.util.Scanner;

public class RunT1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Plane();
        //Study();
        //Study1();
        //Book1();
        //Book2();
        //Candidate();
        //Ship();
        //Project();
    }

    public static void Plane(){
        Plane pl1 = new Plane();
       /* Plane pl2 = new Plane();
        Plane pl3 = new Plane(); Закоментил для тестов
        Plane pl4 = new Plane();
        Plane pl5 = new Plane();
        Plane pl6 = new Plane();*/

        for (int i =0; i<6;i++){
            switch (i){
                case (0)->{
                    System.out.println("Enter ID flight");
                    String a = scan.nextLine();
                    pl1.setId(a);

                    System.out.println("Enter beginning flight");
                    pl1.setArrivalTime(scan.nextLine());

                    System.out.println("Enter end flight");
                    pl1.setLeave(scan.nextLine());
                }
                /*case (1)->{
                    System.out.println("Enter ID flight");
                    pl2.setId(scan.nextLine());

                    System.out.println("Enter beginning flight");
                    pl2.setArrivalTime(scan.nextLine());

                    System.out.println("Enter end flight");
                    pl2.setLeave(scan.nextLine());
                }
                case (2)->{
                    System.out.println("Enter ID flight");
                    pl3.setId(scan.nextLine());

                    System.out.println("Enter beginning flight");
                    pl3.setArrivalTime(scan.nextLine());

                    System.out.println("Enter end flight");
                    pl3.setLeave(scan.nextLine());
                }
                case (3)->{
                    System.out.println("Enter ID flight");
                    pl4.setId(scan.nextLine());

                    System.out.println("Enter beginning flight");
                    pl4.setArrivalTime(scan.nextLine());

                    System.out.println("Enter end flight");
                    pl4.setLeave(scan.nextLine());
                }
                case (4)->{
                    System.out.println("Enter ID flight");
                    pl5.setId(scan.nextLine());

                    System.out.println("Enter beginning flight");
                    pl5.setArrivalTime(scan.nextLine());

                    System.out.println("Enter end flight");
                    pl5.setLeave(scan.nextLine());
                }
                case (5)->{
                    System.out.println("Enter ID flight");
                    pl6.setId(scan.nextLine());

                    System.out.println("Enter beginning flight");
                    pl6.setArrivalTime(scan.nextLine());

                    System.out.println("Enter end flight");
                    pl6.setLeave(scan.nextLine());
                }*/
            }
        }

        if(pl1.isTwoHour(pl1.getArrivalTime(), pl1.getLeave())){
            System.out.println(pl1.toString());
        }
        /*if(pl2.isTwoHour(pl2.getArrivalTime(), pl2.getLeave())){
            System.out.println(pl2.toString());
        }
        if(pl3.isTwoHour(pl3.getArrivalTime(), pl3.getLeave())){
            System.out.println(pl3.toString());
        }
        if(pl4.isTwoHour(pl4.getArrivalTime(), pl4.getLeave())){
            System.out.println(pl4.toString());
        }
        if(pl5.isTwoHour(pl5.getArrivalTime(), pl5.getLeave())){
            System.out.println(pl5.toString());
        }
        if(pl6.isTwoHour(pl6.getArrivalTime(), pl6.getLeave())){
            System.out.println(pl6.toString());
        }*/
    }

    public static void Study(){
        Student1 Alex = new Student1();
        Student1 Amber = new Student1();
        Student1 Arsa = new Student1(); // Почему интересные мысли приходят в конце...
        Student1 Anny = new Student1(); // Вот закончив я понял что мог сделать это через конструктор...
        Student1 Leo = new Student1();
        Student1 Deo = new Student1();

        for(int i=0;i<6;i++){
            switch (i){
                case 0->{
                    Alex.setFullName("Alex Mercer");

                    System.out.println("Enter grade math");
                    Alex.setMath(scan.nextInt());// Тут можно создать переменные для создания проверки макс.значения оценки...
                                                // Но из за непредвиденные  обстоятельств она была опущена, и будет (по возможности) допиленна в сл.версиях
                    System.out.println("Enter grade english");
                    Alex.setEnglish(scan.nextInt());

                    System.out.println("Enter grade programming");
                    Alex.setProgramming(scan.nextInt());
                }
                case 1->
                {
                    Amber.setFullName("Amber Mercer");
                    System.out.println("Enter grade math");
                    Amber.setMath(scan.nextInt());

                    System.out.println("Enter grade english");
                    Amber.setEnglish(scan.nextInt());

                    System.out.println("Enter grade programming");
                    Amber.setProgramming(scan.nextInt());
                }
                case 2->
                {
                    Arsa.setFullName("Arsa Mercer");
                    System.out.println("Enter grade math");
                    Arsa.setMath(scan.nextInt());

                    System.out.println("Enter grade english");
                    Arsa.setEnglish(scan.nextInt());

                    System.out.println("Enter grade programming");
                    Arsa.setProgramming(scan.nextInt());
                }
                case 3->
                {
                    Anny.setFullName("Anny Mercer");
                    System.out.println("Enter grade math");
                    Anny.setMath(scan.nextInt());

                    System.out.println("Enter grade english");
                    Anny.setEnglish(scan.nextInt());

                    System.out.println("Enter grade programming");
                    Anny.setProgramming(scan.nextInt());
                }
                case 4->
                {
                    Leo.setFullName("Leo Mercer");
                    System.out.println("Enter grade math");
                    Leo.setMath(scan.nextInt());

                    System.out.println("Enter grade english");
                    Leo.setEnglish(scan.nextInt());

                    System.out.println("Enter grade programming");
                    Leo.setProgramming(scan.nextInt());
                }
                case 5->
                {
                    Deo.setFullName("Deo Mercer");
                    System.out.println("Enter grade math");
                    Deo.setMath(scan.nextInt());

                    System.out.println("Enter grade english");
                    Deo.setEnglish(scan.nextInt());

                    System.out.println("Enter grade programming");
                    Deo.setProgramming(scan.nextInt());
                }
            }
        }
        if(Alex.getMath()>3 && Alex.getEnglish()>3 && Alex.getEnglish()>3){
            System.out.println(Alex.toString());
        }

        if(Amber.getMath()>3 && Amber.getEnglish()>3 && Amber.getEnglish()>3){
            System.out.println(Amber.toString());
        }

        if(Arsa.getMath()>3 && Arsa.getEnglish()>3 && Arsa.getEnglish()>3){
            System.out.println(Arsa.toString());
        }

        if(Anny.getMath()>3 && Anny.getEnglish()>3 && Anny.getEnglish()>3){
            System.out.println(Anny.toString());
        }

        if(Leo.getMath()>3 && Leo.getEnglish()>3 && Leo.getEnglish()>3){
            System.out.println(Leo.toString());
        }

        if(Deo.getMath()>3 && Deo.getEnglish()>3 && Deo.getEnglish()>3){
            System.out.println(Deo.toString());
        }
        else if (Deo.getMath()<=3){
            System.out.println(Alex.toString());
        }

    }
    public static void Study1(){
        Student2 [] s = new Student2[3];
        s[0] = new Student2("Deo",2.0,15000);
        s[1] = new Student2("Leo",3.7,15000);
        s[2] = new Student2("Seo",4.7,15000);
        for (Student2 study:s ){
            study.printScholarship();
        }
    }

    public static void Book1(){
        enum Janre{
            Simple,
            Clssical,
            Bestseller
        }
        String sim = String.valueOf(Janre.Simple);
        String cl = String.valueOf(Janre.Clssical);
        String bes = String.valueOf(Janre.Bestseller);//Допустим тут возможен выбор из списка ¯\_(ツ)_/¯

        BookI b1 = new BookI("Harry Potter", "Rouling", 5500 ,bes );
        BookI b2 = new BookI("War and Piace","Tolstoy",5000,cl);
        BookI b3 = new BookI("Begginer","Me and You",4100,sim);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }
    public static void Book2(){
        System.out.println("Enter count book");
        int n = scan.nextInt();

        BookII[] book = new BookII[n];
        //BookII t = new BookII();

        for(int i =0; i<n; i++) {
            System.out.println("Enter book name");
            String na = scan.next();
            System.out.println();

            System.out.println("Enter cost book");
            int c = scan.nextInt();

            System.out.println("Enter type");
            String ty = scan.next();
            System.out.println();

            System.out.println("Enter sold");
            int s = scan.nextInt();
            System.out.println();
            book[i] = new BookII(na,c,ty,s);
                //n++;(Момент идеи,(Создаётся массив, через условие
                // проверка на добавление в массив, внутри если да, то создаётся н-ый массив, после каждого true услвовия
                // увеличение переменной н, и соответственно н-размерности массива)

            System.out.println(book[i].classic(book[i].getType()));
        }
        //System.out.println("test: " + t.classic(book[1].getType()));
    }
    public static void Candidate(){
        Canditate c1 = new Canditate("Leof Brutto", "banker" , 5000);
        Canditate c2 = new Canditate("Edisson", "chemist" , 35000);
        Canditate c3 = new Canditate("Mikiel Soners", "developer" , 51000);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    public static void Ship(){
        Ship s [] = new Ship[5];
        s[0] = new Ship("Avrora0","11-20",5,false);
        s[1] = new Ship("Avrora1","10-20",3,false);
        s[2] = new Ship("Avrora2","13-20",12,true);
        s[3] = new Ship("Avrora3","14-20",3,false);
        s[4] = new Ship("Avrora4","15-20",12,false);
        for(int i =0; i<5; i++){
            if(s[i].isDistress()){
                System.out.println(s[i]);
            }else {
                String [] h = s[i].getArivalTime().split("-");
                boolean isFalse = h[0].equals("10");
                if(isFalse==false){
                    int hour = Integer.parseInt(h[0]);
                    int timeDiffernce = hour - s[i].getStayTime();
                    if(timeDiffernce<12){
                        System.out.println(s[i]);
                    }
                }
            }
        }
    }
    public static void Project(){
        int budget = scan.nextInt();
        int sumCosts = 0;
        enum specType{
            Bussiness,
            Factory,
            Science
        }

        String specialCityBuild = "Factory";

        Project p[] = new Project[3];
        p[0] = new Project("Residential complex",12000,String.valueOf(specType.Bussiness),false);
        p[1] = new Project("Chemical Laboratory",32000,String.valueOf(specType.Science),true);
        p[2] = new Project("Metal Fabric",22000,String.valueOf(specType.Factory),false);

        for (Project proj:p) {
            if(proj.isGovernment()){
                if(proj.getType().equals(specialCityBuild)){
                    sumCosts+=proj.getCost()*0.2 + proj.getCost();
                }else
                    sumCosts += proj.getCost();
            }
        }
        if(sumCosts>budget){
            int sum = sumCosts - budget;
            System.out.println("Republic must: " + sum);
        }else {
            int sum = budget - sumCosts;
            System.out.println("rest of budget: " + sum);
        }
    }
}