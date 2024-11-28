package Programmers_test;
import java.util.*;
public class codingTest01 {
    public static void main(String[] args){
        //문제 : 배열에서 연속된 값들은 중복을 제거
        int[] arr = {1, 1, 1, 0, 0, 3, 1};

        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        //첫 원소는 무조건 입력

        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){ //현재 원소와 전 인덱스의 원소가 같게 되면 현재 원소는 list에 추가가 되지 않는다
                //만약 그 전 원소와 현재 원소가 다르면 연속되지 않으므로, list에 추가
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
