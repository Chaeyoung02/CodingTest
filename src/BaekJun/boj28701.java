import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 1; i <= N; i++){
            a += i;
            b = a * a;
            c += i * i * i;
            
        }
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
    }
}
