package com.company;

public class patternNumber1 {
    public static void main(String[] args) {
        int n=5;
        int val=0;
        for (int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println("\t");
        }
    }
}
