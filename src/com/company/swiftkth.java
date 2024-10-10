package com.company;

public class swiftkth {
    public static void main(String[] args) {
        int n=12345;
        int k=3;
        int nod=0;
        while (n>0){
            n/=10;
            nod++;
        }
        k=k%nod;
        if(k<0){
            k+=nod;
        }
        int div=1;
        int mult=1;
        for(int i=0;i<=nod;i++){
            if(i<=k){
                div*=10;
            }else{
                mult*=10;
            }

        }
        int qr=n/div;
        int rem=n%10;
        int resul=rem+mult+qr;
        System.out.println(resul);
    }
}
