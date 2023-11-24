package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1068 {
    static int[] value;
    static boolean[] check;
    static int n, ans, root;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        value = new int[n];


        root = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            value[i] = Integer.parseInt(st.nextToken());
            if(value[i] == -1){
                root = i;
            }
        }

        int num = Integer.parseInt(br.readLine());
        delete(num);

        ans = 0;
        check = new boolean[n];

        dfs(root);
        System.out.print(ans);

    }
    public static void dfs(int num) {//루트부터
        check[num] =true;
        boolean isLeaf=true;

        if(value[num] != -2){ // 삭제된 부분이 나왔을경우를 의미
            for(int i = 0; i < n; i++){
                if(value[i] == num && !check[i]){//방문하지 않고 해당 값이 num값과 같다면, 다시 재귀한다.
                    dfs(i);
                    isLeaf = false;
                }

            }
            //재귀되지 않게 되면, ans 값을 증가
            if(isLeaf){
                ans++;
            }
        }
    }
    public static void delete(int num) {
        value[num] = -2; //삭제될 부분의 배열 자리에 -2 입력
        for(int i = 0; i < n; i++){ //삭제된 부모노드의 자식노드가 있다면 같이 삭제 재귀를 통해 끝까지 삭제
            if(value[i] == num){
                delete(i);
            }
        }
    }
}
