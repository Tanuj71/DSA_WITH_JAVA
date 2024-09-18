package com.company;

public class minimumArray {

    public static void main(String[] args) {
        int[] arr={10,5,29,8,9,};
        int n=arr.length-1;
        System.out.println(min(arr,n));
    }

    public static int min(int[] arr,int n){

        int min=arr[0];
        for (int i = 1; i< n; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

}
