package Task2;

public class School {
    private String title;
    private String specType;
    private int espCount;
    Esper[] espers;

    public School(){}
    public School(String title,String specType, Esper[] espers){
        this.title = title;
        this.specType = specType;
        this.espers = espers;
        this.espCount = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpecType() {
        return specType;
    }

    public void setSpecType(String specType) {
        this.specType = specType;
    }

    public int getEspCount() {return espCount;}

    public void setEspCount(int espCount) {
        this.espCount = espCount;
    }

    public int getEspCountType(){
        int espCountType = 0;
        for(int i = 0; i<12;i++){
            if(specType.equals(espers[i].getType())){
                espCountType++;
            }
        }
        return espCountType;
    }
    public String getEspType(){
        return "s";
    }

    public Esper[] getEspers() {return espers;}

    public void setEspers(Esper[] espers) {
        this.espers = espers;
    }

    public void printNameEspers(){
        for (int i = 0; i < 12; i++){
            System.out.println(espers[i].getName());;
        }
    }


    public void checkType(){
        Esper [] e = new Esper[getEspCountType()];
        int j = 0;
        int r = 0;
        for (int i = 0; i<12;i++){
            if(specType.equals(espers[i].getType()) && espers[i].getMight()>10){
                    e[j] = espers[i];
                    j++;
            }
        }this.espers = e;
    }

    public String print() {
        for (int i = 0; i < espers.length; i++) {
            return "Title: " + title + ", \n" +
                    "Name: " + espers[i].getName() + " \n" +
                    "Might: " + espers[i].getMight() + "\n"
                    +"_______________________";
        }
        return " ";
    }
}
