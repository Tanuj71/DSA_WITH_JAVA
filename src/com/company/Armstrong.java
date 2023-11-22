package com.company;

public class Armstrong {


    public static void main(String[] args) {
        int num = 153;
        int compnum = num;
        int arm = 0;
        while (num > 0) {
            int d = num % 10;
            arm += (d * d * d);
            num = num / 10;
        }
        if (compnum == arm) {
            System.out.println("Success\n"+arm);
        } else {
            System.out.println("nothing");
        }

    }
}
