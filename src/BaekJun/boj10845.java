package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj10845 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int last = 0;
        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    que.add(last);
                    break;
                case "pop":
                    if(que.isEmpty()){
                        sb.append(-1 + "\n");
                    }else {
                        sb.append((que.poll()) + "\n");
                    }
                    break;
                case "size":
                    sb.append((que.size()) + "\n");
                    break;
                case "empty":
                    if(que.isEmpty()){
                        sb.append(1 + "\n");
                    }
                    else {
                        sb.append(0+"\n");
                    }
                    break;
                case "front":
                    if(que.isEmpty()){
                        sb.append(-1 + "\n");
                    }
                    else {
                        sb.append((que.peek())+"\n");
                    }
                    break;
                case "back":
                    if(que.isEmpty()){
                        sb.append(-1 + "\n");
                    }
                    else {
                        sb.append ((last)+"\n");
                    }
                    break;
            }
        }
        System.out.print(sb);
    }
}
