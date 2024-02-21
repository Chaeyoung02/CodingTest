package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1448 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];


        for(int i = 0; i < n; i++){
            arr[i]= Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i = n - 3; i >= 0; i--){
            if(arr[i] + arr[i+1] > arr[i+2]){
                System.out.println(arr[i]+arr[i+1]+arr[i+2]);
                return;
            }

        }
        System.out.println("-1");


    }
}
