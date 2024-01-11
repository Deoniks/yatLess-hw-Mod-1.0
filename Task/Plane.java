package Task;

import java.util.Arrays;

public class Plane {
    private String id;
    private String[][] arrivalTime;
    private String leave;

    public void Plane(){}

    public void Plane(String id, String [][] arrival, String leave){
        setId(id);
        setArrivalTime(Arrays.toString(arrival));
        setLeave(leave);
    }

    public void setArrivalTime(String arrival){
        String [] b = arrival.split(":");
        String eHour = b[0];
        String eMinute = b[1];

        int dHour = Integer.parseInt(eHour);
        int dMin = Integer.parseInt(eMinute);

        if(dHour > 0 && dHour < 25 && dMin > 0 && dMin < 60 ){
            this.arrivalTime = new String[1][1];
            arrivalTime[0][0] = arrival;
        } else this.leave = "Error, There is no time like this";
    }
    public void setLeave(String leave){
        String [] l = leave.split(":");
        String eHour = l[0];
        String eMinute = l[1];
        int dHour = Integer.parseInt(eHour);
        int dMin = Integer.parseInt(eMinute);
        if(dHour > 0 && dHour < 25 && dMin > 0 && dMin < 60 ){
            this.leave = leave;
        } else this.leave = "Error, There is no time like this";
    }
    public String getLeave(){

        return leave;
    }

    public String getArrivalTime(){
        return this.arrivalTime[0][0];
    }
    public void setId(String id){ 
        this.id = id;
    }
    public String getId(){

        return this.id;
    }

    public boolean isTwoHour(String a, String b){

        String [] ar = a.split(":");
        String [] br = b.split(":");

        String aH = ar[0];
        String aM = ar[1];
        String bH = br[0];
        String bM = br[1];

        int hA = Integer.parseInt(aH);
        int mA = Integer.parseInt(aM);
        int hB = Integer.parseInt(bH);
        int mB = Integer.parseInt(bM);

        boolean isMoreTwoHour = (hB-hA>=2);

        if(mA == 0 && mB == 0){
            if(isMoreTwoHour){
                return true;
            }else return false;
        } else if (mA>0 && mB>0) {
            if(isMoreTwoHour){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id='" + id + '\'' +
                ", arrivalTime=" + arrivalTime[0][0] +
                ", leave='" + leave + '\'' +
                '}';
    }

}
