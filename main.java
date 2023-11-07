import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        hwTask5();
    }
    private static void hwTask1()
    {
        String name = "K. Dmitriy";
        System.out.println("Hello ");
        System.out.println(name);
    }
    private static void hwTask2()
    {
        int a = 74, b = 36;
        int sum = a + b;
        System.out.println("result = " + sum);
    }
    private static void hwTask3()
    {
        int c = 50, d = 3;
        int div = c / d;
        System.out.println("num1 = 50 divide num2 = 3");
        System.out.println("result = " + div);
    }
    private static void hwTask4()
    {
        System.out.print("Oreration a = -5 + 8 * 6 ");
        int a = -5+8*6;//(1)8*6=48;(2)-5+48=43;
        System.out.println("result a = " + a);

        System.out.print("Operation b = (55+9) % 9");
        int b = (55+9)%9;//(1)55+9=64;(2)64/9=7.1=Остаток 1 =ответ 1
        System.out.println(" result b = " + b);

        System.out.print("Operation c = 20+(-3)*5/8 ");
        int c = 20+(-3)*5/8; //(1)-3*5=-15;(2)-15/8=-1;(3)20-1=19;
        System.out.println("result c =" +c);

        System.out.print("Operation d = 5 +15/3*2 - 8%3 ");
        int d = 5 + 15 / 3 * 2 - 8 % 3; // (1)15/3=5;(2)5*2=10;(3)8%3=2;(4)5+10=15;(5) 15-2=13;
        System.out.println("result d =" +d);
    }
    private static void hwTask5() throws IOException {
        InputStream in = System.in;
        InputStreamReader inRead = new InputStreamReader(in);
        BufferedReader inBufRead = new BufferedReader(inRead);

        System.out.print("Entry num1: ");
        String num1 = inBufRead.readLine();
        System.out.print("Entry num2: ");
        String num2 = inBufRead.readLine();

        int aNum1 = Integer.parseInt(num1);
        int bNum2 = Integer.parseInt(num2);
        int mult = aNum1* bNum2;

        System.out.println("Result: " + mult);
    }
    private static void hwTask6() throws IOException
    {
        InputStream in = System.in;
        InputStreamReader inRead = new InputStreamReader(in);
        BufferedReader inBufRead = new BufferedReader(inRead);

        System.out.print("Entry num1: ");
        String num1 = inBufRead.readLine();
        System.out.print("Entry num2: ");
        String num2 = inBufRead.readLine();

        int aNum1 = Integer.parseInt(num1);
        int bNum2 = Integer.parseInt(num2);

        int plus = aNum1 + bNum2;
        int minus = aNum1 - bNum2;
        int mult = aNum1 * bNum2;
        int div = aNum1 / bNum2;
        int mod = aNum1 % bNum2;

        System.out.println("Result a: " + plus);
        System.out.println("Result b: "+ minus);
        System.out.println("Result c: "+ mult);
        System.out.println( "Result d: "+ div);
        System.out.println("Result e: "+ mod);
    }
    private static void hwTask7() throws IOException
    {
        InputStream in = System.in;
        InputStreamReader inRead = new InputStreamReader(in);
        BufferedReader inBufRead = new BufferedReader(inRead);

        System.out.print("Entry num: ");
        String num1 = inBufRead.readLine();

        int aNum1 = Integer.parseInt(num1);
        int a1 = aNum1;
        int a2 = aNum1*2;
        int a3 = aNum1*3;
        int a4 = aNum1*4;
        int a5 = aNum1*5;
        int a6 = aNum1*6;
        int a7 = aNum1*7;
        int a8 = aNum1*8;
        int a9 = aNum1*9;
        int a10 = aNum1*10;
        System.out.println(a1+","+a2+","+a3+","+a4+","+a5+","+a6+","+a7+","+a8+","+a9+","+a10);
        /*for(int i = 1; i < 11; i++)
        {
            int sum = aNum1*i;
            System.out.println(aNum1 + " * "+i+"= "+ sum);
        }*/
    }
    private static void hwTask8()
    {
        System.out.println("   J " + "   a    " + "v     v" + "   a");
        System.out.println("   J " + "  a a   " + " v   v" +  "   a a");
        System.out.println("J  J " + " aaaaa  " + "  V V"+    "   aaaaa");
        System.out.println(" JJ  " + "a     a " + "   V" +    "  a      a");
    }
    private static void hwTaske9()
    {
        double f= ((25.5*3.5-3.5*3.5)/(40.5-4.5));
        System.out.println(f);
    }
    private static void hwTask10()
    {
        //4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11))
        double f=1.0/3,o=1.0/5,r=1.0/7,m=1.0/9,u=1.0/11;
        double fo= 1-f+o, FoR=fo-r,FoRM=FoR+m,FoRMU=FoRM-u;
        double formula = 4*FoRMU;
        System.out.println(formula);
    }
}
