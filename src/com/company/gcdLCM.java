package com.company;

public class gcdLCM {
    public static void main(String[] args) {
        int n1=30,n2=24;
        int on1=n1,on2=n2;
        while (n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd=n2;
        int lcm=(on1*n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
