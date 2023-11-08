package Implementation;
import java.util.*;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for(int hour=0; hour <= n; hour++){
            for(int minute = 0; minute <= 59; minute++){
                for(int second = 0; second <= 59; second++){
                    String time = String.valueOf(hour) + minute + second;

                    if(time.indexOf("3") >  -1){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
