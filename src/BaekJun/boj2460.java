package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[10][2];

        for(int i = 0; i < 10; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int sum = 0;
        int[] arr2 = new int[10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 2; j++){
                if(j == 1){
                    sum += arr[i][j];
                }else {
                    sum -= arr[i][j];
                }
            }
            arr2[i] = sum;
        }
        Arrays.sort(arr2);
        System.out.println(arr2[9]);
    }
}
