package com.company;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();

        //easy method use to every one
        if(num%2 == 0){
            System.out.println("EVEN"+num);
        }else{
            System.out.println("ODD"+num);
        }

        //using bit wise
        if ((num&1)!=1){
            System.out.println("EVEN"+num);
        }else {
            System.out.println("ODD"+num);
        }
    }
}
