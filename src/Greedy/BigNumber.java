package Greedy;

import java.util.*;

public class BigNumber {
    public static void main(String[] args) {
        int N;
        int M;
        int K;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        Integer arr[] = new Integer[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr, Collections.reverseOrder());
        int result = 0;
        int count = 0;

        for(int i = 0; i < M; i++){
            if(count < K){
                result += arr[0];
                count++;
            }else {
                result += arr[1];
                count = 0;
            }
        }
        System.out.print(result);

    }
}

