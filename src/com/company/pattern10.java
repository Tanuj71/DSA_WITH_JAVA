package com.company;

public class pattern10 {
    public static void main(String[] args) {
        int n=8;
        int os=n/2;
        int is=-1;
        for(int i=0;i<=n;i++){
            for (int j=0;j<=os;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j=0;j<=is;j++){
                System.out.print("\t");
            }
            if(i>0&&i<n){
                System.out.println("*\t");
            }
            if(i<=n/2){
                os--;
                is+=2;
            }else{
                os++;
                is-=2;
            }
            System.out.println("\t");
        }
    }
}
