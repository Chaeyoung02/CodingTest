package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1094 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());

        int a = 64;
        int temp = 0;
        int count = 0;
        int result = x;

        while(x > 0) {
            if(x == 64){
                count++;
                break;
            }
            if(x < a){
                a /= 2;
            } else {
                x -= a;
                count++;
            }
        }
        System.out.println(count);
    }
}
