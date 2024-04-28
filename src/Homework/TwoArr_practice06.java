package Homework;

import java.util.Scanner;

public class TwoArr_practice06 {
    public static void main(String[] args){
        String[] str = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축","피풍표", "홍하하"};
        String[][] sit = new String[3][2];
        String[][] sit2 = new String[3][2];
        int count = 0;
        System.out.println("==1분단==");
        for(int i = 0; i < sit.length; i++){
            for(int j = 0; j < sit[i].length; j++){
                sit[i][j] = str[count];
                System.out.print(sit[i][j] +" ");
                count++;
            }
            System.out.println();
        }

        System.out.println("==2분단==");
        for(int i = 0; i < sit2.length; i++){
            for(int j = 0; j < sit2[i].length; j++){
                sit2[i][j] = str[count];
                count++;
                System.out.print(sit2[i][j] +" ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
         System.out.print("검색할 학생 이름을 입력하세요 : ");

         String search = sc.next();
        int row = 0, col = 0;
        String answer = "";
        String answer2 = "";
        String part = "";
        for(int i = 0; i < sit.length; i++){
            for(int j = 0; j < sit[i].length; j++) {

                if(search.equals(sit[i][j])) {
                    part ="1분단";
                    row = i + 1;
                    if (row == 1) {
                        answer = "첫번째";
                    } else if (row == 2) {
                        answer = "두번째";
                    } else {
                        answer = "세번째";
                    }
                    col = j + 1;
                    if (col % 2 == 0) {
                        answer2 = "오른쪽";
                    } else {
                        answer2 = "왼쪽";
                    }
                }else {
                    break;
                }
            }
        }


        for(int i = 0; i < sit2.length; i++){
            for(int j = 0; j < sit2[i].length; j++){
                if(search.equals(sit2[i][j])){
                    part="2분단";
                    row = i+1;
                    if(row == 1){
                        answer = "첫번째";
                    }else if(row ==2){
                        answer ="두번째";
                    }else {
                        answer = "세번째";
                    }
                    col = j+1;
                    if(col % 2 == 0){
                        answer2 ="오른쪽";
                    }
                    else {
                        answer2 = "왼쪽";
                    }
                }
            }

        }

        if(part =="2분단"){
            System.out.println("검색하신 "+search+" 학생은 " + "2분단 " + answer + "줄 " + answer2 + "에 있습니다.");
        }else {
            System.out.println("검색하신 " + search + " 학생은 " + "1분단 " + answer + "줄 " + answer2 + "에 있습니다.");
        }
    }
}
