package Task2;

public class Apartmen {
    private String title;
    private int smet;
    private String type;

    public Apartmen(){}
    public Apartmen(String title,int smet,String type){
        this.title = title;
        this.smet = smet;
        this.type = type;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int getSmet(){
        return this.smet;
    }
    public void setSmet(int smet){this.smet = smet;}

    @Override
    public String toString() {
        return "Apartmen{" +
                "title='" + title + '\'' +
                ", smet=" + smet +
                ", type='" + type + '\'' +
                '}';
    }
}
