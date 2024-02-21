public class Decimal {


    public static void main(String[] args) {
        System.out.println(decimaltobinary(5));
        System.out.println(binarytodecimal(101));
    }

    static int decimaltobinary(int num){
        int result=0;
        int power=0;
        while(num>0){
            int digit=num%2;
            num/=2;
            result+=digit*Math.pow(10,power);
            power++;

        }
return result;
    }

    static int binarytodecimal(int num){
        int result=0;
        int power=0;
        while(num>0){
            int digit=num%10;
            num/=10;
            result+=digit*Math.pow(2,power);
            power++;

        }
        return result;
    }


}
