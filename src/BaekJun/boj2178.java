//package BaekJun;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
////class Point {
////    int x;
////    int y;
////    int count;
////    public Point(int x, int y, int count){
////        this.x = x;
////        this.y = y;
////        this.count = count;
////
////    }
////}
//public class boj2178 {
//    static int[] dx = {1, 0, -1, 0};
//    static int[] dy = {0, 1, 0, -1};
//    static int n, m;
//    static int[][] board;
//    static int[][] value;
//    public static void BFS() {
//        Queue<Point> que = new LinkedList<>();
//        que.add(new Point(0,0,1));
//
//
//        while(!que.isEmpty()){
//            Point point = que.poll();
//            if(point.x == n && point.y == 0){
//                break;
//            }
//            for(int i = 0; i < 4; i++){
//                int nx = point.x + dx[i];
//                int ny = point.y + dy[i];
//
//                if(nx < 0 || ny < 0 || nx >= n || ny >=  m){
//                    continue;
//                }
//                else if(board[nx][ny] == 0){
//                    continue;
//                }else if(value[nx][ny] > point.count + 1){
//                    value[nx][ny] = point.count+1;
//                    que.add(new Point(nx, ny, point.count + 1));
//                }
//
//            }
//
//        }
//
//    }
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//
//        n = Integer.parseInt(st.nextToken());
//        m =Integer.parseInt(st.nextToken());
//
//        board = new int[n][m];
//        value = new int[n][m];
//
//        for(int i = 0; i < n; i++){
//            String tmp =  br.readLine();
//            for(int j = 0; j < tmp.length(); j++){
//                board[i][j] = Integer.parseInt(String.valueOf(tmp.charAt(j)));
//                value[i][j] = Integer.MAX_VALUE;
//            }
//        }
//
//        BFS();
//        System.out.println(value[n-1][m-1]);
//
//    }
//}