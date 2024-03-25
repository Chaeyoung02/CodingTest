package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1110 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = n;
        int sum = 0;
        int count = 0;

        while(true){
            if(n < 10){
                n = (10 * n) + n;
            }else {
                int left = n / 10;
                int right = n % 10;
                sum = (right+left) % 10;
                n = (right * 10) + sum ;

            }
            count++;
            if(answer == n){
                break;
            }

        }

        System.out.println(count);

    }
}
