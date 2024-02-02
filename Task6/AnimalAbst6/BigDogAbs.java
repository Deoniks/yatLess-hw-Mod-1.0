package Task6.AnimalAbst6;

public class BigDogAbs extends DogAbs{
    public BigDogAbs(String name){
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("AUF");
    }
    @Override
    public void greets(DogAbs another){
        System.out.println("WOOF-auf");
    }

    public void greets(BigDogAbs bigAnother){
        System.out.println("AUF-AUF");
    }
}
