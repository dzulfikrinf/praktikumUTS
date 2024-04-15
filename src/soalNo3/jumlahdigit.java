package soalNo3;
import java.util.Scanner;

public class jumlahdigit {
    public static int sumDigits(long n) {
        int total = 0;
        
        while (n != 0) {
            int digit = (int)(n % 10);
            total += digit;
            n /= 10;
        }
        
        return total;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        long bil = input.nextLong();
        
        int total = sumDigits(bil);
        
        System.out.println("Jumlah semua digit: " + total);
        
    }    
}
