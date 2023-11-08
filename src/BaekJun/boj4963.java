//package BaekJun;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//
//class Point {
//    int x;
//    int y;
//    public Point(int x, int y){
//        this.x = x;
//        this.y = y;
//      }
//}
//public class boj4963 {
//    static int w, h;
//    static int[][] board;
//    static int[] dx = {1, 0, -1, 0, 1, -1, 1, -1};
//    static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
//    static boolean[][] check;
//    static int nx, ny;
//
//
//    public static void BFS(int x, int y){
//        Queue<Point> que = new LinkedList<>();
//        que.add(new Point(x,y));
//        check[x][y] = true;
//
//
//         while(!que.isEmpty()){
//             Point point = que.poll();
//
//
//             for(int i = 0; i < 8; i++){
//                 int nx = point.x + dx[i];
//                 int ny = point.y + dy[i];
//
//                 if(nx < 0 || ny < 0 || nx >= h || ny >=  w){
//                     continue;
//                 }
//                if(check[nx][ny] || board[nx][ny] == 0){
//                     continue;
//                 }
//                 que.add(new Point(nx, ny));
//                 check[nx][ny] = true;
//
//             }
//         }
//
//
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//
//        while(true){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//
//            w = Integer.parseInt(st.nextToken());
//            h = Integer.parseInt(st.nextToken());
//
//            if(w == 0 && h == 0) break;
//            check = new boolean[h][w];
//            board = new int[h][w];
//
//            for (int i=0; i<h; i++) {
//                st = new StringTokenizer(br.readLine());
//                for (int j=0; j<w; j++) {
//                    board[i][j] = Integer.parseInt(st.nextToken());
//                }
//            }
//            int answer = 0;
//            for(int i = 0; i < h; i++){
//                for(int j = 0; j < w; j++) {
//                    if(!check[i][j] && board[i][j] == 1){
//                        BFS(i, j);
//                        answer++;
//                    }
//
//                }
//            }
//            System.out.println(answer);
//        }
//
//
//
//    }
//}
