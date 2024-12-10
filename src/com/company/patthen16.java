package com.company;

import java.util.Scanner;

public class patthen16 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=2*n-1;
        int st=1;
        for (int i=0;i<=n;i++){
            for (int j=0;j<st;j++){
                System.out.print("*\t");
            }
            for (int j=0;j<=sp;j++){
                System.out.print("\t");
            }
            for (int j=0;j<st;j++){
                System.out.print("*\t");
            }
            st++;
            sp-=2;
            System.out.println("");
        }
    }
}
