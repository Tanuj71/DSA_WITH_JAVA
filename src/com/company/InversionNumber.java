package com.company;

public class InversionNumber {

public static int inverseNum(int n){
    int op=1;
    int inv=0;
    while (n!=0){
        int d=n%10;
        int id=op;
        int ip=d;

        inv=inv+id*(int)Math.pow(10,ip-1);
        n/=10;
        op++;

    }

    return inv;
}
    public static void main(String[] args) {
        System.out.println(inverseNum(21453));
    }
}
