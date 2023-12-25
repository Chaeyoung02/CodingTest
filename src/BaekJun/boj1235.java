package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class boj1235 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for(int i = 0; i < N; i++){
            str[i] = br.readLine();
        }

        HashSet<String> temp = new HashSet<>();

        for(int i = 1; i <= str[0].length(); i++){
            for(int j = 0; j < N; j++){
                temp.add(str[j].substring(str[0].length() - i));
            }
            if(temp.size() == N){
                System.out.println(i);
                return;
            }temp.clear();
        }

    }
}
