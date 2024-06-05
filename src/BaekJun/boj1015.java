package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class boj1015 {
    //백준 추가하기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int[] a = new int[N];
        int[] b = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< N ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            b[i]=a[i];
        }
        Arrays.sort(b);

        for(int i = 0 ;  i <N; i++) {
            for(int j = 0 ; j < N; j++) {
                if(a[i] == b[j]) {
                    sb.append(j+ " ");
                    b[j] = -1;
                    break;
                }
            }
        }
        System.out.println(sb);

    }

}