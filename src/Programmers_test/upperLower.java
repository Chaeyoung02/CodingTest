package Programmers_test;

public class upperLower {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        for(String item : str){
            if(item.equals(item.toUpperCase())){
                answer += item.toLowerCase();
            }else {
                answer += item.toUpperCase();
            }
        }
        return answer;


    }

}
