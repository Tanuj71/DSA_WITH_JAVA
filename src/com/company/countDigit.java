package com.company;

public class countDigit {

static void countdigit(int num){
    if(num==0){
        System.out.println(1);
        return;
    }
    int count=0;
    while(num>0){
        num/=10;
        count++;
    }
    System.out.println(count+"Digits");
}
    public static void main(String[] args) {
countdigit(123456);
    }
}
