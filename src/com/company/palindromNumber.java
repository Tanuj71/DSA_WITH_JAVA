package com.company;

public class palindromNumber {

    public static void main(String[] args) {
palindrome(121);
    }

    static void palindrome(int num){
        int copynum=num;
        int reversedNum=0;
        int remainder=0;
        while(num!=0){
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        System.out.println((copynum == reversedNum) );
    }
}
