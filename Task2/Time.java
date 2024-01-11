package Task2;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private String testing = "5";

    public Time(){}
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour){
        if(minute>0 && minute < 60){
            this.hour = hour;
        }else if(minute == 60){
            hour++;
            this.hour = hour;
        }

    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public int getHour(){return  this.hour;}
    public int getMinute(){return this.minute;}

    public int getSecond() {
        return second;
    }
    public Time nextSecond(){
        second++;
        return this;
    }
    public Time prevSecond(){
        second--;
        return this;
    }

    @Override
    public String toString() {
        if(hour > 0 && hour < 10){
            if(minute > 0 && minute < 10){
                if(second>0 && second < 10){
                    return "0" +hour +
                            ":0" + minute +
                            ":0" + second;
                } else {
                    return "0" +hour +
                            ":0" + minute +
                            ":" + second;
                }
            } else if(second>0 && second < 10) {
                return hour +
                        ":" + minute +
                        ":0" + second;
            } else return "0" +hour +
                    ":" + minute +
                    ":" + second ;
        }
        else if(minute > 0 && minute < 10){
            if(second>0 && second < 10){
                return hour +
                        ":0" + minute +
                        ":0" + second;
            } else {
                return  hour +
                        ":0" + minute +
                        ":" + second;
            }
        } else if(second>0 && second < 10) {
            return hour +
                    ":" + minute +
                    ":0" + second;
        } else return hour +
                ":" + minute +
                ":" + second ;
    }
}