import java.util.Scanner;

public class Exercises6
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)

    {
     HWTask6();
    }
    /*
    **Exercise 1: calculate the sum of 10 numbers**

     Ask the user for a fixed amount of numbers. The amount is fixed by the text of the exercise: it is 10. When the user finishes typing the 10 numbers, calculate and print the sum.

     **Input:**

     Please enter number 1: 48
     Please enter number 2: 29
     Please enter number 3: 3
     Please enter number 4: -13
     Please enter number 5: 58
     Please enter number 6: -84
     Please enter number 7: 31
     Please enter number 8: 0
     Please enter number 9: 14
     Please enter number 10: -9

     **Output:**

     The sum of the numbers is: 77 */
    private static void HWTask1()
    {
        System.out.println("Введите последовательн 10 чисел ");
        int sum = 0;
        for(int i = 0; i <= 9 ; i++)
        {
            int a = scan.nextInt();
            sum += a;
            System.out.println("Сумма:"+sum );
        }
    }

     /* **Exercise 2: calculate the sum of N numbers**

     Ask the user for a fixed amount of numbers. The amount is fixed but decided by the user, before they start typing the numbers. We ask the user for the amount of numbers they plan to type and call it *N*. When the user finishes typing the N numbers, calculate and print sum.

     **Input:**

     How many numbers? 6
     Please enter number 1: 93
     Please enter number 2: -3
     Please enter number 3: 84
     Please enter number 4: 0
     Please enter number 5: 35
     Please enter number 6: -12

     **Ouput:**
     The sum of the numbers is: 197 */
    private static void HWTask2()
    {
        int sum = 0;
        System.out.println("Сколько чисел складывать собираетесь?");
        int iVal = scan.nextInt();
        for (int i = 1; i<=iVal;i++)
        {
            System.out.println("Введите число: "+i);
            int a = scan.nextInt();
            sum+=a;
        }
        System.out.println("Sum of num: " + sum);
    }

    /* **Exercises 3:** Find the factorial of a given number.

     **Input:**

     Please enter number: 5

     **Output:**

     Factorial 5! = 1 * 2 * 3 * 4 * 5 = 120;

     **Input:**

     Please enter number: 6

     **Output:**

     Factorial 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720;

     **Input:**

     Please enter number: 3

     **Output:**

     Factorial 3! = 1 * 2 * 3 = 6; */
    private static void HWTask3()
    {
        System.out.println("Enter find factorial number: ");
        int factorial = scan.nextInt();
        int f = 1;
        long sum = 1;
        for (int i = 0; i < factorial; i++)
        {
            sum *= f;
            f++;

        }System.out.println(sum);
    }

  /*  **Exercise 4:**

     1. Print out `Hello World` 3 times
     2. Use a loop to print the numbers from 1 to 10
     3. Use a loop to print a `*` 10 times
     4. Use a loop to print the numbers starting from 5 to -5
     5. Use a loop to print every third number from 5 to 30

     *Try using both a `for` loop and a `while` loop**/

    public static void HWTask4()
    {
        /*1.Question: Print out 3 times->Hello World
        int i1=0;
        do{
            System.out.println("Hello world");
            i1++;
        }while (i1<3);*/

        /*2.Question: print the numbers from 1 to 10
        for(int i0=1;i0<=10;i0++)
        {
            System.out.println(i0);
        }*/
        /*3.Question: print a *,10 times
        int i2=0;
        while(i2<10){
            System.out.printf(i2 + ":*, ");
            i2++;
        }*/
        /*4.Question print starting 5 to -5
        for(int i=5;i>-6;i--){
            System.out.print(i + " ");
        }*/
        /*5.Question: print every third num from 5 to 30*/
        int i4=5;
        while(i4<31)
        {
            System.out.println(i4);
            i4+=3;
        }
    }
    /* **Exercise 5:**

     Write a method that prints out the statement

     `I am now printing for the [Number of iteration]th time`

     Run 10 iterations */
    public static void HWTask5()
    {
        for(int i=1;i<=10;i++){
            System.out.println("Number of iteration: "+i);
        }
    }

   /*  **Exercise 6:**

     Given an integer N (> 0).

     Find the amount 1 + 1/2 + 1/3 + . . . + 1/ N (real number).
     */
    public static void HWTask6(){
        int n = scan.nextInt();
        if (n > 0) {
            double sum = 0;
            for(double i=1;i<=n;i++) {
                sum += 1/i;
                System.out.println(sum);
            }
        }else System.out.println("num less zero");
        }

}
