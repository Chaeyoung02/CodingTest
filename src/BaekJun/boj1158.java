package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class boj1158 {
    static Queue<Integer> que = new LinkedList<>();
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = 2;
        int current = 0;
        int n = Integer.parseInt(st.nextToken());

        int k = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= n; i++){
            que.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(que.size() != 1){
            for(int i = 0; i < k-1; i++){
                que.offer(que.poll());
            }
            sb.append(que.poll()+", ");

        }
        sb.append(que.poll()+">");
        System.out.print(sb);
    }

}
