package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Point {
    int x;
    int y;
    int z;
    public Point (int z, int x, int y){
        this.z = z;
        this.x = x;
        this.y = y;


    }
}
public class boj7569 {
    static int N, M, H;
    static int[][][] board;
    static boolean[][][] check;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static Queue<Point> que = new LinkedList<>();

    //3차원 배열을 이용하여 탐색
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        board = new int[H][N][M];
        check = new boolean[H][N][M];


        //삼중 반복문을 통해서 지도안에 원하는 크기만큼의 배열을 입력
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    board[i][j][k] = Integer.parseInt(st.nextToken());
                    //만약 입력하는 도중 지도의 원소의 값이 1인 익은 토마토일 경우
                    if (board[i][j][k] == 1) {
                        que.add(new Point(i, j, k));
                        //익은 토마토일 경우 해당 i, j, k의 값을 queue에 추가
                        check[i][j][k] = true;
                    }
                }


            }

        }

        BFS();
        //만약 안익은 토마토가 있을 경우, -1를 출력
        //그렇지 않으면, Math.max()를 이용해 max값을 찾고 최종 max 값에서 -1를 해준다.
        int max = 0;
        for(int i = 0; i < H; i++){
            for(int j = 0; j < N; j++){
                for(int k = 0; k < M; k++){

                    if(board[i][j][k] == 0){
                        System.out.println(-1);
                        return;
                    }
                    System.out.println(max);
                    max = Math.max(board[i][j][k], max);

                }
            }

        }
        System.out.println(max-1);

    }
    static void BFS() {
        //while문을 통해 익은 토마토와 인접한 안익은 토마토의 익음을 확인하고 날짜를 카운트
        while (!que.isEmpty()) {
            Point point = que.poll();
            //상하좌우앞뒤까지 6가지의 방향을 고려
            for (int i = 0; i < 6; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                int nz = point.z + dz[i];

                if(nx < 0 || ny < 0 || nz < 0 || nx >= N || ny >= M || nz >= H || check[nz][nx][ny]){
                    continue;
                }
                if(board[nz][nx][ny] != 0){
                    continue;
                }
                board[nz][nx][ny] = board[point.z][point.x][point.y] + 1;
                check[nz][nx][ny] = true;
                que.add(new Point(nz, nx, ny));

            }


        }


    }

}