package Task;

public class Project {
    private String name;
    private int cost;
    private String type;
    boolean isGovernment;

    public Project(){}
    public Project(String name,int cost,String type,boolean isGovernment){
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.isGovernment = isGovernment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isGovernment() {
        return isGovernment;
    }
}
