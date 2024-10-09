package com.company;

public class fibonici {

public static int fib(int n){
    if (n <= 1) {
        return n;
    }
    return fib(n-1)+fib(n-2);
}
//using loop
    public static void fibloop(int n){
    if(n<=1) {
        System.out.println(n);
    }
    int a=0,b=1;
    for(int i=0;i<=n;i++){
        System.out.println(a);
        int c=a+b;
        a=b;
        b=c;
    }
    }
    public static void main(String[] args) {
    int result=fib(15);
        System.out.println("fibonici:->"+result);
        fibloop(5);
    }
}
