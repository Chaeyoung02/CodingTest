package Homework;

public class TwoArr_practice05 {
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



    }
}
