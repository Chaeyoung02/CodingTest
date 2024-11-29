package BaekJun;

import java.util.Scanner;

public class boj1267 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int ysec = 0;
        int msec = 0;

        for(int i = 0; i< n ; i++){
            int sec = sc.nextInt();
            ysec +=(((sec/30) + 1) * 10);
            msec += (((sec/60) + 1) * 15);
        }
        if(ysec < msec) {
            System.out.println("Y " + ysec);
        }else if(msec < ysec){
            System.out.println("M " + msec);
        }
        else {
            System.out.println("Y M " + ysec);
        }
    }
}
