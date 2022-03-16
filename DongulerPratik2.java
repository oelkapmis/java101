/*
    https://app.patika.dev/moduller/java101/pratik-tek-sayi-toplam

    Ödev
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen
    değerlerden 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

import java.util.Scanner;

public class DongulerPratik2 {
    public static void main(String[] args) {

        int n, sum = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Bir sayi giriniz: ");
            n = input.nextInt();

            if(n % 4 == 0)
                sum += n;

        }while (n % 2 == 0);

        System.out.println("Toplam = " + sum);

    }
}
