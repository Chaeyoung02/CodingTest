package BaekJun;

import java.io.IOException;
import java.util.Scanner;

public class boj2581 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int M =sc.nextInt();
        int N =sc.nextInt();

        int min = N+1;
        int sum = 0;

        for (int i = M; i <= N; i++) {
            boolean check = true;

            if( i == 1){
                check=false;
            }
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    check=false;
                    break;
                }
            }
            if (check) {
                if (min > i) {
                    min = i;
                }
                sum += i;
            }
        }

        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }


}
