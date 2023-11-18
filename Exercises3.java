import java.util.Scanner;

public class Exercises3
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        HWtask39();

    }
    /* **25. The marks obtained by a student in 5 different subjects are
input through the keyboard. The student gets a division as per the
following rules: Write a program to calculate the division obtained by
the student**

- Percentage above or equal to 60 - First division
- Percentage between 50 and 59 - Second division
- Percentage between 40 and 49 - Third division
- Percentage less than 40 – Fail*/
    private static void hwTask25()
    {
        //Student receives grades on a 100-point scale
        System.out.println("You marks obtained to Math(0-100)");
        int Math = scan.nextInt();
        youAcadPerformance(Math);

        System.out.println("You marks obtained to Chemistry(0-100)");
        int Chemistry = scan.nextInt();
        youAcadPerformance(Chemistry);

        System.out.println("You marks obtained to Physic(0-100)");
        int Physic = scan.nextInt();
        youAcadPerformance(Physic);

        System.out.println("You marks obtained to Philosophy(0-100)");
        int Philosophy = scan.nextInt();
        youAcadPerformance(Philosophy);

        System.out.println("You marks obtained to Physical education(0-100)");
        int PhysicalEduc = scan.nextInt();
        youAcadPerformance(PhysicalEduc);
    }
    static int youAcadPerformance(int i)
    {
        boolean isFirstDivis = (i >= 60 && i <101);
        boolean isSecondDivis = (i >=50 && i <= 59);
        boolean isThirdDivis = (i >= 40 && i<= 49);
        boolean isFall = (i >=0 && i<=39);
        if(isFirstDivis)
        {
            System.out.println("Very nice. First Division.");
        } else if (isSecondDivis) {
            System.out.println("Not bad, not bad. Second division");

        } else if (isThirdDivis) {
            System.out.println("Third division. Hmm, you maybe fall and retake?;)");

        } else if (isFall)
        {
            System.out.println("RETA-A-A-A-KE");
        }else System.out.println("You entered the value incorrectly");
        return i;
    }

    /* **26. A company insures its drivers in the following cases:**

- If the driver is married
- If the driver is unmarried, male & above 30 years of age
- If the driver is unmarried, female & above 25 years of age */
    private static void hwTask26()
    {
        System.out.println("Enter you gender:man <- or -> woman");
        String gen = scan.nextLine();

        System.out.println("You married? (yes <- or -> no");
        String mar = scan.nextLine();

        isMarried(mar,gen);
    }
    /*static String gender(String gend)
    {
        String gen = gend.toLowerCase();
        String man = "man";
        String woman = "woman";
        /*switch (gen)
        {
            case "man" -> System.out.println("Man");
            case "woman" -> System.out.println("woman");
            default -> System.out.println("Only 2 genders");
        }
        if (man.equals(gen))
        {
            System.out.println("You man");

        } else if (woman.equals(gen))
        {
            System.out.println("You woman");
        }
        else
            System.out.println("There are only TWO genders");

        return gend;
    }*/
    static int age(String gender)
    {
        final String man = "man";
        final String woman = "woman";
        String gen = gender.toLowerCase();

        System.out.println("How old are you?");
        int age = scan.nextInt();

        if(man.equals(gen) && age >= 30)
        {
            System.out.println("Insures it's drivers");
        }
        else if (man.equals(gen))
        {
            System.out.println("Do not insures it's drivers");
        } else if (woman.equals(gen) && age >= 25)
        {
            System.out.println("Insures it's drivers");
        }
        else if (woman.equals(gen))
        {
            System.out.println("Do not insures it's drivers");
        }
        else System.out.println("Error");

        return age;
    }
     static String isMarried(String marriage, String gender)
    {
        final String yes = "yes";
        String isMarried = marriage.toLowerCase();
        boolean isMarriedTo = (yes.equals(isMarried));

        if(isMarriedTo)
        {
            System.out.println("you married. You Insures it's drivers");
        }
        else {
            System.out.println("you single");
            age(gender);
        }

        return gender;
    }
    /* **27. Write a program to calculate the salary as per the following table**

| Gender | Year of Service | Qualifications | Salary |
| --- | --- | --- | --- |
| Male | >= 10 | Post - Graduate | 15000 |
|  | >= 10 | Graduate | 10000 |
|  | < 10 | Post - Graduate | 10000 |
|  | < 10 | Graduate | 7000 |
| Female | >= 10 | Post - Graduate | 12000 |
|  | >= 10 | Graduate | 9000 |
|  | < 10 | Post - Graduate | 10000 |
|  | < 10 | Graduate | 6000 | */
    private static void hwTask27()
    {
        System.out.println("Enter you gender");
        String gen = scan.nextLine();
        gend(gen);
    }
    static String gend(String gender)
    {
        String lowGen = gender.toLowerCase();
        final String man = "man";
        final String woman = "woman";

        if (man.equals(lowGen))
        {
            System.out.println("How you Age?");
            int age =scan.nextInt();
            yearIsServ(age);
        }
        else if (woman.equals(lowGen))
        {
            System.out.println("How you Age?");
            int age =scan.nextInt();
            yearIsServ(age);

        }
        return lowGen;
    }

    static int yearIsServ(int age)
    {
        //String nl = scan.nextLine();

        Scanner s = new Scanner(System.in);
        if(age >= 10 && age <=99)
        {
            System.out.println("Enter g or pg for choise qualification");
            String quals = scan.nextLine();
            String qual = scan.nextLine();
            qualification(qual);
        } else if (age < 10 && age > 0)
        {
            System.out.println("Enter g or pg for choise qualification");
            String qual = scan.nextLine();
            qualification(qual);
        }
        return age;
    }

    static String qualification(String qual)
    {
        final String postGrad = "pg";
        final String grad = "g";

        String qualif = qual.toLowerCase();
        //System.out.println("sad " +qualif);

        if(postGrad.equals(qualif))
        {
            System.out.println(qualif);
        } else if (grad.equals("0 - "+ qualif))
        {
            System.out.println("1 - " + qualif);
        }
        return qualif;
    }

    static int salary (String gen, int age, String qual)
    {
        int salary = 0;
        if(gen.equals("man") && age >=10 && qual.equals("pg"))
        {
            salary = salary + 15000;
            System.out.println("You salary: " + salary);
        }
        else if (gen.equals("man") && age >=10 && qual.equals("g"))
        {
            salary = salary + 10000;
            System.out.println("You salary: " + salary);
        }
        else if (gen.equals("man") && age <=10 && qual.equals("pg"))
        {
            salary = salary + 10000;
            System.out.println("You salary: " + salary);
        }
        else if (gen.equals("man") && age <=10 && qual.equals("g"))
        {
            salary = salary + 7000;
            System.out.println("You salary: " + salary);
        }
        else if (gen.equals("woman") && age >=10 && qual.equals("pg"))
        {
            salary = salary + 12000;
            System.out.println("You salary: " + salary);
        }
        else if (gen.equals("woman") && age >=10 && qual.equals("g"))
        {
            salary = salary + 9000;
            System.out.println("You salary: " + salary);
        }
        else if (gen.equals("woman") && age <=10 && qual.equals("pg"))
        {
            salary = salary + 10000;
            System.out.println("You salary: " + salary);
        }
        else if (gen.equals("woman") && age <=10 && qual.equals("g"))
        {
            salary = salary + 6000;
            System.out.println("You salary: " + salary);
        }
        else
            System.out.println("Err!!!");

        return salary;
    }

    /* **28. A five-digit number is entered through the keyboard. Write a
program to obtain the reversed number and to determine whether the
original and reversed numbers are equal or not** */

    private static void HWtask28()
    {
        System.out.println("Введите 5-ти значное число");
        int f = scan.nextInt();

        int fRev = f / 10000 + f / 1000 % 10*10 + f / 100 % 10 *100 + f / 10 % 10 * 1000 + f % 10 * 10000;

        System.out.println(fRev);
        if(f == fRev)
        {
            System.out.println("Реверсивное значение равно оригинальному");
        }else System.out.println("Реверсивное значение не равно оригинальному");
    }

    /* **29. If the ages of Ram, Shyam and Ajay are input through the keyboard,
     write a program to determine the youngest of the three**
     */
    private static void HWtask29()
    {
        System.out.println("Enter age Ram");
        int ageRam = scan.nextInt();
        System.out.println("Enter age Shyam");
        int ageShyam = scan.nextInt();
        System.out.println("Enter age Ajay");
        int ageAjay = scan.nextInt();

        if(ageRam < ageShyam && ageRam < ageAjay)
        {
            System.out.println("Ram is youngest" );
        } else if (ageShyam < ageRam && ageShyam < ageAjay)
        {
            System.out.println("Shyam is youngest");
        } else if (ageAjay < ageRam && ageAjay < ageShyam)
        {
            System.out.println("Ajay is youngest");
        }
    }

    /* **30. Write a program to check whether a triangle is valid or not,
when the three angles of the triangle are entered through the keyboard. A
 triangle is valid if the sum of all the three angles is equal to 180
degrees** */
    private static void HWtask30()
    {
        System.out.println("Введите первый угол: ");
        int a = scan.nextInt();
        System.out.println("Введите второй угол: ");
        int b = scan.nextInt();
        System.out.println("Введите третий угол: ");
        int c = scan.nextInt();
        if ((a + b + c) == 180)
            System.out.println("Это действительный треугольник");
        else
            System.out.println("Это не действительный треугольник");
    }

    /* **31. Find the absolute value of a number entered through the keyboard** */
    private static void HWtask31()
    {
        System.out.println("Введите любое абсолютное число");
        int f = scan.nextInt();
        if (f<0)
        {
            f = (f-f)+(-f);
            System.out.println(f);
        }else System.out.println(f);
    }

    /* **32. Given the length and breadth of a rectangle, write a program
to find whether the area of the rectangle is greater than its perimeter.
 For example, the area of the rectangle with length = 5 and breadth = 4
is greater than its perimeter** */
    private static void HWtask32()
    {
        System.out.println("length rectangle");
        int a = scan.nextInt();
        System.out.println("breadth rectangle");
        int b = scan.nextInt();// S rectangle = a*b; P = (a+b)*2
        int S = a*b;
        int P = (a+b) * 2;
        System.out.println("Площадь: "+S+" Периметр: " + P);
        if(S>P)
        {
            System.out.println("Площадь больше периметра");
        }else System.out.println("Периметр больше площади");
    }

    /* **33. A certain grade of steel is graded according to the following conditions**

1. Hardness must be greater than 50
2. Carbon content must be less than 0.7
3. Tensile strength must be greater than 5600

The grades are as follows:

- Grade is 10 if all three conditions are met
- Grade is 9 if conditions (i) and (ii) are met
- Grade is 8 if conditions (ii) and (iii) are met
- Grade is 7 if conditions (i) and (iii) are met
- Grade is 6 if only one condition is met
- Grade is 5 if none of the conditions are met

Write a program, which will require the user to give values of
hardness, carbon content and tensile strength of the steel under
consideration and output the grade of the steel */
    private static void HWtask33()
    {
        System.out.println("Введите твердость стали: ");
        int a = scan.nextInt();
        boolean isHardnest = (a > 50);

        System.out.println("Введите содержание углерода: ");
        double b = scan.nextDouble();
        boolean isCarbon = (b < 0.7);

        System.out.println("Введите предел прочности: ");
        int c = scan.nextInt();
        boolean isStrength = (c > 5600);

        if(isHardnest && isCarbon && isStrength)
        {
            System.out.println("Оценка марки стали: 10");
        } else if (isHardnest && isCarbon) {
            System.out.println("Оценка марки стали: 9");
        } else if (isCarbon && isStrength) {
            System.out.println("Оценка марки стали: 8");
        } else if (isHardnest && isStrength) {
            System.out.println("Оценка марки стали: 7");
        } else if (isHardnest||isCarbon||isStrength) {
            System.out.println("Оценка марки стали: 6");
        }else System.out.println("Оценка марки стали: 5");

    }

    /* **34. A library charges a fine for every book returned late. For
first 5 days the fine is 50 paise, for 6-10 days fine is one rupee and
above 10 days fine is 5 rupees. If you return the book after 30 days
your membership will be cancelled. Write a program to accept the number
of days the member is late to return the book and display the fine or
the appropriate message** */
    private static void HWtask34()
    {
        System.out.println("Сколько дней была задержка?");
        int day = scan.nextInt();

        boolean isFirst = (day > 0 && day <=5);
        boolean isSecon = (day >=6 && day <=10);
        boolean isThird = (day > 10 && day <=29);
        boolean isFour = (day > 30);

        if (isFirst)
        {
            System.out.println("Читатель должен оплатить штраф в размере 50 пайсов");
        } else if (isSecon) {
            System.out.println("Читатель должен оплатить штраф в размере 1 рупия");
        } else if (isThird) {
            System.out.println("Читатель должен оплатить штраф в размере 5 рупий");
        } else if (isFour) {
            System.out.println("Данный читатель лишается членства");
        }
        else System.out.println("Error");
    }

    /* **35. In a company, worker efficiency is determined on the basis of the time required for a worker to complete a particular job.
 If the  time taken by the worker is between 2 – 3 hours, then the worker is said to be highly efficient.
  If the time required by the worker is between 3 – 4 hours, then the worker is ordered to improve speed.
  If the time  taken is between 4 – 5 hours, the worker is given training to improve  his speed,
  and if the time taken by the worker is more than 5 hours, then the worker has to leave the company.
   If the time taken by the worker is input through the keyboard, find the efficiency of the worker** */
    private static void HWtask35()
    {
        System.out.println("Введите время работы сотрудника?");
        int time = scan.nextInt();

        boolean isFirst = (time >= 01 && time <3);
        boolean isSecon = (time >=3 && time <4);
        boolean isThird = (time >= 4 && time <5);
        boolean isFour = (time >= 5);

        if (isFirst)
        {
            System.out.println("Данный сотрудниик - высокоэффективен");
        } else if (isSecon) {
            System.out.println("Данный сотрудник - приказ увеличить скорость работы ");
        } else if (isThird) {
            System.out.println("Данный сотрудник - Обучить");
        } else if (isFour) {
            System.out.println("Данный сотрудник - Уволить");
        }
        else System.out.println("Error");
    }
    /* **36. Write a Java program that accepts three numbers and check All numbers are equal or not** */
    private static void HWtask36()
    {
        System.out.println("Введите число 1");
        int a = scan.nextInt();

        System.out.println("Введите число 2");
        int b = scan.nextInt();

        System.out.println("Введите число 3");
        int c = scan.nextInt();

        boolean isEquil = (a == b && b == c);

        if (isEquil)
        {
            System.out.println("Числа равны");
        }else System.out.println("Числа не равны");
    }

    /* **37. Write a Java program that reads an positive integer and count the number of digits** */
    private static void HWtask37()
    {
        System.out.println("Введите целое число");
        int c = scan.nextInt();

        boolean isPositive = (c >= 0);
        if (isPositive)
        {
            String count = String.valueOf(String.valueOf(c).length());
            System.out.println("Кол-во элементов: "+count);
        }
    }
    /* **38. Write a java program that accepts three numbers from the user and check if numbers are in "increasing" or "decreasing" order**
*/
    private static void HWtask38()
    {
        System.out.println("Введите 1 целое число");
        int a = scan.nextInt();

        System.out.println("Введите 2 целое число");
        int b = scan.nextInt();

        System.out.println("Введите 3 целое число");
        int c = scan.nextInt();

        boolean isIncreasing = (a>b && b>c);
        boolean isDecreasing = (c>b && b>a);
        if(isIncreasing)
        {
            System.out.println("Increasing "+a + "" + b + "" + c);
        } else if (isDecreasing)
        {
            System.out.println("Decreasing "+c + "" + b + "" + a);
        }else System.out.println("Normal! " + a + "" + b + "" + c);
    }

    /* **39. Write a Java program to check whether the given integer is a multiple of 5** */
    private static void HWtask39()
    {
        System.out.println("Введите целое число кратное 5");
        int a = scan.nextInt();
        boolean isMultiple = (a % 5 ==0);

        if(isMultiple)
        {
            System.out.println("Данное число кратно пяти");
        }
        else
            System.out.println("Данное число не кратно пяти");
    }
}
