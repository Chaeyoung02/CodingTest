package Programmers_test;

public class KeyPadPush {
        public String solution(int[] numbers, String hand) {
            String answer = "";
            int left = 10;
            int right = 12;
            for (int a : numbers) {
                if (a == 1 || a == 4 || a== 7) {
                    answer += "L";
                    left = a;
                } else if (a == 3 || a == 6 || a == 9) {
                    answer += "R";
                    right = a;
                } else {

                    if (a == 0)
                        a = 11;

                    int leftLength = Math.abs(a - left) / 3 + Math.abs(a - left) % 3;
                    int rightLength = Math.abs(a - right) / 3 + Math.abs(a - right) % 3;

                    if (leftLength < rightLength) {
                        answer += "L";
                        left = a;

                    } else if (leftLength > rightLength) {
                        answer += "R";
                        right = a;

                    } else {

                        if (hand.equals("left")) {
                            answer += "L";
                            left = a;

                        } else {
                            answer += "R";
                            right = a;
                            right = a;
                        }
                    }
                }
            }

            return answer;
        }

}
