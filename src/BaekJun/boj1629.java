package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1629 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(Pow(a,b,c) % c);

    }
    public static long Pow(long a, long b, long c) {
        if( b == 0) {
            return 1;
        }
        if( b == 1) {
            return a;
        }
        if( b % 2 == 1) {
            long x = Pow(a, b/2, c) % c;
            return (((x * x)  % c) * a) % c;
        }
        long x = Pow(a, b/2, c) % c;
        return (x * x) % c;
    }
}
