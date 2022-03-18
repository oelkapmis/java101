/*
    https://app.patika.dev/moduller/java101/odev-fibo
    Java döngüler ile fibonacci serisi bulan program yazıyoruz.
    Fibonacci serisinin eleman sayısını kullanıcıdan alın.
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Fib(n) için 'n' değerini girin: ");
        int n = input.nextInt();

        int a = 0, b = 1, c;
        System.out.print("Fib(" + n + ") = 0 1 ");
        for(int i = 1; i < n; i++){
            c = a + b;
            System.out.print("" + c + " ");
            a = b;
            b = c;
        }
    }

}
