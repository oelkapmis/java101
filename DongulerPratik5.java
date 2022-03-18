/*
    https://app.patika.dev/moduller/java101/pratik-uslu-sayi
    Ödev
    Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */

import java.util.Scanner;

public class DongulerPratik5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini girin: ");
        int n = input.nextInt();
        System.out.print("Üs değerini girin: ");
        int k = input.nextInt();
        int total = 1;

        for(int i = 0; i < k; i++){
            total *= n;
        }
        System.out.println("" + n + " üzeri " + k + " = " + total);
    }
}
