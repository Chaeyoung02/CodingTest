package Programmers_test;

import java.util.*;

public class codingTest02 {
    public static void main(String[] args){
        //문제 : mvp 찾기
        int[][] arr = {{2,1,1,1}, {3,1,1,3},{4,3,2,1},{2,3,4,3}};

        List<Integer> maxKeys = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            Map<Integer, Integer> map = new HashMap<>();

            for(int j = 0; j < arr[i].length; j++){
                //빈도수 구하기
                map.put(arr[i][j], map.getOrDefault(arr[i][j], 0)+1);//map에 key(선수번호)를 추가하고, value(같은 값이 없다면 0으로) +1 하여 지정
            }

            maxKeys.addAll(findMaxKeys(map));//mvp 찾는 메소드를 통해 값을 전달받아 리스트에 저장
        }

        //행마다 찾은 mvp 선수들 중 최종 mvp 찾기
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int key : maxKeys) {
            map2.put(key, map2.getOrDefault(key, 0) + 1);//저장된 리스트를 토대로 다시 map2에 빈도수 저장
        }

        //최종 mvp 선수 찾는 메소드 이용
        List<Integer> finalMaxKeys = findMaxKeys(map2);

        // 결과 출력
        System.out.println(finalMaxKeys);
    }

    //최다 mvp 선수를 고르기 위한 메소드
    public static  List<Integer> findMaxKeys(Map<Integer, Integer> map){
        List<Integer> result = new ArrayList<>();

        int maxFrequency = Collections.max(map.values()); //위에서 빈도수를 구하고 그 빈도수(value) 최대값을 구한다.

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                //구한 최대값과 map에 저장된 value 값이랑 같은 key 값을 저장(여러 개가 나올 수 있음)
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
