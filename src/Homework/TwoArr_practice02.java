package Homework;

public class TwoArr_practice02 {
    public static void main(String[] args){
        int[][] num = new int[4][4];

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j< num.length; j++){
                num[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j< num.length; j++){
               System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
