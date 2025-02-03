import java.util.*;

public class boj7785 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = sc.next();
            String state = sc.next();	
            if(map.containsKey(name)){
                map.remove(name);

            }else {
                map.put(name, state);

            }
        }

        List<String> names = new ArrayList<>(map.keySet());
        names.sort(Collections.reverseOrder());
				// 내림차순 정렬하기
				
        for (String name : names) {
            System.out.println(name);
        }
  }
}
