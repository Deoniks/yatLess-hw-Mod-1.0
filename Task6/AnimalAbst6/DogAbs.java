package Task6.AnimalAbst6;

public class DogAbs extends Animal{
    public DogAbs(String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(DogAbs another){
        System.out.println("Woof-woof");
    }
}
