import java.util.Scanner;

public class patternDiamond {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n/2;
        int st=1;
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            int c=val;
            for (int j=1;j<=st;j++){
                System.out.print(c+"\t");
                if(j<=st/2){
                    c++;
                }else{
                    c--;
                }

            }
            if(i<=n/2){
                sp--;
                st+=2;
                val++;
            }else{
                sp++;
                st-=2;
                val--;
            }
            System.out.println("\t");
        }

    }
}
