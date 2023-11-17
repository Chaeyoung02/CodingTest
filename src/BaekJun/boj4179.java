package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class boj_4719 {
    int x;
    int y;
    int count;

    public boj_4719(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
    //지훈이와 불의 큐를 위해 따로 입력
    public boj_4719(int x, int y) {
        this.x = x;
        this.y = y;

    }
}

public class boj4179 {
    static int R, C, result = 0;
    static char[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static Queue<boj_4719> que = new LinkedList<>(); //불의 큐
    static Queue<boj_4719> que2 = new LinkedList<>(); //지훈이의 큐


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j);

                if (map[i][j] == 'J') { //map 요소 중 지훈이를 발견할 시에 지훈이 큐에 저장
                    que2.add(new boj_4719(i, j, 0));

                }
                if (map[i][j] == 'F') { //map 요소 중 불을 발견할 시에 불 큐에 저장
                    que.add(new boj_4719(i, j));

                }

            }
        }

        if(BFS())
            System.out.println(result);
        else
            System.out.println("IMPOSSIBLE");



    }
     public static boolean BFS() {
        while (!que2.isEmpty()) {
            int size = que.size();
            while (size > 0) {
                size--;
                boj_4719 fire = que.poll();

                for (int j = 0; j < 4; j++) {


                    int nx = fire.x + dx[j];
                    int ny = fire.y + dy[j];

                    if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
                        continue;
                    }
                    if ( map[nx][ny] == 'F' || map[nx][ny] == '#') {
                        continue;
                    }
                    map[nx][ny] = 'F';
                    que.add(new boj_4719(nx, ny));

                }

            }
            size = que2.size();
            while (size >0) {
                size--;
                boj_4719 fire = que2.poll();
                for (int j = 0; j < 4; j++) {

                    int nx = fire.x + dx[j];
                    int ny = fire.y + dy[j];

                    if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
                        result = fire.count + 1;
                        return true;
                    }
                    if (map[nx][ny] == '#' || map[nx][ny] == 'F' || map[nx][ny] == 'J' ) {
                       continue;
                    }

                    map[nx][ny] = 'J';
                    que2.add(new boj_4719(nx, ny, fire.count +1));

                }
            }


        }
        return false;
    }
}

