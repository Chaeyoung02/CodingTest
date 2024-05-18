package api_homework;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Homework04 {

    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        System.out.println("기준 : " + start.getHour() +"시 " +start.getMinute()+"분 "+
                start.getSecond() +"초");
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("입력 :");
            String s = sc.nextLine();

            if(s.toUpperCase().endsWith("Y")) {
                LocalTime recent = LocalTime.now();
                long second = ChronoUnit.SECONDS.between(start, recent);
                System.out.println("경과(초): "+second);

            }else if(s.toUpperCase().endsWith("N")){
                System.out.println("종료합니다");
                break;
            }else {
                System.out.println("다시 입력해주세요");
                continue;
            }
        }

    }

}
