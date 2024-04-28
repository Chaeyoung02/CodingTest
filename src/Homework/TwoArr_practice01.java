package Homework;
public class TwoArr_practice01 {
    public static void main(String[] args){
        int[][] arr = new int[4][4];

        int count =1;
        for(int i = arr.length-1; i >=0 ; i--){
            for(int j =  arr.length-1 ; j >=0; j--){
                arr[i][j] = count;
                count++;
            }

        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
