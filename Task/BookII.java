package Task;

public class BookII {
    private String title;
    private int price;
    private  String type;
    private int sold;
    private static int countSell = 0;

    public BookII(){}
    public BookII(String title, int price, String type, int sold){
        this.title = title;
        this.price = price;
        this.type = type;
        this.sold = sold;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setSold(int sold){
        this.sold = sold;
    }
    public String getTitle(){
        return title;
    }
    public int getPrice(){
        return price;
    }
    public String getType(){
        return type;
    }
    public int getSold(){
        return sold;
    }
    public int sellProcent(String type, int price){
        countSell++;
        int p = price;
        char t = type.charAt(0);
        if(t=='c'&& countSell<50){
            double res = p*0.2;
            p = p-(int)res;
            return this.price=p;
        } else if (t == 'c' && countSell == 51) {
            double res = p*0.25;
            p = p+(int)res;
            return this.price=p;
        } else if (t=='c' && countSell>51) {
            return this.price=p;
        } else if (t=='b' && countSell<50) {
            return this.price = p;
        } else if (t=='b' && countSell>51) {

        }
            return this.price=p;

    }
    public String classic(String aType){
        String aT = String.valueOf(aType.charAt(0));
        countSell++;
        return aT;
    }
}
