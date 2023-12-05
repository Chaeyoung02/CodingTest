package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2446 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int num = (n*2)-1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j ++){
                System.out.print(" ");
            }
            for(int k = 0; k < (2*n-1) - (2*i); k++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n -1 -i; j ++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i+1; k++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
