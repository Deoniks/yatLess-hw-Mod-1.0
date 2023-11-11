import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        //boardLimited(4,7); // Bishop and Knight
        StartPosition();
    }

    static void boardLimited (int x1, int y1)
    {
        final int xBeg = 1,yBeg = 1;
        final int xEnd = 8,yEnd = 8;

        boolean isBegOfTheBoard = (x1 >= xBeg && y1 >= yBeg);
        boolean isEndOFTheBoard = (x1 <= xEnd && y1 <= yEnd);

        if (isBegOfTheBoard && isEndOFTheBoard)
            System.out.println("Move Chess Figures");
        else
            System.out.println("Don't Move Chess Figures");
    }

    private static void StartPosition()
    {
        int x1 = 3;
        int y1 = 1;
        int x2 = 6;
        int y2 = 8;

        System.out.println("0-White; 1- Black");
        int choise = scan.nextInt();
        boolean Side = (choise == 0);

        System.out.println("0-Defolt Position or 1-Select Position");
        int selPos = scan.nextInt();
        boolean Position = (selPos == 0);

        if (Position)
        {
            if (Side)
            {
                System.out.println("Enter 1 to 6");
                moveFigureBishop(x1,y1);
            }

            else
            {
                System.out.println("Enter 1 to 2");
                moveFigureBishop(x2,y2);
            }
        }
        else
        {
            System.out.println("Enter position x(horizontal line)(1 to 8)");
            int inpX = scan.nextInt();
            System.out.println("Enter position y(vertical line)(1 to 8)");
            int inpY = scan.nextInt();
            boolean isCheckPos = ((inpX >= 1) && (inpX <= 8) && (inpY >= 1) && (inpY <=8));
            if(isCheckPos)
            {
                System.out.println("isCheck");
                moveFigureBishop(inpX,inpY);
            }
            else
            {
                System.out.println("isNotCheck");
                boardLimited(inpX,inpY);
            }
        }
    }

    private static void moveFigureBishop (int sPosX, int sPosY)
    {
        System.out.println("You Move 0.Right or 1.left");
        int move = scan.nextInt();
        boolean isMove = (move == 0);
        System.out.println("Enter num for step move Bishop");
        int walk = scan.nextInt();
        if(isMove)
        {
            sPosX = sPosX + walk;
            sPosY = sPosY + walk;boolean isCheckPos = ((sPosX >= 1) && (sPosX <= 8) && (sPosY >= 1) && (sPosY <=8));
            boolean isCheckUp = ((sPosX >= 1) && (sPosX <= 8) && (sPosY < 1)  && (sPosY <=8));
            boolean isCheckDown = ((sPosX >= 1) && (sPosX <= 8)  && (sPosY <=1) && (sPosY > 8));
            if(isCheckPos)
            {
                System.out.println("Your move left and you positin: " + sPosX + ", " + sPosY);
            } else if (isCheckUp) {
                sPosY = sPosY + walk;
                System.out.println("Your move left and you positin: " + sPosX + ", " + sPosY);
            } else if (isCheckDown) {
                sPosY = sPosY - walk;
                System.out.println("Your move left and you positin: " + sPosX + ", " + sPosY);
            } else
                boardLimited(sPosX,sPosY);
        }
        else
        {
            sPosX = sPosX - walk;
            sPosY = sPosY - walk;
            boolean isCheckPos = ((sPosX >= 1) && (sPosX <= 8) && (sPosY >= 1) && (sPosY <=8));
            boolean isCheckUp = ((sPosX >= 1) && (sPosX <= 8) && (sPosY < 1)  && (sPosY <=8));
            boolean isCheckDown = ((sPosX >= 1) && (sPosX <= 8)  && (sPosY <=1) && (sPosY > 8));
            if (isCheckPos)
            {
                System.out.println("Your move left and you positin: " + sPosX + ", " + sPosY);
            }
            else if (isCheckUp) {
                sPosY = sPosY + walk + walk;
                System.out.println("Your move left and you positin: " + sPosX + ", " + sPosY);
            } else if (isCheckDown) {
                sPosY = sPosY - walk;
                System.out.println("Your move left and you positin: " + sPosX + ", " + sPosY);
            }
            else
                boardLimited(sPosX,sPosY);
        }

    }
}