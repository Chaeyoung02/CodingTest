package BaekJun;

import java.util.Scanner;

public class boj24416 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        int[] arr = new int[n+1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i-1]+ arr[i-2];
        }
        sb.append(arr[n]).append(" ").append(n-2);
        System.out.print(sb);
    }

}
