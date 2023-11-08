package Implementation;

import java.util.Scanner;

public class KingdomNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] c = str.toCharArray();

        int result = 0;
        int[][] array = {{2,1}, {2,-1}, {-2,1}, {-2,-1}, {1,2}, {1,-2}, {-1,2}, {-1,-2}};
        char[] x = {'a','b','c','d','e','f','g','h'};

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < x.length; j++){
                if(x[j] == c[0]){
                    int dx = j+array[i][0];
                    if(dx >= 0 && dx <= 8){
                        int dy = Character.getNumericValue(c[1])+array[i][1];
                        if(dy >= 1 && dy <= 8){
//                            System.out.println(dy);
                            result += 1;
                        }
                    }
                }
            }
        }
        System.out.println(result);


    }
}
