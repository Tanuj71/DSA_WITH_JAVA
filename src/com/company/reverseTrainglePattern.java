package com.company;

public class reverseTrainglePattern {
    public static void main(String[] args) {
        int n=5;
        for (int i=5;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
