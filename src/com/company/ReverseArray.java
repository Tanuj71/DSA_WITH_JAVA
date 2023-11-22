package com.company;

public class ReverseArray {
    public static void main(String[] args) {
      int[] arr={10,20,30,40,50,60,70};
      int start=0;
      int end=arr.length-1;
      reverseArray(arr,start,end);
    }

    public static void reverseArray(int[] arr,int start,int end){
//swapping
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"->");
        }
    }

}
