package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1439 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();

        int count = 0;

        char word = str.charAt(0);

        for(int i = 0; i < str.length(); i++){
            if(word != str.charAt(i)){
                word = str.charAt(i);
                count++;
            }

        }
        System.out.println((count/2) + count %2 );
    }
}
