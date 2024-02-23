package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

import java.util.StringTokenizer;

public class boj1021 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> que = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr= new int[M];
        int count = 0;


        for(int i = 1; i <= N; i++){
            que.add(i);
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++){
            int target = que.indexOf(arr[i]);

            int half;

            if(que.size() % 2 == 0){
                half = que.size() / 2 -1;
            }
            else {
                half = que.size() /2;
            }

            if(target <= half){
                for(int j = 0; j < target; j++){
                    int tmp = que.pollFirst();
                    que.offerLast(tmp);
                    count++;
                }
            }else {
                for(int j = 0; j < que.size() - target; j++){
                    int tmp = que.pollLast();
                    que.offerFirst(tmp);
                    count++;
                }
            }
            que.pollFirst();

        }
        System.out.println(count);



    }
}
