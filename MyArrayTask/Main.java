import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReplaceTask5();
    }

    private static void TaskWork1() {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("Black");
        color.add("White");
        System.out.print(color);
    }

    private static void TaskWork2() {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("Black");
        color.add("White");

        IterUse(color);
    }

    private static void TaskWork3() {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("Black");
        color.add("White");

        System.out.println(color);

        color.add(1, "Purple");
        IterUse(color);
        int s = color.size();
        System.out.println("Entry num (0-5)");
        System.out.println(color.get(GetUse(s)));
    }

    private static void SortTask4()
    {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("Purple");
        color.add("Black");
        color.add("White");
        color.add("Yellow");
        color.add("Gray");
        color.add("Pink");
    }

    private static void ReplaceTask5()
    {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("Purple");
        color.add("Black");
        color.add("White");
        color.add("Yellow");
        color.add("Gray");
        color.add("Pink");

        System.out.println(color);
        int si = color.size();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number from 0 to " + si);
        int val = GetUse(si);
        System.out.println("Input color");
        String inColor = sc.nextLine();

        color.set(val,inColor);
        System.out.println(color);
    }

    public static void IterUse(ArrayList<String> arrayList) {
        Iterator<String> iter = arrayList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

    public static int GetUse(int ssize) {

        Scanner scan = new Scanner(System.in);
        int numVal = Integer.parseInt(scan.nextLine());
        if (ssize >= numVal & ssize !=0 & numVal !=0) {
            ssize = numVal- 1;
        }
        else if(numVal == 0){ssize = numVal;}
        else {
            System.out.println("Error!!!");
        }
        return ssize;
    }

    public static void ColorReplaceUse(int setValue, String color)
    {
        Scanner scan = new Scanner(System.in);
        int inSetVal = Integer.parseInt(scan.nextLine());
        if (setValue >= inSetVal & inSetVal == 0)
        {
            setValue = inSetVal;
            String inColor = scan.nextLine();
            color = inColor;
        }
    }

}