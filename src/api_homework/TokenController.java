package api_homework;


import java.util.StringTokenizer;
import java.util.concurrent.CountDownLatch;

public class TokenController {

    public TokenController() {}
    public String afterToken(String str) {

        StringTokenizer st = new StringTokenizer(str + " ");

        String token = "";
        while(st.hasMoreTokens()) {

            token += st.nextToken();

        }
        return token;


    }
    public String firstCap(String input) {
        String[] arr = input.split("");

        String str ="";
        str += arr[0].toUpperCase();
        for(int i = 1; i < arr.length; i++) {

            str += arr[i];
        }
        return str;


    }
    public int findChar(String input, char one) {

        int count = 0;
        for(int i = 0; i< input.length(); i++) {
            if(input.charAt(i) == one) {
                count++;
            }
        }
        return count;

    }

}
