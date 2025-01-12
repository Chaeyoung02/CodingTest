package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[10];

            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            System.out.println(arr[7]);
        }
    }
}
