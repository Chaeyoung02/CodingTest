package Programmers_test;
import java.util.*;

public class numMultiple {
    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        for(int a : numlist){
            if(a % n == 0){
                list.add(a);
            }
        }
        return list;
    }
}
