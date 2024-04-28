package Homework;

import java.util.Scanner;

public class Arr_practice06 {
    //nextLine() = 입력시 띄어쓰기로 인해 값을 분리하여 인식하지 않도록 한번에 입력 받을 수 있도록 적절히 사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str;
        String[] str1;


        System.out.print("배열의 크기를 입력하세요 : ");
        int size = sc.nextInt();
        sc.nextLine();
        str = new String[size];


        for(int i = 0; i < size; i++){
            System.out.print((i+1)+"번째 알고리즘: ");
            str[i] = sc.nextLine();
        }

        while(true){
            System.out.print("더 입력하겠습니까? :");
            String answer;
            answer = sc.next();


            if(answer.equals("y") || answer.equals("Y")) {
                System.out.print("더 입력하고 싶은 개수는 ? :");
                int more= sc.nextInt();
                sc.nextLine();
                str1 = new String[more+size];

                for (int i = 0; i < size; i++) {
                    str1[i] = str[i];
                }
                for(int i = 0; i < more ; i++){
                    System.out.print((size +i +1) +"번째 알고리즘: ");

                    str1[size + i] = sc.nextLine();
                }
                size = size+more;
                str = str1;
            }
            else if(answer.equals("N") || answer.equals("n")){
                break;
            }
            else {
                System.out.println("잘못 입력하셨습니다.");
            }


        }

        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }



    }
}
