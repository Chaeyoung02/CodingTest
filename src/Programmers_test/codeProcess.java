package Programmers_test;

public class codeProcess {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String[] str = code.split("");//문자열을 잘라서 배열에 저장

        for(int i = 0; i < str.length; i++)
        {
            if(str[i].equals("1")){
                mode = 1-mode;
            }
            else if(i % 2 == mode){
                answer += str[i];

            }else if(i % 2 == mode){
                answer += str[i];
            }
        }

        return "".equals(answer) ? "EMPTY" : answer;
    }
}
