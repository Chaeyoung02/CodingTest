package Programmers_test;

public class closestPost {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] str = s.split("");
        for (int i = str.length-1; i >= 0 ; i--) {
            answer[i] = -1;

            for (int j = i - 1; j >= 0; j--) {
                if (str[i].equals(str[j])) {
                    answer[i] = i - j;
                    break;
                }
            }
        }
        return answer;
    }
}
