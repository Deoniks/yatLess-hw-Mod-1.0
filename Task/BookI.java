package Task;

import com.sun.tools.javac.Main;

public class BookI {
    private String name;
    private String author;
    private double price;
    private String type;

    public BookI(){}
    public BookI(String name,String author,int price,String type){
        if(type == "Simple"){
            this.price = price;
        }
        if(type == "Clssical"){
            double p = 0.1*price;
            price -= (int)p;
            this.price = price;
        }
        if(type == "Bestseller"){
            double p = 0.2*price;
            price += (int) p;
            this.price = price;
        }
        this.name = name;
        this.author = author;
        this.type = type;
    }

    @Override
    public String toString() {
        if(type == "Clssical"){
            return "BookI{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", price(10% discount)=" + price +
                    ", type='" + type + '\'' +
                    '}';
        }
        return "BookI{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
