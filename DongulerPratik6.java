/*
    https://app.patika.dev/moduller/java101/pratik-armstrong-1
    Ödev
    Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
    Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */

import java.util.Scanner;

public class DongulerPratik6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        int total = 0;

        System.out.print("" + num + " sayısının basamakları toplamı = ");
        do{
            total += num % 10;
            num /= 10;

        }while(num > 0);
        System.out.println(total);
    }
}
