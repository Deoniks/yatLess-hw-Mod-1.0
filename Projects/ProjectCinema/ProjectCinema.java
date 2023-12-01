import java.util.Scanner;

public class ProjectCinema
{
   static Scanner scan = new Scanner(System.in);
   static int [][] sizeHall;
   static char [][] posHall;
   static int profit = 0;
   static int freePlace = 0;
   static final int COSTinDollars = 10;

    public static void main(String[] args)
    {
        cinemaHall();
        mainMenu();


        //printCinemaHall(fillNumArray(sizeHall()),fillSimArray(posHall));

    }

    public static void cinemaHall()
    {
        System.out.println("Введите размер кинозала");
        int x = scan.nextInt();
        int y = scan.nextInt();

        sizeHall = new int[x][y];
        posHall = new char[x][y];
        fillNumArray(sizeHall,x,y);
        fillSimArray(posHall,x,y);
        printCinemaHall(sizeHall);
    }

    public static int [][] fillNumArray(int[][] hall,int x,int y)
    {
        int yBeg=0;
        for(int i = 0;i<x;i++)
        {
            for (int j=0;j<y;j++)
            {
                hall[i][j] = j+1;
            }
            hall[i][yBeg] = i+1;
        }
        return hall;
    }

    public static char [][] fillSimArray(char[][] posHall,int x,int y)
    {
        char sim = 's';
        for(int i = 0;i<x;i++)
        {
            for (int j=0;j<y;j++)
            {
                posHall[i][j] = sim;
            }
        }
        return posHall;
    }

    public static void mainMenu()
    {
        System.out.println("\n__________________________\n");
        System.out.println("1. Print hall\n2. Buy ticket\n3. Statistics \n0. Exit System");
        int i = scan.nextInt();
        switch (i)
        {
            case(1): printCinemaHall(sizeHall); mainMenu();break;
            case (2): buyTicket(); mainMenu();break;
            case (3): statistics();break;
            case (0): break;
        }
    }

    public static char [][] buyTicket()
    {
        int x = posHall.length;
        int y = posHall[0].length;
        int ySt = 0;
        char sim = 's';
        char buy = 'b';
        System.out.println("Вы хотите приобрести место?(press = y or n)");
        String ye = "y";
        ye.toLowerCase();
        String task = scan.next().toLowerCase();
        boolean yes = ye.equals(task);
        if(!yes)
        {
            System.out.println("Вы отказались приобретать место!");
        }else
        {
            System.out.println("Выбирите место");
            int xB = scan.nextInt();
            System.out.println("Выбирите ряд");
            int yB = scan.nextInt();

            System.out.println("Цена на билет: " + COSTinDollars + " $");

            if(isCheck(xB-1,yB-1))
            {
                System.out.println("Данное место продано");
                buyTicket();
            }

            for(int i = 0;i<y;i++)
            {
                {
                    for (int j=0;j<x;j++)
                    {
                        if(j==xB && i==yB)
                        {
                            posHall[i-1][j-1] = buy;
                            profit++;
                            if(posHall[i][j]!=buy)
                            {
                                posHall[i][j] = sim;
                            }
                        }
                    }
                }
            }
        }
        return posHall;
    }

    public static void printCinemaHall(int[][] hall)
    {
        int x = hall.length;
        int y = hall[0].length;
        int k = 0;
        int xSim = 0;

        for(int i=0;i<x;i++)
        {
            xSim = 0;
            for(int j=0;j<y;j++)
            {
                if(i<1)
                {
                    System.out.print("  ");
                    System.out.print(hall[i][j]);
                    System.out.print("  ");
                }
            }
            System.out.println();
            System.out.print(hall[i][k]);

            for(int j =0;j<y;j++)
            {
                if(xSim < y){
                    System.out.print(" ");
                    System.out.print(posHall[i][xSim]);
                    System.out.print("   ");
                    xSim++;
                }
            }
        }
    }

    public static void statistics()
    {
        System.out.println("\n____________________\n");
        int totalFreeOfSeets = freePlace = (posHall.length * posHall[0].length);
        int amoutFreeOfSeets = totalFreeOfSeets - profit;
        int totalIncome = totalFreeOfSeets * COSTinDollars;
        int currentIncome = profit * COSTinDollars;

        System.out.println("1. Заработали\n2. Возможно заработать\n3. Свободных мест осталось\n4. Всего свободных мест\n0. Назад меню\n");
        int input = scan.nextInt();
        if(input>=0 && input<=5)
        {
            switch (input)
            {
                case (0):mainMenu();
                case (1):
                    System.out.println("Cейчас мы заработали: " + currentIncome);
                    statistics();
                case (2):
                    System.out.println("Можно заработать в нашем кинозале: " + totalIncome);
                    statistics();
                case (3):
                    System.out.println("Свообдных мест в кинозале: " + totalFreeOfSeets);
                    statistics();
                case (4):
                    System.out.println("В общем свообдных мест в кинозале: " + amoutFreeOfSeets);
                    statistics();
            }
        }else {
            System.out.println("Неверно выбрано значение!");
            statistics();
        }
    }

    public static boolean isCheck(int i, int j)
    {
        return posHall[i][j]=='b';
    }

}
