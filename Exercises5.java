import java.util.Scanner;

public class Exercises5
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        HWStark6();
    }
    /* ### **Exercise 1:**

Write a method that read an input string from a user. It simply outputs string in a given format.

**Input:**
Air Astana
**Output:**
Message: Air Astana */
    private static void HWTask1()
    {
        System.out.println("Введите компанию");
        System.out.println(outMessage(inMessage()));
    }

    public static String inMessage()
    {
        String inpMess = scan.nextLine();
        return inpMess;
    }
    public static String outMessage(String message)
    {
        String mess = "Company: " + message;
        return mess;
    }

/* ### **Exercise 2:**

Write a Java method to find the smallest number among the three numbers. Name a method ‘***smallestOfThree’***.

**Input:**
Enter the first number: 25
Enter the second number: 37
Enter the third number: 29
**Output:**
The smallest number is: 25 */
    private static void HWTask2()
    {
        System.out.println("Введите три числа для нахождения наименьшего...");
        System.out.println("Наименьшее значение: " + smallestNum());
    }
    public static int smallestNum()
    {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        boolean isSmallA = (a<b && a<c);
        boolean isSmallB = (b<a && b<c);
        boolean isSmallC = (c<b && c<a);
        int small = 0;

        if (isSmallA)
        {
            small = a;
        } else if (isSmallB) {
            small = b;
        } else if (isSmallC) {
            small = c;
        }
        return small;
    }

/* ### **Exercise 3:**

Write a Java method that check if the entered number is negative or positive or zero.

**Input 1:**
Enter number: 1
**Output 1:**
Positive

**Input 2:**
Enter number: -1
**Output 2:**
Negative */
    private static void HWTask3()
    {
        System.out.println("Введите число");
        int a = scan.nextInt();
        npz(a);
    }

    public static int npz(int a)
    {
        int num = 0;
        if(a<0)
        {
            num = a;
            System.out.println("Num is negative");
        } else if (a==0) {
            num = a;
            System.out.println("Num is zero");
        }
        else if (a > 0)
        {
            num = a;
            System.out.println("Num is positive");
        }
        return num;
    }

/* ### **Exercise 4:**

Write a method for squaring a number.

**Input 1:**
3.0
**Output 1:**
9.0

**Input 2:**
2.5
**Output 2:**
6.25 */
    private static void HWTask4()
    {
        System.out.println("Введите число для возведение в квадрат");
        double pow = scan.nextDouble();
        System.out.println(pow + " в квадрате:" +  pow(pow));
    }
    public static double pow(double pow)
    {
        double p = pow*pow;
        return p;
    }

/* ### **Exercise 5**:

Write a console calculator method. (operations: +, - , * , / ). Your method should accept two integer numbers and char symbol that indicates arithmetic operation. Name a method ‘***myCalculator***’

**Input 1:**
Enter the number: 3
Enter the number: 6
Enter the operation: *
**Output 1:**
Total: 3 * 6 = 18

**Input 2:**
Enter the number: 3
Enter the number: 6
Enter the operation: +
**Output 2:**
Total: 3 + 6 = 9

**Input 3:**
Enter the number: 6
Enter the number: 3
Enter the operation: /
**Output 3:**
Total: 6 / 3 = 2

**Input 4:**
Enter the number: 3
Enter the number: 6
Enter the operation: -
**Output 4:**
Total: 3 - 6 = -3 */
    private static void HWTask5()
    {
        System.out.println("Enter the number 1");
        int a = scan.nextInt();
        System.out.println("Enter the number 2");
        int b = scan.nextInt();

        System.out.println("Enter the operator");
        char c = scan.next().charAt(0);

        System.out.println(a + "" + c + "" + b + " = " + isOper(c,a,b)) ;
    }

    public static int isOper(char c, int a, int b)
    {
        char oper = c;
        int res = 0;
        if(oper == '+' || oper == '-'||oper =='*'|| oper=='/')
        {
            switch (oper)
            {
                case '+':
                    res = a+b;
                    break;
                case '-':
                    res = a-b;
                    break;
                case '*':
                    res = a*b;
                    break;
                case '/':
                    res = a/b;
                    break;
                default:
                    System.out.println("такого арифметического символа не существет");
            }
        }
        return res;
    }

/* ### **Exercise 6:**

Write a Java method to compute the average of three numbers. Your method should accept three double values. Name your method as ‘***averageOfThree***’.

**Input:**
Enter the first number: 6.0
Enter the second number: 9.0
Enter the third number: 15.0
**Output:**
Average of three number is: 10.0 */
    private static void HWStark6()
    {
        System.out.println("Enter the number 1");
        double a = scan.nextDouble();
        System.out.println("Enter the number 2");
        double b = scan.nextDouble();
        System.out.println("Enter the number 3");
        double c = scan.nextDouble();

        System.out.println("Среднее значение: " + averageOfThree(a,b,c)) ;
    }
    public static double averageOfThree(double a, double b, double c)
    {
        double average = (a+b+c)/3;

        return average;
    }

/* ### **Exercise 7:**

Write a Java method to display the middle character of a string.

**Input 1:**
Enter string:
The Lord of the Rings
**Output 1:**
Middle character is: f

**Input 2:**
Enter string:
ImagineDragons
**Output 2:**
Middle character is: eD */
    private static void HWTask7()
    {

    }

/* ### **Exercise 8:**

Write a Java method to compute the sum of digits in an integer.

**Input:**
Input an integer: 25498
**Output:**
The sum is: 28*/
    private static void HWTask8()
    {
        System.out.println("Enter the number 1");
        int a = scan.nextInt();
        System.out.println("Enter the number 2");
        int b = scan.nextInt();
        System.out.println("сумма:"+ sum(a,b));

    }
    public static int sum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
}
