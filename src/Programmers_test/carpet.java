package Programmers_test;
public class carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int num = brown + yellow;
        int row = 0;
        int col = 0;
        int result =0 ;
        for(int i = 3; i < num ; i++){
            int j = num / i ;
            if(num % i ==0 && j >= 3 ){
                row = Math.max(i,j);
                col = Math.min(i,j);
                System.out.println(row+","+col);
                result = (row-2) * (col-2);
                if(result == yellow){
                    answer[0]=row;
                    answer[1]=col;
                }
            }
        }

        return answer;
    }
}