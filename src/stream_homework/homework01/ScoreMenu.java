package stream_homework.homework01;

import java.io.*;
import java.util.Scanner;

public class ScoreMenu {
    Scanner sc = new Scanner(System.in);

    ScoreController scr = new ScoreController();

    public void mainmenu() {
        while(true) {
            System.out.println("1. 성적 저장");
            System.out.println("2. 성적 출력");
            System.out.println("9. 끝내기 ");
            System.out.print("메뉴번호 :");
            int num = sc.nextInt();
            sc.nextLine();


            if(num == 1 || num == 2 || num == 9) {
                if(num ==1) {
                    saveScore();
                }else if(num ==2) {
                    readScore();
                }
                else {
                    System.out.println("프로그램을 종료합니다");
                    break;
                }
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                continue;
            }
        }
    }
    public void saveScore() {
        int num = 0;
        while(true) {
            System.out.print((num+1)+"번 째 학생 정보 기록");
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("국어 점수 : ");
            int kor = sc.nextInt();
            sc.nextLine();
            System.out.print("영어 점수 : ");
            int eng = sc.nextInt();
            sc.nextLine();
            System.out.print("수학 점수 : ");
            int math = sc.nextInt();
            sc.nextLine();


            System.out.print("그만 입력하시려면 N 또는 n 입력, 계속하시려면 아무 키나 입력하세요: ");
            String s = sc.nextLine();
            int sum = kor + eng + math;
            double avg = sum / 3;
            scr.saveScore(name, kor, eng, math, sum, avg);
            if(s.toUpperCase().equals("N")) {
                break;
            }
            else {
                num++;
                continue;

            }



        }
    }
    public void readScore(){
        int count = 0;
        int sumAll = 0;
        double avgAll = 0.0;


        try {
            DataInputStream dis = new DataInputStream(scr.readScore());

            while(true) {
                        String name = dis.readUTF();
                        int kor = dis.readInt();
                        int math = dis.readInt();
                        int eng = dis.readInt();
                        int sum = dis.readInt();
                        double avg = dis.readDouble();
                        count++;
                        sumAll += sum;
                        avgAll += avg;
                        System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg);

            }
        } catch (EOFException e) {
            System.out.println("읽은 회수\t전체 합계\t전체 평균");

            System.out.println(count+"\t"+sumAll+"\t"+avgAll/count);

        }
        catch (IOException e) {
           e.printStackTrace();
        }


    }
}
