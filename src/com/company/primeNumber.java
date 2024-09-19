package com.company;

public class primeNumber {

static void primenumber(int num){
    int sqrt=(int)Math.sqrt(num);
    int counter=2;
    while (counter<=sqrt){
        if(num%counter == 0){
            System.out.println("Not a prime number.");
            return;
        }
        counter++;
    }
    System.out.println("prime number");
}
static void primenumberSecond(int num){
boolean flag=false;
    if(num == 0 || num == 1){
        System.out.println("prime number");
    }
    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            flag=true;
            break;
        }
    }
    if(!flag){
        System.out.println("prine");
    }else
        System.out.println("not");

}

    public static void main(String[] args) {
        primenumber(20);
        primenumberSecond(20);
    }
}
