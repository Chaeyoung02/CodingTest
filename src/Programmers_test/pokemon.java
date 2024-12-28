package Programmers_test;

import java.util.HashSet;

public class pokemon {
    public int solution(int[] nums) {
        int n = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();

        for(int a : nums){
            set.add(a);
        }
        if(n >= set.size()){
            return set.size();
        }else {
            return n;
        }

    }
}
