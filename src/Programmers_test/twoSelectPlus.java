package Programmers_test;
import java.util.*;

public class twoSelectPlus {

    public int[] solution(int[] numbers) {

        Set<Integer> list = new HashSet<>();
        //중복 저장을 시키지 않기 위해 SET 사용

        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                list.add(sum);
            }
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int a : list){
            answer[idx++] = a;
        }
        Arrays.sort(answer);
        return answer;
    }
}
