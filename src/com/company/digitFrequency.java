package com.company;

import java.util.Scanner;

public class digitFrequency {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dig=sc.nextInt();
        int res=digitfreq(num,dig);
        System.out.println(res);
    }
    static int digitfreq(int n,int tar){
        int rev=0;
        while (n>0){
            int digit=n%10;
            n/=10;
            if(digit == tar){
                rev++;
            }

        }
        return rev;
    }
}
