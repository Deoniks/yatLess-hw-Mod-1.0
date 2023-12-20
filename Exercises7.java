import java.util.Arrays;
import java.util.Scanner;

public class Exercises7
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        HWTask20();
    }
    /*
    * **Exercise 1: Write a program to store elements in an array and print it**

***Sample Output***

Array Size = 5

Element of a[0] = 5

Element of a[1] = 11

Element of a[2] = 22

Element of a[3] = 33

Element of a[4] = 44

***Display Array Elements***

5

11

22

33

44 */
    public static void HWTask1()
    {
        int a[] = {5,11,22,33,44};
        for(int i =0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

/* **Exercise 2:** **Write a program to calculate the average value of array elements**

***Sample Output***

Array = {1, 2, 3, 4, 5}

Sum of Array Value : 15

Average of Array Value : 3.0 */
    public static void HWTask2(){
        int a[] = {1,2,3,4,5};
        int sum = 0;
        for(int i =0;i<a.length;i++)
        {
            sum += a[i];
        }
        System.out.println(sum/a.length);
    }

/* **Exercise 3:** **Write a program to print sum values of an array**

***Sample Output***

Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

Sum Values of Array = 55 */
    public static void HWTask3(){
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i =0;i<a.length;i++)
        {
            sum += a[i];
        }
        System.out.println(sum);
    }

/* **Exercise 4: Write a program to Sort Numeric Array In Ascending Order**

***Sample Output***

Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}

Ascending Order = {2, 3, 3, 5, 20, 23, 30, 67, 70, 79} */
    public static void HWTask4(){
        int a[] = {23,5,67,20,3,30,79,3,70,2};
        for (int i:a){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(a);
        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

/* **Exercise 5:** **Write a program to Sort Numeric Array In Descending Order**

***Sample Output***

Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}

Descending Order = {79, 70, 67, 30, 23, 20, 5, 3, 3, 2} */
    public static void HWTask5(){
        int a[] = {23,5,67,20,3,30,79,3,70,2};
        for (int i:a){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(a);
        for(int i =a.length-1;i>=0;i--)
        {
            System.out.print(a[i] + " ");
        }
    }

/* **Exercise 6:** **Write a program to array elements to print cubic values**

***Sample Output***

Array = {1, 2, 3, 4, 5}

Cubic Array Elements =1 8 27 64 125 */
    public static void HWTask6(){
        int a[] = {1,2,3,4,5};
        int sum;
        for(int i =0;i<a.length;i++)
        {
            sum = (int) Math.pow(a[i],3);
            //sum = a[i]*a[i]*a[i]; - или так
            System.out.print(sum + " ");
        }
    }

/* **Exercise 7:** **Write a program to find the maximum and minimum element in an array**

***Sample Output***

Array = {23, 4, 32, 5, 75}

Maximum Element of Array = 75

Minimum Element of Array = 4 */
    public static void HWTask7(){
        int a[] = {23,4,32,5,75};
        for (int i:a){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(a);
        System.out.print("Maximum element of array: " + a[a.length-1]  + "\nMinimum element of array: " + a[0]);
    }

/* **Exercise 8: Write a program to array elements print all Odd number**

***Sample Output***

Array = {23, 45, 67, 34, 78}

Odd Array Elements = 23 45 67 */
    public static void HWTask8(){
        int a[] = {23,45,67,34,78};
        for (int i:a){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i =0;i<a.length;i++){
            if(a[i] % 2 !=0)
            {
                System.out.print( a[i] + " ");
            }
        }
    }

/* **Exercise 9: Write a program to array elements print all Even number**

***Sample Output***

Array = {23, 45, 89, 34, 12}

Even Array Elements = 34 12 */
    public static void HWTask9(){
        int a[] = {23,45,89,34,12};
        for (int i:a){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i =0;i<a.length;i++){
            if(a[i] % 2 ==0)
            {
                System.out.print( a[i] + " ");
            }
        }
    }

/* **Exercise 10: Write a program to array elements to print sum of Odd Numbers**

***Sample Output***

Array = {12, 34, 59, 45, 22}

Sum of Odd Array Elements = 104 */
    public static void HWTask10(){
        int a[] = {12,34,59,45,22};
        for (int i:a){
            System.out.print(i + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i =0;i<a.length;i++){
            if(a[i] % 2 !=0)
            {
                sum += a[i];

            }
        }
        System.out.println("Sum odd array elements : "+sum);
    }

/* **Exercise 11: Write a program to array elements to print sum of Even Numbers**

***Sample Output***

Array = {56, 78, 45, 79, 34}

Sum of Even Array Elements = 168 */
    public static void HWTask11(){
        int a[] = {56,78,45,79,34};
        for (int i:a){
            System.out.print(i + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i =0;i<a.length;i++){
            if(a[i] % 2 ==0)
            {
                sum += a[i];

            }
        }
        System.out.println("Sum odd array elements : "+sum);
    }

/* **Exercise 12: Write a program to array elements to print sum of Cubic Values**

***Sample Output***

Array = {1, 2, 3, 4, 5}

Sum of Cubic Array Elements = 225 */
    public static void HWTask12(){
        int a[] = {1,2,3,4,5};
        int pow = 0;
        int sum = 0;
        for(int i =0;i<a.length;i++)
        {
            pow = (int) Math.pow(a[i],3);
            sum+=pow;
        }
        System.out.print(sum + " ");
    }

/* **Exercise 13: Write a program in to copy the elements of one array into another array**

***Sample Output***

Array = {1, 2, 3, 4, 5}

Copy Array Elements one to Another Array = {1, 2, 3, 4, 5} */
    public static void HWTask13(){
        int a[] = {1,2,3,4,5};
        int b[] = Arrays.copyOf(a,5);
    }

/* **Exercise 14: Write a program to merge two arrays elements to store third array**

***Sample Output***

First Array = {1, 2, 3, 4, 5}

First Array = {6, 7, 8, 9, 10}

Merge two Array Elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} */
public static void HWTask14(){
    int a[] = {1,2,3,4,5};
    int b[] = {6,7,8,9,10};
    int [] c = new int[10];
    for(int i=0,j=0;i<=9;i++){
        if(i<5){
            c[i] = a[i];
        } else if (i>=5) {
            c[i] = b[j];
            j++;
        }
    }
    for(int i=0;i<c.length;i++){
        System.out.print(c[i] + ", ");
    }
}

/* **Exercise 15: Write a program to array elements print all Positive number**

***Sample Output***

Array = {67, -4, 3, -5, 44}

Positive Array Elements = {67, 3, 44} */
public static void HWTask15(){
    int a[] = {67,-4,3,-5,44};
    int j=0;
    for(int i:a){
        if(a[j]>0){
            System.out.print(a[j]);
        }
        j++;
    }
}

/* **Exercise 16: Write a program to array elements print all Negative number**

***Sample Output***

Array = {-45, 32, -7, 3, -6}

Negative Array Elements = {-45, -7, -6} */
public static void HWTask16(){
    int a[] = {-45,32,-7,3,-6};
    int j=0;
    for(int i:a){
        if(a[j]<0){
            System.out.print(a[j]);
        }
        j++;
    }
}

/* **Exercise 17: Write a program to array elements to print sum of Positive Numbers**

***Sample Output***

Array = {1, -2, 3, 3, 4}

Sum of Positive Array Elements = 7 */
public static void HWTask17(){
    int a[] = {1,-2,3,3,4};
    int sum=0;
    for(int i=0;i<a.length;i++){
        if(a[i]>0){
            sum+=a[i];
            System.out.print(a[i] + " ");
        }else System.out.print(+a[i] + " ");
    }
    System.out.println();
    System.out.println("sum of positive a elements: " + sum);
}

/* **Exercise 18: Write a program to array elements to print sum of Negative Numbers**

***Sample Output***

Array = {10, -23, 45, -10, 30}

Sum of Negative Array Elements = -33 */
public static void HWTask18(){
    int a[] = {10,-23,45,-10,30};
    int sum=0;
    for(int i=0;i<a.length;i++){
        if(a[i]<0){
            sum+=a[i];
            System.out.print(a[i] + " ");
        }else System.out.print(a[i] + " ");
    }
    System.out.println();
    System.out.println("sum of positive a elements: " + sum);
}

/* **Exercise 19: Write a program to search an element in an array**

***Sample Output***

Array = {10, 20, 30, 40, 50}

Search Array Elements = 30

Element is Found in the Position = 3

Element is Found in the Index = 2 */
    public static void HWTask19(){
        int a[] = {10,20,30,40,50};
        int ent = scan.nextInt();
        int search = Arrays.binarySearch(a,ent);
        if(search>=0){
            System.out.println("Element is found. This is position: " + search + " ;el: "+ a[search]);
        }
        else System.out.println("Element is not found!");
    }

/* **Exercise 20: Write a program to Delete Duplicate Elements from an Array**

***Sample Output***

Array = {10, 10, 20, 20, 30}

After Remove Duplicate Array Elements = {10, 20, 30 } */
public static void HWTask20(){
    int a[] = {10,10,20,20,30};
    int len = 0;
    int val=0;
    for (int i=0;i<a.length;i++)
    {
        if(val!=a[i]){
            len++;
            if(i==0){
                val=a[0];
            } else if (i!=a.length-1) {
                val = a[i+1];
            } else val=a[i];
        }
    }
    int b[] = new int[len];
    for (int i=0,j=0;i<a.length;i++)
    {
        if(val!=a[i]){
            b[j] = a[i];
            j++;
            if(i==0){
                val=a[0];
            } else if (i!=a.length-1) {
                val = a[i+1];
            } else val=a[i];
        }
    }
    for (int i:b){
        System.out.print(i+" ");
    }
}



/* **Exercise 21: Write a program to Print Unique Elements in Array**

***Sample Output***

Array = {10, 20, 40, 20, 10}

Display Array Unique Elements = {10, 20, 40 } */

/* **Exercise 22: Write a program to find the second smallest element in an array**

***Sample Output***

Array = {10, 20, 5, 2, 30}

Second Smallest Element = 5 */

/* **Exercise 23: Write a  program that identifies the Even elements in two arrays and creates a third array with those elements**

***Sample Output***

First Array = {1, 2, 3, 4, 5}

Second Array = {6, 7, 8, 9, 10}

Even Element Store in Third Array = {2, 4, 6, 8, 10} */

/* **Exercise 24: Write a program that identifies the Odd elements in two arrays and creates a third array with those elements**

***Sample Output***

First Array = {1, 2, 3, 4, 5}

Second Array = {6, 7, 8, 9, 10}

Odd Element Store in Third Array = {1, 3, 5, 7, 9} */

/* **Exercise 25: Write a program to find the common elements between two arrays of integers**

***Sample Output***

First Array = {10, 20, 30, 40, 50}

Second Array = {10, 30, 60, 50, 70}

Common Array Elements = {10, 30, 50}*/

/* **Exercise 26: Write a program to find the second Largest element in an array**

***Sample Output***

Array = {10, 20, 30, 40, 50}

Second Largest Element = 40 */

/* **Exercise 27: Write a program to find a missing number in an array**

***Sample Output***

Array = {1, 2, 4, 5, 6, 7}

Missing Array Number = 3
    * */
}
