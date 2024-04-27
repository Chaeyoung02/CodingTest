package Homework;

import java.util.Scanner;

public class Arr_practice05 {
    public static void main(String[] args){
        String[] choiceStrings = {"가위", "바위", "보"};
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int win = 0;
        int lose = 0;
        int draw = 0;

        while(true){

            System.out.print("가위바위보 : ");
            String str = sc.next();

            int num = (int)Math.random() *3;
            if(str.equals("stop")){
                System.out.println(count + "전 " + win + "승 "+ draw +"무 " +lose + "패");
                break;
            }
            else {
                switch(num){
                    case 0:
                        System.out.println("컴퓨터 : " + choiceStrings[0]);
                        break;
                    case 1:
                        System.out.println("컴퓨터 : " + choiceStrings[1]);
                        break;
                    case 2:
                        System.out.println("컴퓨터 : " + choiceStrings[2]);
                        break;
                }
                System.out.println("김철수 : " + str);
                if(str.equals("가위") || str.equals("바위") || str.equals("보")){

                    if(str.equals(choiceStrings[num])){
                        System.out.println("비겼습니다.");
                        count++;
                        draw++;

                    }else if((str.equals("가위") && choiceStrings[num].equals("보"))|| (str.equals("바위") && choiceStrings[num].equals("가위")) || (str.equals("보") && choiceStrings[num].equals("바위"))){
                        count++;
                        win++;
                        System.out.println("이겼습니다");
                    }else {
                        lose++;
                        count++;
                        System.out.println("졌습니다.");
                    }
                }
                else {
                    System.out.println("잘못입력하셨습니다.");
                }



            }

        }
    }
}
