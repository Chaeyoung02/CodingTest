package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1388{
    static boolean[][] visit;
    static int count =0;
    static char[][] arr;
    static int[] dx = {1, -1};
    static int[] dy = {1, -1};

    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[n][m];


        for(int i = 0; i < n; i++){
            char[] rows = br.readLine().toCharArray();
            for(int j = 0; j < m; j++){
                arr[i][j] = rows[j];
            }
        }

        visit = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(visit[i][j]){
                   continue;
                }
                else{
                    dfs(i,j);
                    count++;
                }


            }
        }
        System.out.println(count);



    }
    public static void dfs(int i, int j){
        visit[i][j] = true;

        for(int k = 0; k < 2; k++){
            int x;
            int y;
            if(arr[i][j] == '-'){
                x = i;
                y = j + dy[k];
            }else {
                x = i + dx[k];
                y = j;
            }

            if(x < 0 || y < 0 || x >= n || y >= m || visit[x][y]){
                continue;
            }
            if(arr[i][j] == arr[x][y]){
                dfs(x,y);
            }
        }




    }

}
