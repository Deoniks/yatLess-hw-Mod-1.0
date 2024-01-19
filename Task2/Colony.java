package Task2;

import java.util.Arrays;

public class Colony {
    private String name;
    private int smetPrice;
    private int apCount;
    Apartmen[] apart;

    public Colony(){}
    public Colony(String name,int smetPrice,int apCount, Apartmen[] apart){
        this.name = name;
        this.smetPrice = smetPrice;
        this.apCount = apCount;
        this.apart = apart;
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
    public void setApart(Apartmen [] apart){
        this.apart = apart;
    }
    public Apartmen getApartmen(Apartmen apartmen){
        return this.apart[0];
    }

    public String price(int getSmet){
        int p = getSmet * smetPrice;
        if(apart[0].getType().equalsIgnoreCase("Carbonpanel")){
            return "carbon " +(int) (p*0.8);
        } else if (apart[0].getType().equalsIgnoreCase("Cyberbrick")) {
            return "cyber " +(int) (p*1.5);
        }
        return "nano "+p;
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
