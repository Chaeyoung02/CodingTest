package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1991 {
    static int N;
    static int[][] tree;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        tree = new int[26][2];
        //N의 개수를 26개까지
        //왼쪽 자식, 오른쪽 자식 개수 2개

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = st.nextToken().charAt(0)-'A';
            int childLeft = st.nextToken().charAt(0)-'A';
            int childRight = st.nextToken().charAt(0)-'A';
            //입력받은 알파벳에서 A의 값을 뺀것을 정수형으로 저장

            tree[parent][0] = (childLeft == -19)? -1 : childLeft;
            tree[parent][1] = (childRight == -19)? -1 : childRight;
            //왼쪽 자식이 .일 경우 -1값을 출력하고, 값이 있을 경우 왼쪽 자식 그대로 값 유지(오른쪽 자식도 동일)

        }

        preorder(0); //전위
        System.out.print("\n");
        inorder(0); //중위
        System.out.print("\n");
        postorder(0);//후위

    }
    public static void preorder(int x) { // 루트 -> 왼쪽 -> 오른쪽
       if(x == -1) {
          return;
       }
        System.out.print((char)(x+'A'));//루트먼저
       preorder(tree[x][0]);//왼쪽 자식들 싹 다 검사
       preorder(tree[x][1]);//오른쪽 자식들 싹 검사
    }
    public static void inorder(int x) {//왼쪽 -> 루트 -> 오른쪽
        if(x == -1){
            return;
        }
        inorder(tree[x][0]);
        System.out.print((char)(x+'A'));
        inorder(tree[x][1]);
    }
    public static void postorder(int x) {
        if(x == -1){
            return;
        }
        postorder(tree[x][0]);//왼쪽
        postorder(tree[x][1]);//오른쪽
        System.out.print((char)(x + 'A'));//루트

    }

}
