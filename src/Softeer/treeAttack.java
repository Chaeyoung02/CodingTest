package Softeer;

import java.io.*;
import java.util.*;

public class treeAttack {
    static int[][] map;
    static int count = 0;
    static int m;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        count = 0;
        st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        fuc1(l,r);

        st = new StringTokenizer(br.readLine());
        int l2 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        fuc1(l2,r2);

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(map[i][j] == 1)
                    count++;
            }
        }
        System.out.println(count);
    }

    public static void fuc1(int a, int b){
        for(int i = a-1; i < b; i++){
            for(int j = 0; j< m; j++){
                if(map[i][j] == 1){
                    map[i][j] = 0;
                    break;
                }
            }
        }
    }
}
