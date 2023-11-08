//package BaekJun;
//
//import java.awt.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
////class Point {
////    int x;
////    int y;
////    int count;
////    public Point(int x, int y, int count) {
////        this.x = x;
////        this.y = y;
////        this.count = count;
////    }
////}
//public class First {
//    static int[] dx = {-1, 0, 1, 0};
//    static int[] dy = {0, 1, 0, -1};
//    static int[][] board;
//    static int[][] value;
//    static int n, m;
//    public static void BFS() {
//        Queue<Point> qu = new LinkedList<>();
//        qu.offer(new Point(0, 0, 1));
//
//        while(!qu.isEmpty()){
//            Point point = qu.poll();
//            board[point.x][point.y] = 0;
//            if(point.x == n && point.y == m)
//                break;
//
//            for(int i = 0; i < 4; i++){
//                int nx = point.x + dx[i];
//                int ny = point.y + dy[i];
//
//                if(nx < 0 || ny < 0 || nx >= n || ny >= m)
//                    continue;
//                if(board[nx][ny] == 0)
//                    continue;
//                if(value[nx][ny] > point.count + 1){
//                    value[nx][ny] = point.count + 1;
//                    qu.add(new Point(nx, ny, point.count + 1));
//                }
//            }
//
//        }
//    }
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//
//        board = new int[n][m];
//        value = new int[n][m];
//
//        for(int i = 0; i < n; i++){
//            String temp = br.readLine();
//            for(int j = 0; j < temp.length(); j++) {
//                board[i][j] = Integer.parseInt(String.valueOf(temp.charAt(j)));
//                value[i][j] = Integer.MAX_VALUE;
//            }
//        }
//
//        BFS();
//        System.out.println(value[n - 1][m - 1]);
//    }
//}
