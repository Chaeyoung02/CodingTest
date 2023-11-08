package BaekJun;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class boj1260 {
    static int N, M, V;
    static boolean[] visited;
    static int[][] arr;
    static Queue<Integer> que = new LinkedList<>();
    public static void DFS(int V) {
        visited[V] = true;
        System.out.print(V + " ");

        for(int i = 1; i <= N; i++){
            if(arr[V][i] == 1 && !visited[i]){
                DFS(i);
            }
        }
    }
    public static void BFS(int V) {
        que.add(V);

        visited[V] = true;

        while(!que.isEmpty()){
            V = que.poll();
            System.out.print(V + " ");
            for(int i = 1; i <= N; i++){
                if(arr[V][i] == 1 && !visited[i]){
                    que.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0; i < M; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] =  1;
        }

        DFS(V);
        System.out.println("");
        visited = new boolean[N+1];
        BFS(V);



    }
}
