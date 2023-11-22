package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj1181 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            String text = br.readLine();
            str[i] = text;
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);

                }else {
                    return o1.length() - o2.length();
                }
            }
        });
        System.out.println(str[0]);
        for(int i = 1; i < n; i++){
            if(!str[i].equals(str[i-1])){
                System.out.println(str[i]);
            }

        }
    }

}
