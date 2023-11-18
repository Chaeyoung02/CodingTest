package BaekJun;
import java.util.*;
import java.io.*;
public class boj25418 {
    static int a;
    static int k;
    static int[] arr;
    static boolean[] check;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[]{a, 0};
        check = new boolean[k + 1];

        Queue<int[]> que = new LinkedList<>();
        que.add(arr);
        while(!que.isEmpty()){
            int[] x = que.poll();
            if(x[0] == k){
                System.out.print(x[1]);
                return;
            }
            if(x[0] * 2 <= k){
                check[x[0] * 2]=true;
                que.add(new int[]{x[0] * 2, x[1] + 1});
            }
            if(!check[x[0] + 1]){
                check[x[0] + 1]=true;
                que.add(new int[]{x[0] + 1, x[1] + 1});
            }
        }

    }
}
