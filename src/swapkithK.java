public class swapkithK {

    public static void main(String[] args) {
        int n = 12345;
        int temp = n;
        int k = 3;
        int nod = 0;

        // Calculate number of digits in n
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        // Handle cases where k is larger than the number of digits
        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }

        int div = (int)Math.pow(10, k);  // Dividing factor to split the number
        int mult = (int)Math.pow(10, nod - k);  // Multiplying factor for rearranging

        int qr = n / div;  // Quotient
        int rem = n % div;  // Remainder

        int result = rem * mult + qr;  // Rearrange the number after rotation
        System.out.println(result);
    }
}
