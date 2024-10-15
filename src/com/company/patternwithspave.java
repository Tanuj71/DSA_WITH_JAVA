package com.company;

public class patternwithspave {

    public static void main(String[] args) {
        int n=5;
        reverse(n);
        for (int i=0;i<n;i++){
            for (int j=2*(n-i);j>=0;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ") ;
            }
            System.out.println();
        }
    }
    public static void reverse(int n){
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
