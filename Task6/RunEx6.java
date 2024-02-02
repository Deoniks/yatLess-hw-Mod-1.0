package Task6;

import Task6.AnimalAbst6.BigDogAbs;
import Task6.AnimalAbst6.CatAbs;
import Task6.AnimalAbst6.DogAbs;
import Task6.FigShape1.Circle;
import Task6.FigShape1.Square;
import Task6.GeometricObj2.CircleObj;
import Task6.GeometricObj2.RectangleObj;
import Task6.Movable3.MovablePoint;
import Task6.MoveObj4.MovableCircle;
import Task6.interGeometricObj5.CircleInter;
import Task6.interGeometricObj5.ResizableCircle;

public class RunEx6 {

    public static void main(String[] args) {

        Ex4();
    }

    public static void Ex1(){
        Square s = new Square(2,"Red", true);
        System.out.println(s);

        System.out.println("____________________________________________");

        Circle c = new Circle(3,"Blue", false);
        System.out.println(c+"\nArea: " + c.getArea()+"\nPerimeter: " + c.getPerimeter());
        System.out.println("____________________________________________");

        c.setColor("purple");
        c.setFilled(true);
        c.setRadius(1.5);
        System.out.println(c+"\nArea: " + c.getArea()+"\nPerimeter: " + c.getPerimeter());
        System.out.println("____________________________________________");
    }

    public static void Ex2(){
        CircleObj cObj = new CircleObj(2.1);
        RectangleObj rObj = new RectangleObj(5,4);
        System.out.println(cObj);
        System.out.println(cObj.getArea() + ", "+ cObj.getPerimeter());
        System.out.println(rObj);
        System.out.println(rObj.getArea() +", "+ rObj.getPerimeter());
    }

    public static void Ex3(){
        MovablePoint mp = new MovablePoint(5,5,15,10);
        mp.moveDown();
        mp.moveLeft();
        mp.moveLeft();
        mp.moveDown();
        System.out.println(mp);
    }

    public static void Ex4(){
        MovableCircle mc = new MovableCircle(15,10,5,4,3);
        mc.moveDown();
        mc.moveRight();
        System.out.println(mc);
    }
    public static void Ex5(){
        CircleInter cIn = new CircleInter(5);
        System.out.println("area: " + cIn.getArea() + "perimeter: " + cIn.getPerimeter());
        System.out.println(cIn);

        ResizableCircle rc = new ResizableCircle(2.5);
        rc.resize(50);
        System.out.println(rc.getArea() + rc.getPerimeter());
        System.out.println(rc);
    }

    public static void Ex6(){
        CatAbs catBritish = new CatAbs("BritishCat");
        catBritish.greets();

        DogAbs dogMops = new DogAbs("MopsDog");
        DogAbs dogGerman = new DogAbs("GermanDog");
        dogMops.greets();
        dogMops.greets(dogGerman);

        BigDogAbs bdAlabay = new BigDogAbs("Alabay");
        BigDogAbs dogWolf = new BigDogAbs("Wolf???");
        bdAlabay.greets();
        bdAlabay.greets(dogGerman);
        bdAlabay.greets(dogWolf);
    }


}
