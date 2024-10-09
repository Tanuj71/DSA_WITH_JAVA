package com.company;

public class ReverseNUmber {

    public static void main(String[] args) {
        revese(124555443);
    }
    public static void revese(int num){
        int rev=0;
     while (num>0){
         int d=num%10;
//         rev=rev*10+d;
         num=num/10;
         System.out.println(d);
     }

    }

}
