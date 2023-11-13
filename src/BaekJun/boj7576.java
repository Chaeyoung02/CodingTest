package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Tomato {
    int x;
    int y;

    public Tomato(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class boj7576 {
    static int M,N;
    static int[][] board;
    static boolean[][] check;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0 ,-1};
    static int max = 0;
    static Queue<Tomato> que = new LinkedList<>();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        board = new int[N][M];
        check = new boolean[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 1){
                    que.add(new Tomato(i, j));
                }
            }
        }

        BFS();

        max = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++) {
                if(board[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
                max = Math.max(board[i][j], max);

            }
        }
        System.out.println(max-1);

    }
    public static void BFS(){
        while(!que.isEmpty()){
            Tomato tomato = que.poll();

            for(int i = 0; i < 4; i++){
                int nx = tomato.x + dx[i];
                int ny = tomato.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >=M){
                    continue;
                }
                if(check[nx][ny] || board[nx][ny] != 0){
                    continue;
                }
                board[nx][ny]= board[tomato.x][tomato.y]+1;
                check[nx][ny] = true;
                que.add(new Tomato(nx, ny));
            }
        }
    }
}
