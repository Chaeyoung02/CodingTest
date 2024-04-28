package com.exmethod.controller;

public class ExMethodController {
    public String text(String a){
        System.out.println(a);
        return a;
    }

    public void sum(){
        int sum =0;
        for(int i =1 ; i <=100; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public int num(int a){
        if(a % 2 ==0){
            System.out.println("짝수이다");

        }else {
            System.out.println("홀수이다");

        }
        return a;
    }

    public String english(String str){
        char[] c = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            c[i] = str.charAt(i);
        }
        int count= 0;
        for(int i = 0; i < str.length(); i++){
           if(c[i] >= 'A' && c[i] <='z'){
               count++;
           }
        }

        if(count >0) {
            System.out.println("영문자 있음");
        }else {
            System.out.println("영문자 없음");
        }
        return str;

    }

    public String check(String str, char c){
        char[] ch = new char[str.length()];
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            ch[i] = str.charAt(i);
        }
        for(int i = 0; i < str.length(); i++){
            if(ch[i] == c){
                count++;
            }
        }
        System.out.println(count);
        return (str);


    }
    public int num2(int a){
        int answer = 0;
        for(int i = 1; i <= 9; i++){
            answer = a*i;
            System.out.println(a + " * " + i + " = " +answer);
        }

        return answer;
    }

}
