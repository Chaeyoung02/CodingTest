package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj14235 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a == 0){
                if(que.isEmpty()) {
                    sb.append(-1 + "\n");
                }else {
                    sb.append((que.poll()) + "\n");

                }
            }
            else{
                for(int j = 0; j < a; j++){
                    que.add(Integer.parseInt(st.nextToken()));
                }
            }


        }
       System.out.print(sb);
    }
}
