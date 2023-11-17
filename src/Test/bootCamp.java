package Test;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

class Island {
    int x;
    int y;

    public Island (int x, int y) {
        this.x = x;
        this.y = y;

    }
}
public class bootCamp {
    static int N;
    static int[][] map;
    static boolean[][] check;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static List<Integer> ans = new ArrayList<>();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int total = 0;

        map = new int[N][N];
        check = new boolean[N][N];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == 1 && !check[i][j]){
                    bfs(i, j);
                    total++;
                }
            }
        }

        System.out.println(total);
        Collections.sort(ans);
        for(int i : ans){
            System.out.print(i + " ");
        }

    }

    public static void bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));

        int count = 0;
        while(!queue.isEmpty()){
            Point cur = queue.poll();
            for(int i = 0; i < 4; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if(inboundAndNoVisited(nx, ny)){
                    check[nx][ny] = true;
                    queue.add(new Point(nx, ny));
                    count++;
                }
            }
        }
        ans.add(count);

    }

    public static boolean inboundAndNoVisited(int x, int y){
        if(x < 0 || y < 0 || x >= N || y >= N){
            return false;
        }else if(map[x][y] == 0){
            return false;
        }
        else{
            if(check[x][y]) {
                return false;
            }
            else
                return true;
        }
    }




    public static void BFS(int x, int y) {
        Queue<Island> que = new LinkedList<>();
        que.add(new Island(x,y));
        check[x][y] = true;


        while(!que.isEmpty()) {
            Island island = que.poll();

            for(int i = 0; i < 4; i++) {
                int nx = island.x + dx[i];
                int ny = island.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= N){
                    continue;
                }
                if(check[nx][ny] || map[nx][ny] == 0) {
                    continue;
                }


                que.add(new Island(nx, ny));
                map[nx][ny] = map[island.x][island.y] + 1;
                check[nx][ny]= true;

            }

        }

    }
}

