package info.krogulec.flowcontrol;

public class Labels {
    public static void main(String[] args) {

        int a = 5;


        outer:
        for (int hour = 0; hour < 24 ; hour++){
            //if (hour == 13)continue;
            inner:for(int min = 0; min < 60 ; min++){
                //if (hour == 13)++hour;
                System.out.println("Hour: " + hour + " Minute: " + min);
                if(hour == 13)continue outer;
            }
        }

    }
}
