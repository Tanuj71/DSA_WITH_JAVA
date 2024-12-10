package com.company;

import java.util.Scanner;

public class permutationPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int icj=1;
            for (int j=0;j<i;j++){
                System.out.print(icj+"\t");
                int jci=icj*(i-j)/(j+1);
                  icj=jci;
            }
            System.out.println("\t");
        }
    }
}
