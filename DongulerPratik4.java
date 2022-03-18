/*
    https://app.patika.dev/moduller/java101/pratik-faktoriyel
    Ödev
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
    n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

    Java ile kombinasyon hesaplayan program yazınız.

    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
 */

import java.util.Scanner;

public class DongulerPratik4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("C(n, r) için n değerini girin: ");
        int n = input.nextInt();
        System.out.print("C(n, r) için r değerini girin: ");
        int r = input.nextInt();

        int C = fact(n) / (fact(r) * fact(n-r));
        System.out.println("C(" + n + ", " + r + ") = " + C);
    }
    public static int fact(int n){
        int total = 1;

        for(int i = 2; i <= n; i++)
            total *= i;

        return total;
    }
}
