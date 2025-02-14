package com.company;

public class isEcludian {

    public static void main(String[] args) {
        System.out.println("GCD :->"+isGCD(24,36));
    }
    static int isGCD(int num1,int num2){
        while(num1 !=0 && num2!=0){
            if(num1>num2){
                num1-=num2;
            }else{
                num2-=num1;
            }
        }
        int res=num1;
        if(num1 == 0){
            res=num2;
        }
        return res;

    }

}
