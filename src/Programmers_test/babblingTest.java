package Programmers_test;

public class babblingTest {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] check = {"aya", "ye", "woo", "ma"};

        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < check.length; j++){
                if(babbling[i].contains(check[j])){
                    babbling[i] = babbling[i].replace(check[j], " ");

                }
            }
            babbling[i] = babbling[i].replace(" ", "");
            if(babbling[i].equals("")) {
                answer++;
            }
        }
        return answer;
    }
}
