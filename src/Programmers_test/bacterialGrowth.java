package Programmers_test;

public class bacterialGrowth {
    public int solution(int n, int t) {
        int answer = 0;
        while(t != 0){
            n *= 2;
            t--;
        }
        answer = n;
        return answer;
    }
}
