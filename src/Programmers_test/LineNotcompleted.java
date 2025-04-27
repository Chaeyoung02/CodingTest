import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant); //참여자 배열 정렬
        Arrays.sort(completion); //완주한 자 배열 정렬
        
        for(int i = 0; i < completion.length; i++) { 
            if(!participant[i].equals(completion[i])) { //정렬한 값에서 하나라도 빠지면 참여자가 도착한것이 아니게 됨
                answer = participant[i];
                return answer;
            }
        }
        
        return participant[participant.length - 1];
    }
}
