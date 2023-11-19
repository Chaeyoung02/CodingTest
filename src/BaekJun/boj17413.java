package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class boj17413 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        boolean inout = false;
        String S = br.readLine();
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '<'){
                inout = true;
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                sb.append(S.charAt(i));
            }
            else if(S.charAt(i) == '>') {
                inout = false;
                sb.append(S.charAt(i));
            }
            else if(inout == true) {
                sb.append(S.charAt(i));
            }
            else if(inout == false){
                 if(S.charAt(i) == ' '){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(S.charAt(i));
                }
                else {
                    stack.push(S.charAt(i));
                }

             }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.print(sb);

    }
}
