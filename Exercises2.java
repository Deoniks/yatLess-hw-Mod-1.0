import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args)
    {
        HWtask8();
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
    char ch = scan.next().charAt(0);
    boolean isLow = (ch >= 'a' && ch <= 'z');
    boolean isUpp = (ch >= 'A' && ch <= 'Z');
    String vowel = "aeoiuy";
    char[] vowels = vowel.toCharArray();

    if (isLow || isUpp)
    {
        System.out.println(ch+ " is Alphabet");
    }
    else {System.out.println(ch+ " is not Alphabet");}
    }

/* **9. Write a  program to input any character and check whether it is alphabet, digit or special character**

**10. Write a  program to check whether a character is uppercase or lowercase alphabet**

**11. Write a  program to input week number and print week day**

**12. Write a  program to input month number and print month Name**

**13. Write a  program to count total number of notes in given amount**

**14. Write a  program to input angles of a triangle and check whether triangle is valid or not**

**15. Write a  program to input all sides of a triangle and check whether triangle is valid or not**

**16. Write a  program to check whether the triangle is equilateral, isosceles or scalene triangle**

**17. Write a  program to find all roots of a quadratic equation**

**18. Write a  program to calculate profit or loss**

**19. Write a  program to input marks of five subjects Physics,
Chemistry, Biology, Mathematics and Computer. Calculate percentage and
grade according to following:**

- Percentage >= 90% : Grade A
- Percentage >= 80% : Grade B
- Percentage >= 70% : Grade C
- Percentage >= 60% : Grade D
- Percentage >= 40% : Grade E
- Percentage < 40% : Grade F

**20. Write a  program to input basic salary of an employee and calculate its Gross salary according to following:**

- Basic Salary <= 10000 : HRA = 20%, DA = 80%
- Basic Salary <= 20000 : HRA = 25%, DA = 90%
- Basic Salary > 20000 : HRA = 30%, DA = 95%

**21. Write a  program to input electricity unit charges and calculate total electricity bill according to the given condition:**

- For first 50 units Rs. 0.50/unit
- For next 150 units Rs. 0.75/unit
- For next 250 units Rs. 1.20/unit
- For unit above 250 Rs. 1.50/unit
- An additional surcharge of 20% is added to the bill

**22. while purchasing certain items, a discount of 10% is offered
if the quantity purchased is more than 100. If quantity and price per
item are input through the keyboard, write a program to calculate the
total expenses**

**23. The current year and the year in which the employee joined
the organization are entered through the keyboard. If the number of
years for which the employee has served the organization is greater than
 3 then a bonus of Rs. 2500/- is given to the employee. If the years of
service are not greater than 3, then the program should do nothing**

**24. If his basic salary is less than Rs. 1500, then HRA = 10% of
basic salary and DA = 90% of basic salary. If his salary is either equal
 to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary.
If the employee's salary is input through the keyboard write a program
to find his gross salary***/
}