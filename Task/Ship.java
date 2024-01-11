package Task;

public class Ship {
    private String name;
    private String arivalTime;
    private int stayTime;
    private boolean isDistress;

    public Ship(){}
    public Ship(String name, String arivalTime, int stayTime, boolean isDistress){
        this.name = name;
        this.arivalTime = arivalTime;
        this.stayTime = stayTime;
        this.isDistress = isDistress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArivalTime() {
        return arivalTime;
    }

    public void setArivalTime(String arivalTime) {
        this.arivalTime = arivalTime;
    }

    public int getStayTime() {
        return stayTime;
    }

    public void setStayTime(int stayTime) {
        this.stayTime = stayTime;
    }

    public boolean isDistress() {
        return isDistress;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", arivalTime='" + arivalTime + '\'' +
                ", stayTime=" + stayTime +
                ", isDistress=" + isDistress +
                '}';
    }
}
