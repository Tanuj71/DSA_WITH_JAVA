package com.company;

public class permatutationFUnction {

    public static void main(String[] args) {
        int pnr=permatutation(5);
        int rpn=permatutation(5-3);
int npr=pnr/rpn;
        System.out.print(pnr+" "+"P"+" "+npr);
    }
    static int permatutation(int n){
        int rev=1;
        for (int i=1;i<=n;i++){
            rev=rev*i;
        }
        return rev;
    }

}
