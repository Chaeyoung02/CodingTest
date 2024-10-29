package Programmers_test;

import java.util.*;
//특이한 정렬
public class unusualArrangement {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numlist.length; i++){
            map.put(numlist[i], Math.abs(n - numlist[i]));
        }
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort((e1, e2) -> {
            int valueCompare = e1.getValue().compareTo(e2.getValue());
            if (valueCompare == 0) {
                return e2.getKey().compareTo(e1.getKey());
            }
            return valueCompare;
        });

        int[] answer = new int[entryList.size()];
        for (int i = 0; i < entryList.size(); i++) {
            answer[i] = entryList.get(i).getKey();
        }
        return answer;
    }
}
