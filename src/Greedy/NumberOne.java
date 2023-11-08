package Greedy;

import java.util.*;

public class NumberOne {
    public static void main(String[] args) {
        int N;
        int K;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        while(N>1){
            if(N % K == 0){
                N = N / K;
                count++;
            }else{
                N = N - 1;
                count++;
            }
        }
        System.out.print(count);

    }
}
