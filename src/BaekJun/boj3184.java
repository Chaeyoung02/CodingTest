package BaekJun;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj3184 {
    static int R, C;
    static char[][] board;
    static int sheep = 0, wolf = 0;
    static int answersheep = 0, answerwolf = 0;
    static boolean[][] check;
    static int nx, ny;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void DFS(int i , int j){
        check[i][j] = true;
        if(board[i][j] == 'v'){
            wolf++;
        }else if(board[i][j] == 'o'){
            sheep++;
        }

        for(int x = 0; x < 4; x++){
            nx = i + dx[x];
            ny = j + dy[x];
            if(nx < 0 || ny < 0 || nx >= R || ny >= C || check[nx][ny]){
                continue;
            }
            else if(board[i][j] == '#'){
                continue;
            }
            check[nx][ny] = true;
            DFS(nx, ny);
        }



    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        board = new char[R][C];
        check = new boolean[R][C];

        for(int i = 0; i < R; i++){
            String str = br.readLine();
            for(int j = 0; j < C; j++){
                board[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                if(!check[i][j] && (board[i][j] == 'v' || board[i][j] == 'o')){
                    sheep = wolf =0;
                    DFS(i,j);
                    if(sheep > wolf){
                        answersheep += sheep;
                    }else {
                        answerwolf += wolf;
                    }
                }
            }
        }
        System.out.print(answersheep + " " + answerwolf);


    }
}

