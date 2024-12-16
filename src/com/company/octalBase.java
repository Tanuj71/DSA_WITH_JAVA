package com.company;

import java.util.Scanner;

public class octalBase {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();

        System.out.println(octalBase(num,base));
    }

    static int octalBase(int n, int b) {
    int p=1;
        int rev = 0;
while (n>0){
    int dig=n%b;
    n/=b;
    rev+=dig*p;
    p*=10;

}
        return rev;
    }
}
