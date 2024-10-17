package com.company;

public class diagonalPattern {
    public static void main(String[] args) {
        reversediagonal();
        int n=5;
        for (int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i == j){
                    System.out.print("*\t");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void reversediagonal(){
        int n=5;
        for (int i =1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if((i+j)== (n+1)){
                    System.out.print("*\t");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
