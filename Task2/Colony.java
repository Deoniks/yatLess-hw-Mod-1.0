package Task2;

import java.util.Arrays;

public class Colony {
    private String name;
    private int smetPrice;
    private int apCount;
    Apartmen[] apart = new Apartmen[3];

    public Colony(){}
    public Colony(String name,int smetPrice,int apCount, Apartmen ap){
        this.name = name;
        this.smetPrice = smetPrice;
        this.apCount = apCount;
        this.apart[0] = ap;
    }

    public String getName(){return this.name;}
    public void setName(String name){
        this.name = name;
    }
    public int getSmetPrice(){return this.smetPrice;}
    public void setSmetPrice(int smetPrice){
        this.smetPrice = smetPrice;
    }
    public int getApCount(){return this.apCount;}
    public void setApCount(int apCount){this.apCount = apCount;}

    public int price(int getSmet){
        int p = getSmet * smetPrice;
        return p;
    }



    @Override
    public String toString() {
        return "Colony{" +
                "name='" + name + '\'' +
                ", smetPrice=" + smetPrice +
                ", apCount=" + apCount +
                ", apart=" + Arrays.toString(apart) +
                '}';
    }
}
