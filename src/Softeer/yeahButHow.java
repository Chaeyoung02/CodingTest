package Softeer;

import java.io.*;
import java.util.*;

public class yeahButHow {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str = st.nextToken().toString();

        for(int i = 0; i< str.length()-1; i++){
            if(str.charAt(i) == '(' && str.charAt(i+1) == ')') {
                sb.append(str.charAt(i));
                sb.append(1);
            }else if(str.charAt(i) == ')'&& str.charAt(i+1) == '('){
                sb.append(str.charAt(i));
                sb.append("+");
            }

        }
        sb.append(str.charAt(str.length()-1));
        System.out.println(sb);
    }
}
