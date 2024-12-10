package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true){
            String str = br.readLine();
            boolean check = true;
            for(int i = 0; i <str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-i-1)){
                    check = false;
                }
            }
            if(str.equals("0")){
                break;
            }
            if(check){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
