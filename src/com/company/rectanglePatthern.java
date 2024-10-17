package com.company;

import java.util.Scanner;

public class rectanglePatthern {
    public static void main(String[] args) {
        int n =5;
        hollow();
        for (int i=0;i<=n;i++){
            for (int j=1;j<=n;j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    public static void hollow(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col");
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <= col; j++)
                if((i==1 || i==col) || (j==1 || j==col))
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();

        }
    }
    }


