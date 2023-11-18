import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args)
    {
        HWtask17();
    }
    private static final Scanner scan = new Scanner(System.in);
    /*# Exercises 2.0

**1. Write a  program to find maximum between two numbers** */

    private static void HWT1()
    {
        System.out.println("Input num 1");
        int numA = scan.nextInt();
        System.out.println("Input num 2");
        int numB = scan.nextInt();

        if(numA > numB)
        {
            System.out.println("Value num 1: " + numA + " - max.");
        }
        else
        {
            System.out.println("Value num 2: "+ numB +" - max.");
        }
    }
    /*

**2. Write a  program to find maximum between three numbers** */
    private static void HWTask2()
    {
        System.out.println("Input num 1");
        int numA = scan.nextInt();
        System.out.println("Input num 2");
        int numB = scan.nextInt();
        System.out.println("Input num 3");
        int numC = scan.nextInt();

        if(numA > numB && numA > numC)
        {
            System.out.println("Max number value 1: "+ numA);
        }
        else if(numB > numA && numB > numC)
        {
            System.out.println("Max number value 2: "+ numB);
        }
        else {System.out.println("Max number value 3: "+ numC);}
    }
/* **3. Write a  program to check whether a number is negative, positive or zero** */
    private static void HWTask3()
    {
        System.out.println("Input num 1");
        int num = scan.nextInt();
        boolean checkPos = (num > 0);
        boolean checkZero = (num == 0);
        if(checkPos)
        {
            System.out.println("Number is positive");
        } else if (checkZero)
        {
            System.out.println("Number is zero");
        }
        else {
            System.out.println("Number is negative");
        }
    }

/* **4. Write a  program to check whether a number is divisible by 5 and 11 or not** */
    private static void HWTask4()
    {
        System.out.println("Enter number is divisible by 5 and 11");
        final int cons = 55;
        int inVal = scan.nextInt();
        boolean isCheckInp = (cons == inVal);

        if (isCheckInp)
        {
            System.out.println(inVal + " this number divide to 5 and 11");
        } else {
            System.out.println(inVal + " this number is not divide to 5 and 11");
        }
    }

/* **5. Write a  program to check whether a number is even or odd** */
    private static void HWTask5()
    {
        System.out.println("Enter num ");
        int a = scan.nextInt();
        boolean isEven = (a % 2 == 0);
        if(isEven)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
/* **6. Write a  program to check whether a year is leap year or not** */
    private static void HWtask6()
    {
        System.out.println("Enter num ");
        int a = scan.nextInt();
        boolean isEven = (a % 4 == 0 || a % 400 == 0);
        if (isEven)
        {
            System.out.println("This year is leap");
        } else {System.out.println("This year is not leap");}
    }

/* **7. Write a  program to check whether a character is alphabet or not** */
    private static void HWtask7()
    {
        char ch = scan.next().charAt(0);
        boolean isLow = (ch >= 'a' && ch <= 'z');
        boolean isUpp = (ch >= 'A' && ch <= 'Z');

        if (isLow || isUpp)
        {
            System.out.println(ch+ " is Alphabet");
        }
        else {System.out.println(ch+ " is not Alphabet");}
    }

/* **8. Write a  program to input any alphabet and check whether it is vowel or consonant** */
    private static void HWtask8()
    {
        System.out.println("Enter alphabet vowel: ");
        char ch = scan.next().charAt(0);
        boolean isLowel  = (ch == 'a' || ch == 'e'|| ch=='y'|| ch=='u'|| ch=='i'|| ch=='o');

        if (isLowel)
        {
            System.out.println(ch+ " is vowel");
        }
        else
        {
            System.out.println(ch + " is consonant");
        }
    }

 /* **9. Write a  program to input any character and check whether it is alphabet, digit or special character** */
    private static void HWtask9()
    {
        System.out.println("Enter alphabet vowel: ");
        char ch = scan.next().charAt(0);
        boolean isLowel  = (ch == 'a' || ch == 'e'|| ch=='y'|| ch=='u'|| ch=='i'|| ch=='o');
        boolean isNumber = (ch >= '0' && ch <= '9');
        boolean isSimbol = (ch >='!' && ch<='?'|| ch =='~'|| ch >='@' && ch<='_'|| ch=='/' || ch =='|'|| ch=='`');

        if (isLowel)
        {
            System.out.println(ch+ " is vowel");
        }
        else if(isNumber)
        {
            System.out.println(ch+ " is Number");
        }
        else if (isSimbol)
        {
            System.out.println("Is simbol");
        }
        else
        {
            System.out.println(ch + " is consonant");
        }
    }


/* **10. Write a  program to check whether a character is uppercase or lowercase alphabet** */
    private static void HWtask10()
    {
        System.out.println("Enter alphabet simbol");
        char ch = scan.next().charAt(0);
        boolean isLow = (ch >= 'a' && ch <= 'z');
        boolean isUpp = (ch >= 'A' && ch <= 'Z');
        if (isLow)
        {
            System.out.println("This alphabet simbol: "+ ch + " - is lowercase");
        } else if (isUpp) {
            System.out.println("This alphabet simbol: "+ ch + " - is Uppercase");
        }
        else System.out.println("This simbol element is not alphabet");
    }

/* **11. Write a  program to input week number and print week day** */
private static void HWtask11()
{
    System.out.println("Enter 1 to 7");
    int numWeek = scan.nextInt();
    boolean Mon = (numWeek == 1);
    boolean Tue = (numWeek == 2);
    boolean Wed = (numWeek == 3);
    boolean Thu = (numWeek == 4);
    boolean Fri = (numWeek == 5);
    boolean Sat = (numWeek == 6);
    boolean Sun = (numWeek == 7);

    if(numWeek > 0 && numWeek < 8)
    {
        if (Mon)
        {
            System.out.println("Monday");
        } else if (Tue) {
            System.out.println("Tuesday");
        }
        else if (Wed) {
            System.out.println("Wednesday");
        }
        else if (Thu) {
            System.out.println("Thursday");
        }
        else if (Fri) {
            System.out.println("Friday");
        }else if (Sat) {
            System.out.println("Saturday");
        }
        else if (Sun) {
            System.out.println("Sunday");
        }//else System.out.println("Is not day");
    }else System.out.println("Incorrect input");
}

/* **12. Write a  program to input month number and print month Name** */
private static void HWtask12()
{
    System.out.println("Enter 1 to 12");
    int numMonth = scan.nextInt();

    boolean Winter = (numMonth >=1 && numMonth <=2 || numMonth == 12 );
    boolean Spring = (numMonth >= 3 && numMonth <=5);
    boolean Summer = (numMonth >= 6 && numMonth <=8);
    boolean Aurum = (numMonth >= 9 && numMonth <=11);

    if(numMonth > 0 && numMonth < 13)
    {
        if (Winter)
        {
            if(numMonth == 12)
            {
                System.out.println("Декабрь");
            } else if ( numMonth == 1)
            {
                System.out.println("Январь");
            } else if (numMonth == 2)
            {
                System.out.println("Февраль");
            }
        }
        else if (Spring) {
            if(numMonth == 3)
            {
                System.out.println("Март");
            } else if ( numMonth == 4)
            {
                System.out.println("Апрель");
            } else if (numMonth == 5)
            {
                System.out.println("Мая");
            }
        }
        else if (Summer) {
            if(numMonth == 6)
            {
                System.out.println("Июнь");
            } else if ( numMonth == 7)
            {
                System.out.println("Июль");
            } else if (numMonth == 8)
            {
                System.out.println("Август");
            }
        }
        else if (Aurum) {
            if(numMonth == 9)
            {
                System.out.println("Сентябрь");
            } else if ( numMonth == 10)
            {
                System.out.println("Октябрь");
            } else if (numMonth ==11)
            {
                System.out.println("Ноябрь");
            }
        }
    }else System.out.println("Incorrect input");
}

/* **13. Write a  program to count total number of notes in given amount** */
    private static void HWtask13()
    {
        System.out.println("Введите имееющиеся кол-во средств");
        int a = scan.nextInt();
        System.out.println("Введите номинал банкноты(5,10,20,50,100)");
        int b = scan.nextInt();
        boolean isAmount = (b == 5 || b == 10|| b == 20 || b == 50 || b == 100);
        if(isAmount)
        {
            int c = a / b;
            System.out.println("У вас имеется средств данным номиналом : " + c);
        }
        else System.out.println("Данного номинала не существует");
    }

/* **14. Write a  program to input angles of a triangle and check whether triangle is valid or not** */
private static void HWtask14()
{
    System.out.println("Угол 1");
    int a = scan.nextInt();
    System.out.println("Уголо 2");
    int b = scan.nextInt();
    System.out.println("Уголо 3");
    int c = scan.nextInt();
    boolean isTriangle = (a > 0 && b > 0 && c > 0);
    if(isTriangle)
    {
        System.out.println("Это треугольник");
    }
    else System.out.println("Это не треугольник");
}


/* **15. Write a  program to input all sides of a triangle and check whether triangle is valid or not** */
private static void HWtask15()
{
    System.out.println("Угол 1");
    int a = scan.nextInt();
    System.out.println("Уголо 2");
    int b = scan.nextInt();
    System.out.println("Уголо 3");
    int c = scan.nextInt();
    boolean isTriangle = (a > 0 && b > 0 && c > 0);
    if(isTriangle)
    {
        System.out.println("Это треугольник");
    }
    else System.out.println("Это не треугольник");
}

/* **16. Write a  program to check whether the triangle is equilateral, isosceles or scalene triangle** */
private static void HWtask16()
{
    System.out.println("Угол 1");
    int a = scan.nextInt();
    System.out.println("Уголо 2");
    int b = scan.nextInt();
    System.out.println("Уголо 3");
    int c = scan.nextInt();
    boolean isEquilateral = (a == b && a == c && b == c);
    boolean isIsosceles = (a == b || a == c );
    boolean isVersatile = (a != b && a != c && b != c);;
    if(isEquilateral)
    {
        System.out.println("Равносторонний");
    }
    else if (isIsosceles)
    {
        System.out.println("Равнобедренный");
    } else if (isVersatile)
    {
        System.out.println("Разносторонний");
    }
}

/* **17. Write a  program to find all roots of a quadratic equation** */
    private static void HWtask17()
    {
        System.out.println("Введите число из которого хотите извлечь квадратный корень");
        double sqr = scan.nextDouble();
        double sq = Math.sqrt(sqr);
        System.out.println(sq);
    }

/* **18. Write a  program to calculate profit or loss** */
    private static void  HWtask18()
    {
        System.out.println("Введите ваш баланс");
        int balance = scan.nextInt();

        System.out.println("Введите сколько вы получили");
        int a = scan.nextInt();

        if(a > 0)
        {
            int res = balance + a;
            System.out.println("Profit! Your balance: " + res);
        } else if (a < 0)
        {
            int res = balance - a;
            System.out.println("You loss!! Your balance: " + res );
        }
    }

/* **19. Write a  program to input marks of five subjects Physics,
Chemistry, Biology, Mathematics and Computer. Calculate percentage and
grade according to following:**

- Percentage >= 90% : Grade A
- Percentage >= 80% : Grade B
- Percentage >= 70% : Grade C
- Percentage >= 60% : Grade D
- Percentage >= 40% : Grade E
- Percentage < 40% : Grade F

 */
    private static void HWtask19()
    {
        int a = new Scanner(System.in).nextInt();
        if (a >= 90 && a <=100)
            System.out.println("You grade - A");
        else if (a >= 80 && a <= 89)
            System.out.println("You grade - B");
        else if (a >= 70 && a <= 79)
            System.out.println("You grade - C");
        else if (a >= 60 && a <= 69)
            System.out.println("You grade - D");
        else if (a >= 40 && a <= 59)
            System.out.println("You grade - C");
        else if(a >= 0 && a <=39)
            System.out.println("You grade - C");
    }

/* **20. Write a  program to input basic salary of an employee and calculate its Gross salary according to following:**

- Basic Salary <= 10000 : HRA = 20%, DA = 80%
- Basic Salary <= 20000 : HRA = 25%, DA = 90%
- Basic Salary > 20000 : HRA = 30%, DA = 95%

/* **21. Write a  program to input electricity unit charges and calculate total electricity bill according to the given condition:**

- For first 50 units Rs. 0.50/unit
- For next 150 units Rs. 0.75/unit
- For next 250 units Rs. 1.20/unit
- For unit above 250 Rs. 1.50/unit
- An additional surcharge of 20% is added to the bill

/* **22. while purchasing certain items, a discount of 10% is offered
if the quantity purchased is more than 100. If quantity and price per
item are input through the keyboard, write a program to calculate the
total expenses**

/* **23. The current year and the year in which the employee joined
the organization are entered through the keyboard. If the number of
years for which the employee has served the organization is greater than
 3 then a bonus of Rs. 2500/- is given to the employee. If the years of
service are not greater than 3, then the program should do nothing**

/* **24. If his basic salary is less than Rs. 1500, then HRA = 10% of
basic salary and DA = 90% of basic salary. If his salary is either equal
 to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary.
If the employee's salary is input through the keyboard write a program
to find his gross salary** */
}