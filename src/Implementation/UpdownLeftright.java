package Implementation;

import java.util.*;

public class UpdownLeftright {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String route = sc.nextLine().replaceAll(" ","");

        int x = 1, y = 1;

        for(char direction : route.toCharArray()) {
            switch (direction){
                case 'U':
                    x = (x - 1 < 1 ? x : x - 1);
                    break;
                case 'D':
                    x = (x + 1 > n ? x : x + 1);
                    break;
                case 'L':
                    y = (y - 1 < 1 ? y : y - 1);
                    break;
                case 'R':
                    y = (y + 1 > n ? y : y + 1);
                    break;
            }
        }
        System.out.println(String.format("result point = (%d, %d)", x, y));
    }
}
