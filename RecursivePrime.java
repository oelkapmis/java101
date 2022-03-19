//  https://app.patika.dev/moduller/java101/odev-recursive-prime

import java.util.Scanner;

public class RecursivePrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int num = scan.nextInt();

        if(isPrime(num, 2))
            System.out.println("Asal");
        else
            System.out.println("Asal değil");

    }

    private static boolean isPrime(int num, int divisor) {

        if(num < 2) return false;

        if(num % divisor == 0 && num != divisor) return false;
        else if(num % divisor == 0 && num == divisor) return true;

        return isPrime(num, divisor + 1);
    }
}
