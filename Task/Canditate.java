package Task;

public class Canditate {
    private String name;
    private String work;
    private int income;

    public Canditate(){}
    public Canditate(String name, String work, int income){
        this.name = name;
        this.work = work;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        if(work.equals("banker")){
            return "Sorry,"+ name + " you not accepted because of work";
        } else if (name.equals("Jonson") || name.equals("Edisson")) {
            return "Sorry,"+ name + " you not accepted you because of name";
        } else return "Canditate{" +
                "name='" + name + '\'' +
                ", work='" + work + '\'' +
                ", income=" + income +
                '}';
    }
}
