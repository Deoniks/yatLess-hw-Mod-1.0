package Task6.AnimalAbst6;

public class CatAbs extends Animal {
    public CatAbs(String name){
        super(name);
    }

    @Override
    public void greets(){
        System.out.println("Meow");
    }
}
