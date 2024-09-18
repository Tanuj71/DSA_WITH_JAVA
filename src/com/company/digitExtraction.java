package com.company;

public class digitExtraction {

    public static void main(String[] args) {
      int num=12345;
      int digit=0;
      while (num>0){
          digit=num%10;
          num/=10;
          System.out.println("Digit extraction numbers:->"+digit);
      }

    }
}
