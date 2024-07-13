package Programmers_test;
public class deleteVowel {


        public String solution(String my_string) {
            String answer = my_string;
            String[] c = {"a", "e", "i", "o", "u"};
            for (String v : c) {
                answer = answer.replaceAll(v, "");
            }


            return answer;
        }


}