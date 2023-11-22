package com.company;

public class RemoveEvenFromArray
{

    public static void main(String[] args) {
        int [] arr={10,5,8,0,6,4,11,15,13,14};
        int n=arr.length-1;
       remove(arr,n);
    }

    static void remove(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if((arr[i]&1)==0){
                count++;
            }
        }
        int even[]=new int[count];
       int ndx=0;
        for (int i=0;i<n;i++){
            if((arr[i]&1)==0){
                even[ndx++]=arr[i];
            }
        }
        for(int i=0;i<even.length;i++){
            System.out.println(even[i]);
        }

    }

}
