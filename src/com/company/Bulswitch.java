package com.company;

public class Bulswitch {
    public static void main(String[] args) {
        System.out.println(Bulb(10));
        bulb_switch(10);
    }
    public static int Bulb(int n){

        return (int)Math.sqrt(n);
    }
    public static void bulb_switch(int n){
        for (int i=0;i*i<=n;i++){
            System.out.println(i*i);
        }
    }

}
