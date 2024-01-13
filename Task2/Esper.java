package Task2;

public class Esper {
    private String name;
    private int might;
    private String type;

    public Esper(){}
    public Esper(String name, int might, String type){
        this.name = name;
        this.might = might;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMight() {
        return might;
    }

    public void setMight(int might) {
        this.might = might;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
