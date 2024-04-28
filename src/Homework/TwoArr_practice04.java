package Homework;

public class TwoArr_practice04 {
    public static void main(String[] args){
        String[][] str =  new String[][]{{"이", "까", "왔", "앞", "힘"}, {"차", " 지", "습", "으", "냅"}, {"원", "열", "니","로","시"}, {"배", "심", "다", "좀","다"}, {"열","히","!","더","!!"}};

        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[i].length; j++){
                System.out.print(str[j][i]+" ");
            }
        }
    }
}
