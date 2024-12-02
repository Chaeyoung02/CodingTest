package Programmers_test;

import java.util.Arrays;

public class kNum {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i< commands.length; i++){
            int a = commands[i][0]; //a번째부터
            int b = commands[i][1]; //b번째까지
            int c = commands[i][2];

            int[] result = new int[b - a + 1];
            int k = 0;
            for(int j = a; j <= b; j++){
                result[k++] = array[j-1];
            }
            Arrays.sort(result);
            answer[i] = result[c-1];

        }
        return answer;
    }
}
