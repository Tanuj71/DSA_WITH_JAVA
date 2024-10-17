package com.company;

public class ReversePatternSpace {

    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=0;i--){
            for (int j=0;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
