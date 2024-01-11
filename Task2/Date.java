package Task2;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(){}
    public Date(int day, int month, int year){
        if(day>0 && day<32){
            this.day = day;
            if(month > 0 && month < 13){
                this.month = month;
                if(year > 1899 && year < 10000){
                    this.year = year;
                } else System.out.println("There is no such year");
            } else System.out.println("There is no such month");
        } else System.out.println("There is no such day");
    }
    public void setDay(int day){
        if(day > 0 && day < 32){
            this.day = day;
        }else {
            System.out.println("Error, there is no such day. Please repeat entry day");
        }
    }
    public void setMonth(int month){
        if(month > 0 && month < 13){
            this.month = month;
        }else {
            System.out.println("Error, there is no such month. Please repeat entry month");
        }
    }

    public void setYear(int year){
        if(year > 1899 && year < 10000){
            this.year = year;
        }else {
            System.out.println("Error, there is no such day. Please repeat entry day");
        }
    }
    public void setDate(int day,int month,int year){
        if(day>0 && day<32){
            this.day = day;
            if(month > 0 && month < 13){
                this.month = month;
                if(year > 1899 && year < 10000){
                    this.year = year;
                } else System.out.println("There is no such year");
            } else System.out.println("There is no such month");
        } else System.out.println("There is no such day");
    }

    public int getDay(){
        return this.day;
    }
    public int getMonth(){return this.month;}
    public int getYear(){return  this.year;}

    @Override
    public String toString() {
        if(day > 0 && day < 10){
            if(month > 0 && month < 10){
                return "0" +day +
                        "/0" + month +
                        "/" + year ;
            }else return "0" +day +
                    "/" + month +
                    "/" + year ;
        }
        else return day +
                "/" + month +
                "/" + year ;
    }
}
