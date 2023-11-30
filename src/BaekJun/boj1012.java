package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class boj_1012 {
    int x;
    int y;
    public boj_1012(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class boj1012 {
    static int T, M, N, K;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(st.nextToken());



        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            visit = new boolean[N][M];

            for(int j = 0; j < K; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[y][x] = 1;
            }
            int count = 0;
            for(int j = 0; j < N; j++){
                for(int k = 0; k < M; k++){
                    if(!visit[j][k] && map[j][k] == 1){
                        count++;
                        BFS(k,j);
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);





    }
    public static void BFS(int x, int y){
        Queue<boj_1012> que = new LinkedList<>();
        que.add(new boj_1012(x, y));
        visit[y][x] = true;


        while(!que.isEmpty()){
            boj_1012 warm = que.poll();

            for(int i = 0; i < 4; i++) {
                int nx = warm.x + dx[i];
                int ny = warm.y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < M  && ny < N && !visit[ny][nx] && map[ny][nx] ==1){

                        que.add(new boj_1012(nx, ny));
                        visit[ny][nx] = true;


                }

            }

        }



    }
}
