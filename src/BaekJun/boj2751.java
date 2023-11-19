package BaekJun;

import java.io.*;
import java.util.*;

public class boj2751 {
    static int[] A;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i< N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        for(int value: list){
            sb.append(value).append("\n");
        }
        System.out.println(sb);

    }
}
