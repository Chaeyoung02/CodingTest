class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.replace("A", "X").replace("B","A").replace("X","B");
        answer = str.contains(pat) ? 1 : 0;
        return answer;
    }
}
