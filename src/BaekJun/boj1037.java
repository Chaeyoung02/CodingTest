package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1037 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int[] m = new int[num];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++){
            m[i]=Integer.parseInt(st.nextToken());




        }
        if(num == 1){
            System.out.print(m[0] * m[0]);
        }else{
            Arrays.sort(m);

            System.out.print(m[0] * m[num-1]);

        }

    }
}
