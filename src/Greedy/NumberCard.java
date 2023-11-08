package Greedy;

import java.util.*;
public class NumberCard {
    public static void main(String[] args) {
         int M;
         int N;

         Scanner sc = new Scanner(System.in);
         M = sc.nextInt();
         N = sc.nextInt();

         Integer arr[][] = new Integer[N][M];
         for(int i = 0; i < N; i++){
             for(int j = 0; j < M; j++){
                 arr[i][j] = sc.nextInt();
             }
         }
         sc.close();

         for(int i = 0; i < N; i++){
             Arrays.sort(arr[i]);
         }
         int max = 0;

         for(int i = 0; i < N; i++){
             if(arr[i][0] > max){
                 max = arr[i][0];
             }

         }
        System.out.print(max);
    }
}
