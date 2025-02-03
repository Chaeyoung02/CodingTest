import java.util.*;

public class boj1978 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int count = 0;
        for(int i = 0; i< n; i++){
            int x = sc.nextInt();
            
            for(int j = 2; j <= x; j++){
              if(j == x) {
                count++;
              }
              if(x % j == 0){
                break;
              }
            }
        }
        
        
        System.out.println(count);
  }
}
