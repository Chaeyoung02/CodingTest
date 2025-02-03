import java.util.*;

public class boj7785 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = sc.next();
            String state = sc.next();
						// 직원 이름과 출퇴근 상태를 위한 문자열 입력 받기
            if(map.containsKey(name)){
                map.remove(name);
                // 만약 기존 키값에 직원 이름이 있다면, 둘다 삭제 처리
            }else {
                map.put(name, state);
								// 없다면, 삽입
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
