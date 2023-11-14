import java.util.Scanner;

public class Exercises4
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        Exs4();
    }
    /*
        Дан номер месяца — целое число в диапазоне 1–12

(1 — январь,

 2 — февраль и т. д.).

Вывести название соответствующего времени года («зима»,«весна», «лето», «осень»).*/
    private static void Exs1()
    {
        System.out.println("What now season (in month number)?");
        int numMonth = scan.nextInt();
        if(numMonth <= 12 && numMonth > 0)
        {
            switch (numMonth)
            {
                case 12,1,2 -> System.out.println("Now White Winter");
                case 3,4,5 -> System.out.println("Now Blooming Spring");
                case 6,7,8 -> System.out.println("Now Sunny Summer");
                case 9,10,11 -> System.out.println("Now Rainy Autumn");
            }
        }
        else
            System.out.println("It's not mount number.Please again...");
    }

    /*### **Exercise 2:**

    Напишите программу для считывания гендера и печати соответствующего гендера, используя оператор switch

    Ввод: m

    Вывод: Мужчина*/
    private static void Exs2()
    {
        System.out.println("Hi, you man or woman");
        String gender = scan.next();

        switch (gender.toLowerCase())
        {
            case "man"-> System.out.println("What's up Bro, you cool Man");
            case "woman"->System.out.println("Welcome Beautiful Ladies");
        }
    }

    /*### **Exercise 3:**

    Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —февраль и т. д.).
     Определить количество дней в этом месяце для невисокосного года.*/
    private static void Exs3()
    {
        System.out.println("What now season ");
        int numMonth = scan.nextInt();
        if (numMonth <=12 && numMonth > 0)
        {
            switch (numMonth)
            {
                case 12,1,2->
                {
                    System.out.println("Now month - Winter");

                    switch (numMonth)
                    {
                        case 12-> System.out.println("In december 31 days");
                        case 1-> System.out.println("In January 31 days");
                        case 2-> System.out.println("Febrary has 28 days in non-loop years");
                    }
                }
                case 3,4,5->
                {
                    System.out.println("Now Month - Spring");
                    switch (numMonth)
                    {
                        case 3-> System.out.println("In March 31 days");
                        case 4-> System.out.println("In April 30 days");
                        case 5-> System.out.println("In May 31 days");
                    }
                }
                case 6,7,8->
                {
                    System.out.println("Now Month - Summer");
                    switch (numMonth)
                    {
                        case 6-> System.out.println("In June 31 days");
                        case 7-> System.out.println("In Jule 30 days");
                        case 8-> System.out.println("In August 31 days");
                    }
                }
                case 9,10,11->
                {
                    System.out.println("Now Month - Autumn");
                    switch (numMonth)
                    {
                        case 9-> System.out.println("In September 30 days");
                        case 10-> System.out.println("In October 30 days");
                        case 11-> System.out.println("In November 31 days");
                    }
                }
            }
        }else System.out.println("Error.Please Again");
    }

    /*### **Exercise 4:**

    Арифметические действия над числами пронумерованы следующим
    образом:

    1 — сложение,

    2 — вычитание,

    3 — умножение,

    4 — деление.

    Дан номер действия N (целое число в диапазоне 1–4) и вещественные числа A и B (В не равно 0).
    Выполнить над числами указанное действие и вывести результат.*/
    private static void Exs4()
    {
        System.out.println("Enter num 1-4 for arymphetic action");
        int actionNum = scan.nextInt();
        if (actionNum >= 1  && actionNum <= 4)
        {
            System.out.println("Enter num A. Input number is not zero");
            double a = scan.nextDouble();
            if (a != 0)
            {
                System.out.println("Enter num B. Input number is not zero");
                double b = scan.nextDouble();
                if (b != 0)
                {
                 switch (actionNum)
                 {
                     case 1 ->
                     {
                         double res = a+b;
                         System.out.println("Result val a sum val b: " + res);
                     }
                     case 2 ->
                     {
                         double res = a-b;
                         System.out.println("Result val a subtract val b: " + res);
                     }
                     case 3->
                     {
                         double res = a*b;
                         System.out.println("Resul val a multiply val b: " + res);
                     }
                     case 4->
                     {
                         double res = a/b;
                         System.out.println("Result val a divide val b: " + res);
                     }
                 }
                } else System.out.println("Number is ZERO");
            }
            else System.out.println("Number is ZERO");
        } else System.out.println("NUMBER ACTION ERROR");

    }

    /*### **Exercise 5:**

    Единицы длины пронумерованы следующим образом:

    1 — дециметр,
    2 — километр,

    3 — метр,

    4 — миллиметр,

    5 — сантиметр.

    Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в этих единицах (вещественное число).
     Найти длину отрезка в метрах. */
    private static void Exs5(){}

    /*### **Exercise 6:**

    Единицы массы пронумерованы следующим образом:

    1 — килограмм,

    2 — миллиграмм,

    3 — грамм,

    4 — тонна,

    5 — центнер.

    Дан номер единицы массы (целое число в диапазоне 1–5) и масса тела в этих единицах
    (вещественное число). Найти массу тела в килограммах.*/
    private static void Exs6(){}

    /*### **Exercise 7:**

    Элементы окружности пронумерованы следующим образом:

    1 — радиус R,

    2 — диаметр D = 2·R,

    3 — длина L = 2·π·R,

    4 — площадь круга S = π·R2.

    Дан номер одного из этих элементов и его значение.
     Вывести значения остальных элементов данной окружности (в том же порядке). В качестве значения π использовать 3.14.*/
    private static void Exs7(){}

    /*### **Exercise 8:**

    Элементы равнобедренного прямоугольного треугольника пронумерованы следующим образом:

    1 — катет a,

    2 — гипотенуза c = a·√2,

    3 — высота h, опущенная на гипотенузу (h = c/2),

    4 — площадь S = c·h/2.
    Дан номер одного из этих элементов и его значение.
     Вывести значения остальных элементов данного треугольника (в том же порядке)
            * */
    private static void Exs8(){}
}
