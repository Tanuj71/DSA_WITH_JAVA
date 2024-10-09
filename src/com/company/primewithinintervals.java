package com.company;

public class primewithinintervals {


    public static void main(String[] args) {
        isPrime(51);
        primeIntervals(2,10);
    }

    public static void primeIntervals(int start,int end){
int cou=0;
for (int n=start;n<=end;n++){
    int count=0;
    for(int div=2;div*div<=n;div++){
        if(n%div == 0){
 count++;
            break;
        }
    }
    if(count == 0){
        cou++;
        System.out.println("PRIME"+n);
    }
}
        System.out.println(cou);
    }
    public static void isPrime(int n){
        if(n == 0 || n == 1){
            System.out.println("PRIME:->"+n);
            return;
        }
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                count++;
break;
            }

        }
        if(count == 0){
            System.out.println("PRIME");
        }else{
            System.out.println("NOT PRIME");
        }
    }
}
