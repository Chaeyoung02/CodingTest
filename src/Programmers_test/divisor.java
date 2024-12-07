package Programmers_test;

import java.util.ArrayList;
import java.util.List;

public class divisor {
    public int[] solution(int n) {

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<= n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];
        int i = 0;
        for(int a : list){
            answer[i++] = a;
        }
        return answer;
    }
}
